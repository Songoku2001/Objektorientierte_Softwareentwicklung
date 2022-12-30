package WS2021.Java15_mit_Logik.Aufgabe4;

import java.util.function.Function;

public interface Logic{
  static record Var(String n) implements Logic{
     public String toString(){return n;}
  }
  static record Neg(Logic f) implements Logic{
     public String toString(){return "¬"+f;}
  }
  static record Implication(Logic l,Logic r) implements Logic{
     public String toString(){return "("+l+"→"+r+")";}
  }
  static record And(Logic l,Logic r) implements Logic{
     public String toString(){return "("+l+"∧"+r+")";}
  }
  static record Or(Logic l,Logic r) implements Logic{
     public String toString(){return "("+l+"∨"+r+")";}
  }

  default Logic everywhere(Function<Logic,Logic> f){
    var result = f.apply(this);
    if (result instanceof Neg n) return f.apply(new Neg(n.f.everywhere(f)));
    if (result instanceof Or n) return  f.apply(new Or(n.l.everywhere(f),n.r.everywhere(f)));
    if (result instanceof And n) return f.apply(new And(n.l.everywhere(f),n.r.everywhere(f)));
    if (result instanceof Implication n) return f.apply(new Implication(n.l.everywhere(f),n.r.everywhere(f)));
    if (result instanceof Var v) return v;
    throw new RuntimeException("unknown Logic class: "+this);
  }

  default Logic negationsInside(){
    return everywhere(x->x.moveTopLevelNegation());
  }

  default Logic moveTopLevelNegation(){
    if(this instanceof Neg NegOut){
      //!!A äußeren !
      if(NegOut.f instanceof Neg NegInner){ //!
        return NegInner.f;             //A
        //¬¬A wird zu A
      }
      if(NegOut.f instanceof Or m){
        return new And(new Neg(m.l), new Neg(m.r));
        //¬(A ∨ B) wird zu (¬A ∧ ¬B)
      }
      if(NegOut.f instanceof And m) {
        return new Or(new Neg(m.l), new Neg(m.r));
        //¬(A ∧ B) wird zu (¬A ∨ ¬B)
      }
     if(NegOut.f instanceof Implication m) {
       return new And(m.l, new Neg(m.r));
       //¬(A → B) wird zu (A ∧ ¬B)
     }
    }
    //nagations get transformed

    //all other formulae will stay unchanged.
    return this;
  }
  default Logic and(Logic that){return new And(this,that);}
  default Logic or(Logic that){return new Or(this,that);}
  default Logic implication(Logic that){return new Implication(this,that);}
  default Logic neg(){return new Neg(this);}

  public static void main(String[] args){
    /*Logic test = new Logic.Neg(new Logic.And(new Logic.Var("A"), new Logic.Var("B")));
    System.out.println(test);
    System.out.println(test.moveTopLevelNegation());*/
    Logic test3 = new Neg(new Neg(new Var("A")));
    System.out.println(test3);
    System.out.println(test3.moveTopLevelNegation());
  }
}
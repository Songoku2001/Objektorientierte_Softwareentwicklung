package WS2021.Java15_mit_Logik.Aufgabe5;

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
    throw new RuntimeException("unhandled Logic class: "+this);
  }

  default Logic distributive(){
    return everywhere(x->x.distributiveTopLevel());
  }

  default Logic distributiveTopLevel(){
    if(this instanceof Or o){
      if(o.l instanceof And a)
      return new And(new Or(a.l, o.r), new Or(a.r, o.r));// m=A^B n.r=A^B  n.l=C m.l=A m.r=B
      //C ∨ (A ∧ B) wird zu (C ∨ A) ∧ (C ∨ B)
      if(o.r instanceof And a){
        return new And(new Or(o.l, a.l), new Or(o.l, a.r));//m=A^B n.l=A^B n.r=C m.l=A m.r=B
      //(A ∧ B) ∨ C wird zu (A ∨ C) ∧ (B ∨ C)
      }
    }
    return this;
  }

  default Logic and(Logic that){return new And(this,that);}
  default Logic or(Logic that){return new Or(this,that);}
  default Logic implication(Logic that){return new Implication(this,that);}
  default Logic neg(){return new Neg(this);}

  public static void main (String[] args){
    Logic test = new Or(new And(new Var("A"), new Var("B")),new Var("C"));
    System.out.println(test.distributive());
    Logic test2 = new Or(new Var("C"),new And(new Var("A"),new Var("B")));
    System.out.println(test2.distributive());
    //C ∨ (A ∧ B) wird zu (C ∨ A) ∧ (C ∨ B)

  }
}
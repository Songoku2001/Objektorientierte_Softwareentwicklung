package WS2021.Java15_mit_Logik.Aufgabe3;

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

  default Logic everywhere(Function<Logic,Logic> func){
    var result = func.apply(this);
    if (result instanceof Neg n) return func.apply(new Neg(n.f.everywhere(func)));
    if (result instanceof Or or) return  func.apply(new Or(or.l.everywhere(func),or.r.everywhere(func)));
    if (result instanceof And and) return func.apply(new And(and.l.everywhere(func),and.r.everywhere(func)));
    if (result instanceof Implication impl) return func.apply(new Implication(impl.l.everywhere(func),impl.r.everywhere(func)));
    if (result instanceof Var var) return var;
    throw new RuntimeException("unhandled Logic class: "+this);
  }

  default Logic transformImplications(){
    return everywhere(x->x.replaceTopLevelImplication());
  }

  default Logic replaceTopLevelImplication(){
    if(this instanceof Implication m)
      return new Or(new Neg(m.l), m.r);
    //implications get replaced

    //all other formulae will stay unchanged.
    return this;
  }
  default Logic and(Logic that){return new And(this,that);}
  default Logic or(Logic that){return new Or(this,that);}
  default Logic implication(Logic that){return new Implication(this,that);}
  default Logic neg(){return new Neg(this);}

  public static void main (String[] args){
    Logic test = new Implication(new Var("A"), new Var("B"));
    System.out.println(test.transformImplications());
    //Logic test2 = new Logic.And(new Logic.Var("A"), new Logic.Var("B"));
    //System.out.println(test2.everywhere(Logic::transformImplications));
    Logic test3 = new Or(new Neg(new Var("A")), new Var("B"));
    System.out.println(test3.transformImplications());

  }
}
package WS2021.Java15_mit_Logik.Aufgabe2;

import java.util.Map;

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

  default Logic transformImplications(){
    if (this instanceof Var v) return v;
    if (this instanceof Neg n) return new Neg(n.f.transformImplications());
    if(this instanceof Implication i)
      return new Or(new Neg(i.l.transformImplications()), i.r.transformImplications());
    if(this instanceof Or or)
      return new Or(or.l.transformImplications(), or.r.transformImplications());
    if (this instanceof And a)
      return new And(a.l.transformImplications(), a.r.transformImplications());
    //(A → B) wird zu (¬A ∨ B)
    //TODO remaining cases

    throw new RuntimeException("unhandled Logic class case: "+this);
  }

  //utility function for easy creation
  default Logic and(Logic that){return new And(this,that);}
  default Logic or(Logic that){return new Or(this,that);}
  default Logic implication(Logic that){return new Implication(this,that);}
  default Logic neg(){return new Neg(this);}

  public static void main (String[] args){
    Logic test = new Implication(new Var("A"), new Var("B"));
    System.out.println(test);
  }

}
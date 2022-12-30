package WS2021.Java15_mit_Logik.Aufgabe1;

import java.util.Map;

public sealed interface Logic
  permits Logic.Var, Logic.Neg, Logic.Implication, Logic.And, Logic.Or{
  //Inner classes for different forms of formulae.
  static record Var(String n) implements Logic{}
  static record Neg(Logic f) implements Logic{}
  static record Implication(Logic l,Logic r) implements Logic{}
  static record And(Logic l,Logic r) implements Logic{}
  static record Or(Logic l,Logic r) implements Logic{}

  default boolean evaluate(Map<String,Boolean> interpretation){
    if(this instanceof Var v)
      return interpretation.get(v.n);
    if(this instanceof Or or)
      return or.l.evaluate(interpretation) || or.r.evaluate(interpretation);
    if(this instanceof  And and)
      return and.l.evaluate(interpretation) && and.r.evaluate(interpretation);
    if(this instanceof Neg neg)
      return !neg.f.evaluate(interpretation);
    if(this instanceof  Implication im)
      return !im.l.evaluate(interpretation) || im.r.evaluate(interpretation);
    throw new RuntimeException("unhandled Logic class case: "+this);
  }
}

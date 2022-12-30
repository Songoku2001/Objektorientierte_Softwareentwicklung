import Vorlesung.Logik.Logik.*;
import java.util.Map;

public sealed interface Logik
        permits Var, Neg, And, Or, XOr, Impl{

  default boolean eval(Map<String,Boolean> inter){
    return switch (this) {
      case Var v -> inter.get(v.name());
      case Neg neg -> !neg.f.eval(inter);
      case And and -> and.f1().eval(inter)&&and.f2().eval(inter);
      case Or or -> or.f1.eval(inter)||or.f2.eval(inter);
      case XOr or -> or.f1.eval(inter)!=or.f2.eval(inter);
      case Impl i -> !i.f1.eval(inter)||i.f2.eval(inter);
    };
  }

  record Var(String name) implements Logik{
    public String toString(){
      return name;
    }
  }
  record Neg(Logik f) implements Logik{}
  record And(Logik f1,Logik f2) implements Logik{
    public String toString(){
      return "("+f1+"âˆ§"+f2+")";
    }
  }
  record Or(Logik f1,Logik f2) implements Logik{}
  record XOr(Logik f1,Logik f2) implements Logik{}
  record Impl(Logik f1,Logik f2) implements Logik{
    public String toString(){
      return "("+f1+"â†’"+f2+")";
    }
  }

  static final Logik A = new Var("A");
  static final Logik B = new Var("B");
  static final Logik A_IMPL_B = new Impl(A,B);
  static final Logik A_IMPL_B_AND_A = new And(A_IMPL_B,A);
  static final Logik F1 = new Impl(A_IMPL_B_AND_A,B);
}
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.function.BinaryOperator;
import java.io.Reader;
import java.io.StringReader;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
public sealed interface Expr 
         permits Expr.Var, Expr.Num, Expr.OpEx, Expr.IfEx, Expr.AssignEx, 
                 Expr.Seq, Expr.WhileEx {
  enum Op{ 
    add((x,y)->x+y), 
    sub((x,y)->x-y), 
    mult((x,y)->x*y), 
    div((x,y)->x/y), 
    mod((x,y)->x%y);
    
    BinaryOperator<Long> f;
    Op(BinaryOperator<Long> f){this.f = f;}
  }

  record Var(String name) implements Expr{}
  record Num(long n) implements Expr{}
  record OpEx(Expr left,Op op,Expr right) implements Expr{}
  record IfEx(Expr cond,Expr alt1,Expr alt2) implements Expr{}
  record WhileEx(Expr cond,Expr body) implements Expr{}
  record AssignEx(String v, Expr e) implements Expr{}
  record Seq(List<Expr> es) implements Expr{}

  default void collectVars(Set<String> vs){  
    switch(this){
      case Var ve -> {vs.add(ve.name);}
      case AssignEx ae -> {
        vs.add(ae.v);
        ae.e.collectVars(vs);
      }
      case OpEx oe -> {
        oe.left.collectVars(vs);
        oe.right.collectVars(vs);
      }
      case IfEx ie -> {
        ie.cond.collectVars(vs);
        ie.alt1.collectVars(vs);
        ie.alt2.collectVars(vs);
      }
      case WhileEx we -> {
        we.cond.collectVars(vs);
        we.body.collectVars(vs);
      }
      case Seq el -> {for (var e:el.es) e.collectVars(vs);}
      case Num ne -> {}
    }
  }

  default Set<String> collectVars(){ 
    Set<String> result = new HashSet<String>();
    collectVars(result);
    return result;
  }

  default long eval(Map<String,Long> env){
    return switch(this){
      case Num num -> num.n;
      case Var v -> {
        System.out.println("looking for variable: "+v.name); 
        yield env.get(v.name);
      }
      case OpEx opEx -> opEx.op.f.apply(opEx.left.eval(env), opEx.right.eval(env));
      case IfEx ifEx -> ifEx.cond.eval(env) != 0L ? ifEx.alt1.eval(env) : ifEx.alt2.eval(env);
      case AssignEx assignEx -> {
        env.put(assignEx.v, assignEx.e.eval(env));
        yield env.get(assignEx.v);
      }
      case WhileEx whileEx -> {
        long res = 0;
        while (whileEx.cond.eval(env) != 0) {
          res = whileEx.body.eval(env);
        }
        yield res;
      }
      case Seq seq -> {
        long res = 0;
        for (var x : seq.es) {
          res = x.eval(env);
        }
        yield res;
      }

      default -> 0L; //TODO add all missing cases
    };
  }

  static Map<String, Long> eval(String skript) {
    var result = new HashMap<String,Long>();
    eval(new StringReader(skript),result);
    return result;
  }

  static void eval(Reader skript, Map<String, Long> env) {
    try {
      var lexer = new SimpleScriptLexer(CharStreams.fromReader(skript));
      var parser = new SimpleScriptParser(new CommonTokenStream(lexer));

      var antlrtree = parser.script();
      var tree = new BuildTree().visit(antlrtree);
      tree.eval(env);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String... args){
     for (var arg:args){
       try {
         var env = new HashMap<String,Long>();
         eval(new java.io.FileReader(arg),env);
         System.out.println(env);
       }catch(Exception e){
         e.printStackTrace();
       }  
     }
  }
}
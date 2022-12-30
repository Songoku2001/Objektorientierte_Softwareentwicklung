import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import static Expr.*;
import java.util.stream.Collectors;

public class BuildTree 
    extends AbstractParseTreeVisitor<Expr> 
    implements SimpleScriptVisitor<Expr> {
  @Override 
  public Expr visitScript(SimpleScriptParser.ScriptContext ctx) { 
    if (ctx.WHILE() != null) {
      return  new WhileEx(visit(ctx.script(0)), visit(ctx.script(1)));
    }else if (ctx.IF() != null) {
      return  new IfEx( visit(ctx.script(0))
                      , visit(ctx.script(1))
                      , visit(ctx.script(2)));
    }else if (ctx.LPAREN() != null) {
      return  visit(ctx.script(0));
    }else if (ctx.LBRACE() != null) {
      return new Seq(ctx.script()
                        .stream()
                        .map(s->visit(s))
                        .collect(Collectors.toList()));
    }else if (ctx.EQ() != null) {
      return new AssignEx(ctx.VARIABLE().getText(),visit(ctx.script(0)));
    }else if (ctx.VARIABLE() != null) {
      return new Var(ctx.VARIABLE().getText());
    }else if (ctx.NUMBER() != null) {
      return new Num(Long.parseLong(ctx.NUMBER().getText()));
    } else{
      var op = Op.add;
      if (ctx.SUB() != null) {
        op = Op.sub;
      }else if (ctx.DIV() != null) {
        op = Op.div;
      }else if (ctx.MULT() != null) {
        op = Op.mult;
      }else if (ctx.MOD() != null) {
        op = Op.mod;
      }
      return new OpEx(visit(ctx.script(0)),op,visit(ctx.script(1)));
    }
  }
}
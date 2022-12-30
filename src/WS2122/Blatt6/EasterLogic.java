import Date;

class EasterLogic extends ButtonLogic {

  @Override
  String getButtonLabel(){

    return "EasterLogic";
  }

  @Override
  String eval(String x){
    Date d = new Date(1, 1, Integer.parseInt(x));
    return d.easter() + "";
  }


  public static void main(String[] args){
    //new Dialogue(new EasterLogic());
    new ConsoleDialogue(new EasterLogic()).run();
  }
}
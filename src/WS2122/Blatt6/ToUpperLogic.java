class ToUpperLogic extends ButtonLogic {

  @Override
  public String getButtonLabel(){

    return "UpperCase";
  }

  @Override
  public String eval(String x){

    return x.toUpperCase();
  }


  public static void main(String[] args){
    //new Dialogue(new ToUpperLogic());
    new ConsoleDialogue(new ToUpperLogic()).run();
  }
}
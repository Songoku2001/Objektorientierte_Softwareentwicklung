class StringLengthLogic extends ButtonLogic {

  @Override
  public String getButtonLabel(){

    return "String Länge";
  }

  @Override
  public String eval(String x){

    return x.length() + "";
  }


  public static void main(String[] args){
    //new Dialogue(new StringLengthLogic());
    new ConsoleDialogue(new StringLengthLogic()).run();
  }
}
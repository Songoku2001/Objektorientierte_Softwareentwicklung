package WS2021.Array_und_Vererbung;

class StringLengthLogic extends ButtonLogic {

    @Override
    String getButtonLabel(){
        return "zeige die stellen";
    }

    @Override
    String eval(String x) {
        return String.valueOf(x.length());
    }

    public static void main(String[] args){
        new Dialogue(new StringLengthLogic());
        new ConsoleDialogue(new StringLengthLogic()).run();
    }
}
//Aufgabe2

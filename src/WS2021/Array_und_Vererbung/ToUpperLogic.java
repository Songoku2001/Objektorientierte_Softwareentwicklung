package WS2021.Array_und_Vererbung;

class ToUpperLogic extends ButtonLogic {

    @Override
    String getButtonLabel() {
        return "groß";
    }

    @Override
    String eval(String x) {
        return x.toUpperCase();
    }

    public static void main(String[] args) {
        new Dialogue(new ToUpperLogic());
        new ConsoleDialogue(new ToUpperLogic()).run();

    }

}
//Aufgabe1
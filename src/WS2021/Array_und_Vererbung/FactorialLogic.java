package WS2021.Array_und_Vererbung;

class FactorialLogic extends ButtonLogic {

    @Override
    String getButtonLabel() {
        return null;
    }

    @Override
    String eval(String x) {
        return String.valueOf(BigIntegerFactorial.factorial(Long.parseLong(x)));
    }
    public static void main(String[] args) {
        new Dialogue(new FactorialLogic());
        new ConsoleDialogue(new FactorialLogic()).run();
    }
}


package WS2021.Rekursion;

public class Num {
    //n is assumed to be a positive number
    final long n;

    Num(long n) {
        assert n >= 0;
        this.n = n;
    }

    String toBin() {
        String a = "";
        long nbruch = n;

        if (nbruch == 0) {
            return "0";
        }
        return new Num(nbruch / 2).toBin() + nbruch % 2 + a;
    }

    String toOct() {
        String a = "";                  //a+""+a+""+a+""="a"+"a"
        long nbruch = n;

        if (nbruch == 0) {                        //abbruch bedingung
            return "0";
        }
        return new Num(nbruch / 8).toOct() + nbruch % 8 + a;
    }

    String toBase(int b) {
        String a = "";
        long nbruch = n;

        if (nbruch == 0) {
            return "0";
        }
        return new Num(nbruch / b).toBase(b) + getDigit(nbruch % b) + a;
    }

    static char getDigit(long d) {
        return (char) (d < 10 ? '0' + d : 'A' + d - 10);
    }
}

package WS2021.Rekursion;

public class Heron {
    static double sqrt(double x) {
        assert x >= 0;
        return sqrt(x, (x + 1) / 2);
    }

    static double sqrt(double x, double approx) {
        double xw = 0;
        double a = approx;
        double y = 1;


        while (y != xw) {
        y = xw;
        xw = 0.5*(a + x/a);
        a = xw;
        }
        return xw;
    }
    public static void main(String[] args){
            System.out.println();
    }


}







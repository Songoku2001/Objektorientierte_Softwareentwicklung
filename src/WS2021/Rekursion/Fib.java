package WS2021.Rekursion;

public class Fib {
    long a = 0;
    long b = 1;

    /*
        static int fib(int n) {
            if (n <= 1) {
                return n;
            }

            n = fib(n - 2) + fib(n - 1);
            return n;
        }



        static long fib(int n) {
            double a = 1 + Math.sqrt(5);
            double b = a / 2;
            double c = Math.pow(b, n);

            double d = 1 - Math.sqrt(5);
            double e =  d / 2;
            double f = Math.pow(e, n);

            double g = c - f;

            double h = g / Math.sqrt(5);

            return (long) h;

        }

      */
    long nextFib() {
        long c;

        c = a;
        a = b;
        b = c + b;

        return c;

    }

    public static void main(String[] args) {
        Fib fib = new Fib();
        for (int i = 0; i <= 10; i = i + 1) {

            System.out.println(fib.nextFib());
        }
    }
}



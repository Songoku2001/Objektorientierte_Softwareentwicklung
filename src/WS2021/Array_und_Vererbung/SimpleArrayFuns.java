package WS2021.Array_und_Vererbung;

public final class SimpleArrayFuns {
    private SimpleArrayFuns() {
    }

    static boolean contains(int[] xs, int y) {
        int b = 0;

        if(xs.length==b)
            return false;

        for (int x = 0; x < xs.length; x++)
            if (y == xs[x])
        {
            return true;
        }
        {
            return false;
        }
    }

    static long sum(int[] xs) {
        long summe = 0;
        int b = 0;

        if(xs.length==b)
            return 0;
        for (long i : xs) {
           summe += i;
        }
        return summe;
    }

    static int avg(int[] xs) {
        int b = 0;

        if(xs.length==b)
            return 0;
        long arit= sum(xs)/xs.length;
        return (int) arit;
    }

    static boolean isSorted(int[] xs) {
        for (int i = 0; i < xs.length -1; i++) {

            for (int j = i + 1; j < xs.length; j++) {

                if (xs[j] < xs[i]) {
                    return false;
                }
            }
        }
        return true;
    }


    static int max(int[] xs) {
        int z = 0;

        if (xs.length == z) {
            return z = Integer.MIN_VALUE;
        }

        int max = xs[0];
        for (int i = 1; i < xs.length; i++) // -1 muss weg
            if (max < xs[i]) {
                max = xs[i];
            }
        return max;
    }
}
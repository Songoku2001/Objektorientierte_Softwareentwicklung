package WS2021.Rekursion;

import java.math.BigInteger;
public final class BigIntegerFactorial {

    private BigIntegerFactorial() {
    }

     public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;

        for(int i = 1; i<=n; i++)

        result = result.multiply(BigInteger.valueOf(i));

        return result;
    }
}

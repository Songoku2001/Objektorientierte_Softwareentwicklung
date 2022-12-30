package WS2122.Blatt4;

public class Euklid{
  public static long gcd(long a, long b){
    if (a == 0) return b;

    while(b != 0){
      long h = a%b;
      a = b;
      a = Math.abs(a);
      b = h;
    }
    return a;
  }
}
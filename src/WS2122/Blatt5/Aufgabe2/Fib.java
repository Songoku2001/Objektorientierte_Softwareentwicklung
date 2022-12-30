class Fib{
  static long fib(int n) {
    double left =  Math.pow(((1 + Math.sqrt(5)) /2), n);
    double right =  Math.pow(((1 - Math.sqrt(5)) /2), n);
    double bruch =  Math.sqrt(5);

    double zwischenergebnis = (left - right)/bruch;
    long result = (long) zwischenergebnis;

    return result;
  }

  public static void main(String[] args) {

    for (int i=0; i<5; i++){
      var x = fib(i);

      System.out.println(x);
    }
  }
}
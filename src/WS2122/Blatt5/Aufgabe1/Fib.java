package WS2122.Blatt5.Aufgabe1;

class Fib{
  static int fib(int n) {
    if (n <= 1){
      return n;
    }
    return fib(n -2) + fib(n -1);
  }

  public static void main(String[] args) {

    for (int i=0; i<5; i++) {
      int x = fib(i);
      System.out.println(x);
    }
  }
}
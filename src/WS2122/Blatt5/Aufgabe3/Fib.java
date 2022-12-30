class Fib{
  long first = 0;
  long second = 1;

  long nextFib(){
    //0, 1, 1, 2, 3, 5, 8, 13, 21

    long speicher = first;      //speicher = 0    -> 1     -> 1     ->...
    first = second;             //first = 1       -> 1     -> 2     ->...
    second = first + speicher;  //second = 0+1=1  -> 1+1=2 -> 1+2=3 ->...

    //System.out.println("Speicher " + speicher + " first " + first + " second " +  second);

    return speicher;
  }

  public static void main(String[] args){
    Fib fib = new Fib();
    for (int i=0;i <= 10; i = i+1){
      System.out.println(fib.nextFib());
    }
  }
}
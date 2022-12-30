class Apfel extends Object{
  int gewicht;
  String sorte;
  boolean bio;
  Apfel(String sorte){
    this(120,sorte,false);
  }
  Apfel(int gewicht, String sorte,  boolean bio){
    this.gewicht = gewicht;
    this.sorte = sorte;
    this.bio = bio;
  }
  @Override
  public String toString(){
    return "Apfel der Sorte â€º"+sorte+"â€¹ mit "+gewicht+"g.";
  }
  boolean gleich(Apfel that){
    return this.gewicht == that.gewicht
            && this.bio==that.bio;
  }
  @Override
  public boolean equals(Object obj){
    //java 1 bis 15
    //if (obj instanceof Apfel){
    //  Apfel that = (Apfel)obj;

    // oder auch
    //if (obj.getClass().equals( Apfel.class)){
    //  Apfel that = (Apfel)obj;

    //ab java 16
    if (obj instanceof Apfel that){
      return this.gewicht == that.gewicht
              //never ever use == on String Objects
              //&& this.sorte == that.sorte
              //for non primitive i.e. reference types use equals
              && this.sorte.equals(that.sorte)
              && this.bio==that.bio;
    }
    return false;
  }
  public static void main(String... args){
    var a1 = new Apfel("Boskop".toUpperCase());
    var a2 = new Apfel("Boskop".toUpperCase());
    var a3 = new Apfel("Gravensteiner");
    System.out.println("a1==a2 ? "+(a1==a2));
    System.out.println("a1==a3 ? "+(a1==a3));
    System.out.println("a1==a1 ? "+(a1==a1));

    System.out.println("a1.gleich(a2) ? "+(a1.gleich(a2)));
    System.out.println(a1+".equals("+a2+") ? "+(a1.equals(a2)));
    System.out.println("a1.equals(a1) ? "+(a1.equals(a1)));
    System.out.println("a1.equals(\"str\") ? "+(a1.equals("str")));

  }
}
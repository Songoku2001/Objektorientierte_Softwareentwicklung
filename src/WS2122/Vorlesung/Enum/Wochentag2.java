enum Wochentag2 {
  mon(false, 1),
  die(false, 2),
  mit(false, 3),
  don(false, 4),
  fre(false, 5),
  sab(true, 6),
  son(true, 7);

  final boolean istWochenende;
  final int tagnummer;
  Wochentag2(boolean istWochenende, int tagnummer){
    this.istWochenende = istWochenende;
    this.tagnummer = tagnummer;
  }

  boolean istAnfangDerWoche(){
    return switch (this){
      case mon -> true;
      case die -> true;
      default  -> false;
    };
  }

  public static void main(String[] args) {
    Wochentag2 mittwoch = Wochentag2.mit;

    boolean bool = mittwoch.istAnfangDerWoche();
    System.out.println(bool);

    System.out.println(mittwoch.istWochenende);
    System.out.println(mittwoch);
  }
}


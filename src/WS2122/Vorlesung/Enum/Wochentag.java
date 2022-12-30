enum Wochentag{
  mon(false),
  die(false),
  mit(false),
  don(false),
  fre(false),
  sab(true),
  son(true);

  final boolean istWochenende;
  Wochentag(boolean istWochenende){
    this.istWochenende = istWochenende;
  }

  boolean istAnfangDerWoche(){
    return switch (this){
      case mon -> true;
      case die -> true;
      default  -> false;
    };
  }

  public static void main(String[] args) {
    Wochentag mittwoch = Wochentag.mit;

    var bool = mittwoch.istAnfangDerWoche();
    System.out.println(bool);

    System.out.println(mittwoch.istWochenende);
  }
}


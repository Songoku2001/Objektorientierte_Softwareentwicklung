package WS2122.Blatt4;

class Ratio{
  long zaehler;
  long nenner;

  Ratio(long zaehler, long nenner){
    this.zaehler = zaehler;
    this.nenner = nenner;
    this.kuerzen();
  }
  public String toString(){
    long ganzzahl = zaehler/nenner;
    long newzaehler = zaehler%nenner;
    String result;
    if (ganzzahl == 0) {
      result = "";
    }
    else {
      result = ganzzahl + "";
    }
    return result+"\\frac{"+newzaehler+"}{"+nenner+"}";
  }
  public void kuerzen(){
    long faktor = Euklid.gcd(zaehler, nenner);
    zaehler = zaehler/faktor;
    nenner = nenner/faktor;
    if (nenner<0){
      zaehler = -zaehler;
      nenner = -nenner;
    }
  }

  Ratio mult(Ratio that){
    return new Ratio(this.zaehler * that.zaehler, this.nenner * that.nenner);
  }

  Ratio div(Ratio that){
    return new Ratio(this.zaehler * that.nenner, that.zaehler * this.nenner);
  }

  Ratio add(Ratio that){
    if (this.nenner == that.nenner){
      return new Ratio(this.zaehler+that.zaehler, this.nenner);
    }
    return new Ratio(this.zaehler*that.nenner + that.zaehler*this.nenner, this.nenner*that.nenner);
  }
  double toDouble(){
    return (double) zaehler/nenner;
  }
  public static void main(String... args){
    Ratio a = new Ratio(2, 6);
    Ratio b = new Ratio(1, 7);

    double x = a.toDouble();
    var test = a.mult(b);
    System.out.println(test);
  }
}
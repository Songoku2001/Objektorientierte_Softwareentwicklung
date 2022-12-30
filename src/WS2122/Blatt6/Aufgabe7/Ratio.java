import Euklid;

class Ratio{
  long zaehler;
  long nenner;

  Ratio(long zaehler, long nenner){
    this.zaehler = zaehler;
    this.nenner = nenner;
    kuerzen();
  }
  public String toString(){
    var ganzzahl = zaehler/nenner;
    var rest = zaehler%nenner;
    var result = ganzzahl==0?"":(ganzzahl+"");
    return result+(rest>0?"\\frac{"+rest+"}{"+nenner+"}":"");
  }
  public void kuerzen(){
    var gcd = Euklid.gcd(zaehler,nenner);
    zaehler = zaehler/gcd;
    nenner = nenner/gcd;
    if (nenner <0 ){
      nenner = -nenner;
      zaehler = -zaehler;
    }
  }  
  Ratio mult(Ratio that){
    return new Ratio(this.zaehler*that.zaehler,this.nenner*that.nenner);
  }

  Ratio div(Ratio that){
    return mult(new Ratio(that.nenner,that.zaehler));
  }
    
  Ratio add(Ratio that){
    return new Ratio(this.zaehler*that.nenner+that.zaehler*this.nenner,this.nenner*that.nenner);
  }
  Ratio sub(Ratio that){
    return new Ratio(this.zaehler*that.nenner-that.zaehler*this.nenner,this.nenner*that.nenner);
  }
    
  double toDouble(){
    return (double)zaehler/nenner;
  }

  boolean lt(Ratio that){

    return this.toDouble() < that.toDouble();
  }
  Ratio sqrt() {
    assert !lt(new Ratio(0,1)):"Wurzel auf negative Zahl";
    return sqrt( add(new Ratio(1,1)).div(new Ratio(2,1) )) ;
  }
  Ratio sqrt(Ratio approx) { //  0.24   // 1.67  // 3

    double aseite = approx.toDouble();
    double bseite = this.toDouble() / aseite;
    double abweichung = Math.pow(10, -10);


    while ((aseite - bseite) > abweichung) {
      aseite = (aseite + bseite) / 2;
      bseite = (this.toDouble() / aseite);
    }

    Ratio erg = new Ratio(0, 1);

    while ((long) aseite != aseite) {
      aseite *= 10;
      erg.nenner *= 10;
    }
    erg.zaehler = (long) aseite;

    return erg;
  }

  public static void main(String[] args) {

    Ratio aprox = new Ratio(4, 1);

    System.out.println(aprox.sqrt());

  }
}
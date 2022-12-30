import java.math.BigDecimal;
import  java.math.BigInteger;

class Rational{
  BigInteger zaehler;
  BigInteger nenner;

  Rational(BigInteger zaehler, BigInteger nenner){
    this.zaehler = zaehler;
    this.nenner = nenner;
    kuerzen();
  }
  public String toString(){
    var ganzzahl = zaehler.divide(nenner);
    var rest = zaehler.remainder(nenner);
    var result = ganzzahl.equals(BigInteger.ZERO)?"":(ganzzahl+"");
    return result+(rest.equals(BigInteger.ZERO)?"":"\\frac{"+rest+"}{"+nenner+"}");

  }

  @Override public boolean equals(Object other){
    //TODO
    if(other instanceof Rational that){
      return this.zaehler.equals(that.zaehler) && this.nenner.equals(that.nenner);
    }
    return false;
  }
  
  public void kuerzen(){
    var gcd = zaehler.gcd(nenner);
    zaehler = zaehler.divide(gcd);
    nenner = nenner.divide(gcd);
    if (nenner.compareTo(BigInteger.ZERO) < 0 ){
      nenner = nenner.negate();
      zaehler = zaehler.negate();
    }
  }  
  Rational mult(Rational that){
    //TODO
    return new Rational(this.zaehler.multiply(that.zaehler), this.nenner.multiply(that.nenner));
  }

  Rational div(Rational that){
    //TODO
    return new Rational(this.zaehler.multiply(that.nenner), this.nenner.multiply(that.zaehler));
  }
    
  Rational add(Rational that){
    //TODO
    return new Rational(this.zaehler.multiply(that.nenner).add(that.zaehler.multiply(this.nenner)), this.nenner.multiply(that.nenner));
  }
  Rational sub(Rational that){
    //TODO
    //return new Ratio(this.zaehler*that.nenner-that.zaehler*this.nenner,this.nenner*that.nenner);
    return new Rational((this.zaehler.multiply(that.nenner)).subtract(that.zaehler.multiply(this.nenner))
            ,this.nenner.multiply(that.nenner)
    );
  }
    
  double toDouble(){
    //TODO
    return this.zaehler.doubleValue() / this.nenner.doubleValue();
  }

  boolean lt(Rational that){
    //TODO
    return this.toDouble() < that.toDouble();
  }
  Rational betrag(){
    //TODO
//    if (this.zaehler.doubleValue() < 0){
//      this.zaehler = this.zaehler.negate();
//    }
//    if (this.nenner.doubleValue() < 0){
//      this.nenner = this.nenner.negate();
//    }
//    return new Rational((this.zaehler), (this.nenner));

    return new Rational(this.zaehler.abs(), this.nenner);
  }
  Rational sqrt() {
    assert !lt(new Rational(BigInteger.ZERO,BigInteger.ONE)):"Wurzel auf negative Zahl";
    return this.sqrt(this.add(new Rational(BigInteger.ONE,BigInteger.ONE)).div(new Rational(BigInteger.TWO,BigInteger.ONE) ));
  }


  Rational sqrt(Rational approx) {
      //TODO
    double div = 1.0;
    double xn = approx.toDouble();
    double a = toDouble();

    while(div > Math.pow(10, -10)) {
      xn = 0.5 * (xn + (a / xn));
      div = a - xn * xn;
      if(div < 0) {
        div *= -1;
      }
    }

    Rational b = new Rational(BigInteger.ZERO, BigInteger.ONE);

    while((long)xn != xn) {
      xn*=10;
      b.nenner = b.nenner.multiply(BigInteger.TEN);
    }

    b.zaehler = BigDecimal.valueOf(xn).toBigInteger();

    return b;

//    while (new Rational(BigInteger.ONE, new BigInteger("100000000")).lt(approx.mult(approx).sub(this.betrag()))){
//      approx = approx.mult(approx).add(this).div(approx.mult(new Rational(BigInteger.TWO, BigInteger.ONE)));
//    }
//
//    return approx;

  }
  
  public static void main(String... args){
    Rational d = new Rational(BigInteger.TWO,BigInteger.ONE);
    System.out.println(d.sqrt().toDouble());
    d = new Rational(new BigInteger("4"),BigInteger.ONE);
    System.out.println(d.sqrt().toDouble());
    d = new Rational(new BigInteger("9"),BigInteger.ONE);
    System.out.println(d.sqrt().toDouble());
    d = new Rational(new BigInteger("25"),BigInteger.ONE);
    System.out.println(d.sqrt().toDouble());
  }
}
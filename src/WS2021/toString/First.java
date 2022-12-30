package WS2021.toString;

class First{
    static int fortyTwo(){
        return 42; //Der Wert 42 soll zurück gegeben werden
    }
    static boolean isFortyTwo(int i){
        return i==42; //int i wird der 42 zugewiesen vergleich zwischen 2 werten
    }
    static int twice(int i){
        return (i+i); //Die Zahl 42 verdoppeln
    }
    static boolean isOdd(int i){
        return (i%2) !=0; //!= ungleich
    }
    static int century(int i){
        return (i/100); //i wird durch 100 geteilt restwert entfällt
    }
    static int lastTwoDigits(int i){
        return (i%100); //mit dem %(Modulo) lässt sich der restwert anzeigen
    }
    static double arithmeticMean(int x, int y){
        return (x+y)/2.0; //arithmetischer Mittel (Durchschnitt)
    }
}

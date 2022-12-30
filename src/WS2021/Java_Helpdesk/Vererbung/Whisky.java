package WS2021.Java_Helpdesk.Vererbung;

public class Whisky extends Flasche {

    private String sAlkohol;

    //Konstruktor der erbenden Klasse inklusive super-Konstruktor
        // Note: Bis auf Überladung werden immer alle Attribute und Methoden vererbt!
    public Whisky(String sM, float fM, String sN, String sA){
        super(sM, fM, sN);  //Ermöglicht den Zugriff auf Attribute der parent-klasse
        this.sAlkohol = sA;
    }

    @Override
    //Überschriebene setter-Methode mit Eingabebeschränkung
    public void setsName(String sName) {
        //wenn Name nicht "Talisker", dann nicht überschreiben
        if (sName.equals("Talisker")){  //equals vergleich ÄHNLICH zu == zwei Werte - equals nur für Strings
             super.setsName(sName);
        } else {
                //err schreibt in rot und lässt sich in Logs finden
             System.err.println("Ungültige Eingabe!");
        }
    }

    //Umschreiben der toString-Methode. Anpassung auf die eigenen Objekte
    public String toString() {
        return "Name: " + getsName() + "\nMaterial: " + getsMaterial()
                + "\nFüllmenge: " + getfMenge();
    }

    public static void main(String[] args) {
            //Anlegen eines neuen Objekts des Typ Whisky, das von Flasche erbt
        Whisky whisky1 = new Whisky("Glas", 0.7f, "Jacky", "40%");
        //System.out.println(whisky1.toString());
            //Änderung eines Attributs durch set-Methode
        whisky1.setsMaterial("Plastik");
        //System.out.println(whisky1.toString());
            //Änderung des bestehenden Wertes durch Überschreibung
        whisky1.setfMenge(whisky1.getfMenge()*2);
            //Ausgabe des Strings durch get-Methodenaufruf
        System.out.println(whisky1.getsName());
        whisky1.setsName("Talisker");
        System.out.println(whisky1.getsName());
    }
}
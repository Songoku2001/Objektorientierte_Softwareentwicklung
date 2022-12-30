package WS2021.Java_Helpdesk.Vererbung;

public class Flasche {

    //Attribute - Eigenschaften des Objekts
     private String sMaterial;
     private float fMenge;
     private String sName;

    //Konstruktor - Ermöglicht die Interaktion mit den Attributen des Objekts
        /* Alle für die Vererbung an andere Klassen benötigten Attribute
        müssen hier aufgerufen werden */
    public Flasche(String sM, float fM, String sN){
        this.sMaterial = sM;
        this.fMenge = fM;
        this.sName = sN;
    }

    /************** GETTER UND SETTER *************/
        /* Lassen sich automatisch generieren und dienen der Arbeit un dem
        Zugriff für die Attribute der Klassen und deren Objekte.
        In IntelliJ unter Code->Generate "Getter and Setter" */

    public String getsMaterial() {
        return sMaterial;
    }

    public void setsMaterial(String sMaterial) {
        this.sMaterial = sMaterial;
    }

    public float getfMenge() {
        return fMenge;
    }

    public void setfMenge(float fMenge) {
        this.fMenge = fMenge;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}

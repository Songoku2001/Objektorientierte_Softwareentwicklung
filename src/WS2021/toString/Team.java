package WS2021.toString;

public class Team {
    String name;                     //Attribute
    int established;

    public Team(String name, int established) {             //Konstruktor
        this.name = name;
        this.established = established;
    }
    public String toString(){
        return name + " (" + established + ")";
    }

    public static void main(String[] args){
        Team eins = new Team("FC Bayern München", 1908);   //new heißt ein objekt der klasse zuweisen
        Team zwei = new Team ("Dortmund", 1345);                //Objekte zuweisen

    }
}
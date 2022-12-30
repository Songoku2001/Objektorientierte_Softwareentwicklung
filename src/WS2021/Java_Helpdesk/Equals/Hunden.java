package WS2021.Java_Helpdesk.Equals;

public class Hunden {
    String rasse;
    int alter;

    public Hunden(String rasse, int alter){
        this.rasse = rasse;
        this.alter = alter;
    }

    @Override
    public boolean equals(Object o){
        if(o == null)return false;
        if(this == o)return true;
        if(!o.getClass().equals(Hunden.class))return false;
        Hunden that = (Hunden) o;
        /*if(this.rasse == that.rasse && this.alter == that.alter)return true;
        return false;*/
        return (this.rasse.equals(that.rasse) && this.alter == that.alter);
    }

    public static void main (String [] args){
        Hunden h1 = new Hunden("Bulle", 17);
        Hunden h2 = new Hunden("Bulle", 17);
        Hunden h3 = new Hunden("Bulle", 18);

        System.out.println(h1.equals(h2));
        System.out.println(h1.equals(h3));
    }
}

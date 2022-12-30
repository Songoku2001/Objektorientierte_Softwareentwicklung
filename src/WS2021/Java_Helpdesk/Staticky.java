package WS2021.Java_Helpdesk;

public class Staticky {

    static int a = 9;
    int b = 7;

    public static void main (String[] args){
        System.out.println(a);

        Staticky s = new Staticky();
        System.out.println(s.b);
    }
}

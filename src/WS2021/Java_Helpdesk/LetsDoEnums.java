package WS2021.Java_Helpdesk;

enum level{
    HIGH, MIDDLE, LOW;
        }

public class LetsDoEnums {

    public static void main(String[] args){
        level l = level.LOW;
        System.out.println(l);

        level l1 = level.HIGH;
        System.out.println(l1);
    }
}

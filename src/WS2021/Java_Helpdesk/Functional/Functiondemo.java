package WS2021.Java_Helpdesk.Functional;

import java.util.ArrayList;
import java.util.function.Function;

public class Functiondemo {
    public static void main(String[] args) {
        ArrayList<Student> Klassenliste = new ArrayList<>();
        Klassenliste.add(new Student("Alex",20));
        Klassenliste.add(new Student("Tim",22));
        Klassenliste.add(new Student("Kabir",18));

        // Simple use of function
        for(Student st: Klassenliste){
            System.out.println(st.customShow(s->s.name+": "+s.name));
        }

        //Style one to declare function
        Function<Student,String> styleOne = s->{
            String result =  "Name:"+s.name +" and Age:"+s.age;
            return result;
        };

        //Style two to declare function
        Function<Student,String> styleTwo = s->
                "Name:"+s.name +" and Age:"+s.age;

        System.out.println("--print value by style one--");
        //print the values of list using stle one function
        for(Student st: Klassenliste){
            System.out.println(st.customShow(styleOne));
        }

        System.out.println("--print value by style two--");
        //print the values of list using style two function
        for(Student st: Klassenliste){
            System.out.println(st.customShow(styleTwo));
        }
    }
}

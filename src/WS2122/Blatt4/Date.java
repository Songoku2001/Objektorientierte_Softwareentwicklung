package WS2122.Blatt4;

public class Date{
  int day;
  int month;
  int year;

  public Date(int day, int month, int year){
    assert month>0;
    assert month<13;
    assert day>0;
    assert day<32;

    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int dayOfWeek(){
  //hier den Wochentag berechnen
    int y = year;
    if (month < 3) {
      y = year - 1;
    }
    var w = ((day + (2.6*((month+9)%12 +1)-0.2)
            + (y%100)
            + (y%100/4)
            + (y/400) - 2 * (y/100)-1)%7 + 7)%7 +1;
    
    return (int) w == 7 ? 0 : (int) w;
  }

  Date mothersDay(){
    //hier den Muttertag berechnen
    //Es ist der zweite Sonntag im Mai.
    int weekday = new Date(1, 5, this.year).dayOfWeek();
    int dayInMai = weekday == 0 ? 8 : 15 - weekday;
    return new Date(dayInMai, 5, this.year);
  }

  //Aufgabe 4
   public Date easter(){
    //hier den Ostersonntag berechnen
     int a = year%19;
     int b = year/100;
     int c = year%100;
     int d = b/4;
     int e = b%4;
     int f = (b+8)/25;
     int g = (b-f+1)/3;
     int h = (19*a +b-d-g+15)%30;
     int i = c/4;
     int k = c%4;
     int l = (32 + 2*e + 2*i - h - k)%7;
     int m = (a + 11*h + 22*l)/451;
     int formel = (h + l- 7*m + 114);
     int n = formel/31;
     int p = formel%31;

    return new Date(p+1, n, year);
  }

  public static void main(String[] args) {
    //Date date =  new Date(12, 12, 2021);
    String date = "05.12.2021";
    System.out.println(Integer.parseInt(date.substring(0,2)));
    System.out.println(Integer.parseInt(date.substring(3,5)));
    System.out.println(Integer.parseInt(date.substring(6,10)));


  }
}
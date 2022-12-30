package WS2122.Blatt2;

public class DateTime{
  Date date;
  Time time;

  public DateTime(Date date, Time time){
    this.date = date;
    this.time = time;
  }

  @Override
  public String toString(){
    return date.toString() + " " + time.toString();
  }

  public static void main(String[] args) {
    Date d = new Date(9,7,2001);
    Time t = new Time (20, 15, 0);
    DateTime dt = new DateTime(d, t);

    System.out.println(dt);
  }
}
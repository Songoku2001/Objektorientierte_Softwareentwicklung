package WS2122.Blatt2;

class Time{
  int hour;
  int minute;
  int second;

  public Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString(){
    return hour + "" + ":" + minute;
  }

  public static void main (String[] args) {
    Time t = new Time(20, 15, 0);

    System.out.println(t);
  }

}
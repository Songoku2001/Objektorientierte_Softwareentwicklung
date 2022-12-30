package WS2122.Blatt2;

class Date{
  int day;
  int month;
  int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public String toString(){
    return day + "" + "." + month + "" + "." + year;
  }

  public static void main (String[] args) {
    Date d = new Date(9, 7, 2001);

    System.out.println(d);
  }

}
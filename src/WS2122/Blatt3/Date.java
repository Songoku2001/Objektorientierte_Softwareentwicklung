package WS2122.Blatt3;

class Date{
  int day;
  int month;
  int year;

  public Date(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public String toString(){
    return day + "." + month + "." + year;
  }

  boolean isEarlierThan(Date that){
    return this.year < that.year
            || this.year == that.year && this.month < that.month
            || this.year == that.year && this.month == that.month && this.day < that.day;
  }

  boolean isLaterThan(Date that){
    return that.isEarlierThan(this);
  }

  boolean isSameDate(Date that){
    return this.year == that.year
            && this.month == that.month
            && this.day == that.day;
  }

  boolean isLeapYear(){
    return year%4 == 0 && year%100 != 0
            || year%100 == 0 && year%400 == 0;
  }

  int getAbsoluteDaysInYear(){
    return isLeapYear() ? 366 : 365;
  }
}
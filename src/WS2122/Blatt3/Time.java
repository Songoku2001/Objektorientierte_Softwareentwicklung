package WS2122.Blatt3;

class Time{
  int hour;
  int minute;
  int second;

  Time(int hour, int minute, int second){
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  @Override
  public String toString(){
    return hour + ":" + minute + " Uhr";
  }

  boolean isEarlierThan(Time that){
    return this.hour < that.hour
            || this.hour == that.hour && this.minute < that.minute
            || this.hour == that.hour && this.minute == that.minute && this.second < that.second;
  }

  boolean isLaterThan(Time that){
    return that.isEarlierThan(this);
  }

  Time minutesLater(int min){
    int newminute = (minute + min);
    hour = hour + (newminute/60);
    minute = newminute%60;
    hour = hour%24;

    return new Time(hour, minute, second);
  }
}
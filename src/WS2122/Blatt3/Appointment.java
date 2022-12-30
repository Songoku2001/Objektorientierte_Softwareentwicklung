package WS2122.Blatt3;

class Appointment{
  DateTime time;
  int length;
  String reason;
  String place;

  Appointment(DateTime time, int length, String reason, String place){
    this.time = time;
    this.length = length;
    this.reason = reason;
    this.place = place;
  }

  @Override
  public String toString(){
    return time +", " + length + ", " + reason + ", " + place;
  }

  DateTime endingTime(){
    int newhour = (time.time.minute + length)/60;
    int newday = this.time.date.day + (time.time.hour + newhour)/24;

    Date d = new Date(newday, time.date.month, time.date.year);
    Time t = time.time.minutesLater(length);
    return new DateTime(d, t);
  }
}
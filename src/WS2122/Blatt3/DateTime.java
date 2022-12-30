package WS2122.Blatt3;

class DateTime{
  Date date;
  Time time;

  DateTime(Date date, Time time){
    this.date = date;
    this.time = time;
  }
  @Override
  public String toString(){
    return date.toString() + time.toString();
  }

  boolean isEarlierThan(DateTime that){
    return this.date.isEarlierThan(that.date)
            || this.date.isSameDate(that.date) && this.time.isEarlierThan(that.time);
  }

  boolean isLaterThan(DateTime that){
    return this.date.isLaterThan(that.date)
            || this.date.isSameDate(that.date) && this.time.isLaterThan(that.time);
    //oder -> that.isEarlierThan(this)
  }
}
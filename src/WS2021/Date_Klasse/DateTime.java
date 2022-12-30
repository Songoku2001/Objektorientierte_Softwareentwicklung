package WS2021.Date_Klasse;

public class DateTime {
    Date date;
    Time time;

    public DateTime(Date date, Time time){
        this.date = date;
        this.time = time;
    }

    public String toString(){
        return date.toString() + " " + time.toString();
    }
    boolean isEarlierThan(DateTime that){
        if(this.date.isEarlierThan(that.date)) {
            return true;
        }
        if(this.time.isEarlierThan(that.time)){
            return true;
        }
        return false;
    }
    boolean isLaterThan(DateTime that){
        if (that.isEarlierThan(this)) {
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        Date d = new Date(29, 11, 2018);
        Time t = new Time(12, 59, 25);
        DateTime dt = new DateTime(d,t);
    }
}

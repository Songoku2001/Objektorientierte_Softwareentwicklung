package WS2021.Date_Klasse;

public class Appointment {
    DateTime time;
    int length;
    String reason;
    String place;

    Appointment(DateTime time, int length, String reason, String place) {
        this.time = time;
        this.length = length;
        this.reason = reason;
        this.place = place;
    }

    public String toString(){
        return time.toString() + " " + length + " " + reason + " " + place;
    }
    DateTime endingTime(){
        int minuteneu = this.time.time.minute + length;

        int minute = (minuteneu % 60);
        int hour = ( this.time.time.hour+(minuteneu/60));
        int daynew = this.time.date.day + (hour/24);
        var d = new Date(daynew, this.time.date.month, this.time.date.year);
        var t = new Time(hour%24,minute, this.time.time.second);
        return new DateTime(d, t);

    }


    public static void main(String[] args){
        Date d = new Date(29, 11,2018);
        Time t = new Time(12, 59, 15);
        DateTime dt = new DateTime(d, t);
        Appointment ap = new Appointment(dt, 5,"Zahnarzt", "Burgstraße 4");
    }
}

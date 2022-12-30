package WS2021.Date_Klasse;

public class Time {
    int hour;
    int minute;
    int second;

    public Time(int hour, int minute, int second) {
                     this.hour = hour;
                     this.minute = minute;
                     this.second = second;
                 }

                 public String toString(){
                     return hour + ":" + minute + " Uhr";
                 }

                 public boolean isEarlierThan(Time that){
                     if (this.hour > that.hour){
                         return false;
                     }
                     if (this.hour < that.hour){
                         return true;
                     }
                     if (this.minute < that.minute){
                         return true;
                     }
                     if (this.minute > that.minute){
                         return false;
                     }
                     if (this.second < that.second){
                         return true;
                     }
                     return false;
                 }

                 public boolean isLaterThan(Time that){
                     if (this.hour < that.hour){
                         return false;
                     }
                     if (this.hour > that.hour){
                         return true;
                     }
                     if (this.minute > that.minute){
                         return true;
                     }
                     if (this.minute < that.minute){
                         return false;
                     }
                     if (this.second > that.second){
                         return true;
                     }
                     return false;
                 }
                 public Time minutesLater(int min){
                     int minutegesamt = minute + min;

                     return new Time ((hour+(minutegesamt/60))%24, minutegesamt%60, second);

    }

         public static void main (String[] args) {
             Time t2 = new Time(12, 59, 15);

         }

}

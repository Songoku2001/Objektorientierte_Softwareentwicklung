package WS2021.Array_und_Vererbung;

import WS2122.Blatt4.Date;

class DayOfWeekLogic extends ButtonLogic {

    @Override
    String getButtonLabel() {
        return "Datum";
    }

    @Override
    String eval(String x) {              //dd.mm.yyyy
        int day = Integer.parseInt(x.substring(0,2));
        int month = Integer.parseInt(x.substring(3,5));
        int year = Integer.parseInt(x.substring(6));
        Date datum = new Date(day,month,year);
        int dayOfWeek = datum.dayOfWeek();
        String []wochentage = {"Sonntag", "Montag","Dienstag","Mittwoch",
                "Donnerstag", "Freitag", "Samstag"};
        return wochentage[dayOfWeek];
    }

    public static void main(String[] args) {
        new Dialogue(new DayOfWeekLogic());
        new ConsoleDialogue(new DayOfWeekLogic()).run();
    }
}
//Aufgabe5
import Date;

class DayOfWeekLogic extends ButtonLogic {


  @Override
  String getButtonLabel() {
    return "Datum";
  }

  @Override
  String eval(String x) {
    int d = Integer.parseInt(x.substring(0,2));
    int m = Integer.parseInt(x.substring(3,5));
    int y = Integer.parseInt(x.substring(6,10));

    Date date = new Date(d, m, y);
    int weekday = date.dayOfWeek();
    String[] w = {"Sonnabend", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
    return w[weekday];
  }
//12.11.2020

  public static void main(String[] args){
    //new Dialogue(new DayOfWeekLogic());
    new ConsoleDialogue(new DayOfWeekLogic()).run();
  }
}
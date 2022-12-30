package WS2021.toString;

class Match{

    Team home;
    Team away;
    boolean played;
    int goalsHome;
    int goalsAway;

    public Match(Team home, Team away){
        this.home = home;
        this.away = away;
    }

    public String toString(){
        if (played){
            return "Das Spiel " + home + " vs " + away + " findet statt es steht" + goalsHome + ":" + goalsAway;
        }
        else{
            return  "Das Spiel " + home + " vs " + away + " hat nicht stattgefunden";
    }
    }

    public Team winner() {
        if (!played){
            return null;
        }
        if (goalsHome > goalsAway){
            return home;
        }
        if (goalsHome < goalsAway){
            return away;
        }
        return null;
    }



    public static void main(String[] args) {

        Team fcb = new Team("fcb", 1908);
        Team db = new Team("db", 1976);

        Match eins = new Match(fcb, db);

    }


}

package WS2021.Date_Klasse;

public class Date {
    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return (day + "." + month + "." + year);
    }

    public boolean isEarlierThan(Date that) {
        if (this.year > that.year) {
            return false;
        }
        if (this.year < that.year) {
            return true;
        }
        if (this.month < that.month) {
            return true;
        }
        if (this.day < that.day) {
            return true;
        }
        return false;
    }

    public boolean isLaterThan(Date that) {
        return this.year > that.year ? true : this.year < that.year ? false : this.month > that.month ? true : this.day > that.day ? true : false;
    }

    public boolean isSameDate(Date that) {
        return that.year == this.year && that.month == this.month && that.day == this.day ? true : false;
    }

    public boolean isLeapYear() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public int getAbsoluteDaysInYear() {
        return isLeapYear() ? 366 : 365;
    }

    public int dayOfWeek() {
        double w;
        int m = 0;
        Date2 d1 = new Date2(day, month, year);

        if (d1.month < 3) {
            d1.year--;
        }


        switch (month) {
            case 1:
                m = 11;
                break;
            case 2:
                m = 12;
                break;
            case 3:
                m = 1;
                break;
            case 4:
                m = 2;
                break;
            case 5:
                m = 3;
                break;
            case 6:
                m = 4;
                break;
            case 7:
                m = 5;
                break;
            case 8:
                m = 6;
                break;
            case 9:
                m = 7;
                break;
            case 10:
                m = 8;
                break;
            case 11:
                m = 9;
                break;
            case 12:
                m = 10;
                break;
        }
        w = (d1.day + ((2.6 * m) - 0.2) + d1.year % 100 + ((d1.year % 100) / 4) + ((d1.year / 100) / 4) - (2 * (d1.year / 100))) % 7;

        if (0 > w) {
            w = w + 7;
        }
        return (int) w;
    }


    Date nextDay() {
        int tage = 0;
        int newday = this.day;
        int newmonth = this.month;

            if (month == 2) {
                if (isLeapYear()) {
                    tage = 29;
                }
                tage = 28;
            }


        switch (this.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tage = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                tage = 30;
                break;
        }
        if (tage == day && this.month == 12) {
            newday = 1;
            newmonth = 1;
            year++;
            return new Date(newday, newmonth, year);
        }
        if (day == tage && month != 12) {
            newday = 1;
            newmonth++;
        }
        if(day != tage) {
            newday++;
        }
        return new Date(newday, newmonth, year);
    }




        String monthAsHTML() {
            var r = "<table><tr><th>Mo</th><th>Di</th><th>Mi</th><th>Do</th><th>Fr</th><th>Sb</th><th>So</th></tr>";
            r += "<tr>";
            int weekday = new Date(1, month, year).dayOfWeek();
            if (weekday == 0) {
                weekday = 7;
            }

            for (var i = 1; i < weekday; i++) {
                r += "<td></td>";
            }
            for (var i = 1; i <= 31; i++) {
                r += "<td>" + i + "</td>";

                if (weekday == 1) {
                    if (i % 7 == 0)
                        r += "</tr><tr>";
                }

                if (i % 7 == (8 - weekday))
                    r += "</tr><tr>";
            }
            return r + "</tr></table>";
        }

}




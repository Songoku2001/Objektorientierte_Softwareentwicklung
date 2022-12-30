package WS2021.Date_Klasse;

public class Date2 {
    int day;
    int month;
    int year;

    Date2(int day, int month, int year){
        assert month>0;
        assert month<13;
        assert day>0;
        assert day<32;

        this.day = day;
        this.month = month;
        this.year = year;
    }

    int dayOfWeek(){
        double w;
        int m = 0;
        Date2 d1 = new Date2(day, month, year);

        if(d1.month < 3) {
            d1.year--;
        }



    switch (month){
            case 1: m = 11;break;
        case 2: m = 12;break;
        case 3: m = 1;break;
        case 4: m = 2;break;
        case 5: m = 3;break;
        case 6:m = 4;break;
        case 7: m = 5;break;
        case 8: m = 6;break;
        case 9: m = 7;break;
        case 10:m = 8;break;
        case 11: m = 9;break;
        case 12: m = 10;break;
    }
        w = (d1.day +((2.6*m)-0.2)+d1.year%100+((d1.year%100)/4)+((d1.year/100)/4)-(2*(d1.year/100)))%7;

        if(0>w){
            w = w+7;
        }
        return (int) w;
    }


    Date2 mothersDay(){
        Date2 motherDay = new Date2(8, 5, year);

        while (motherDay.dayOfWeek() != 0){
            ++motherDay.day;
        }
        return motherDay;

    }
    public static void main(String[] args){
        Date2 d3 = new Date2(25, 11, 2020);

        System.out.println(d3.mothersDay());
    }




}


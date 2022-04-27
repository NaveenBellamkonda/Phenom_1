package datesAndCalendars;

import java.util.Calendar;
import java.util.Date;

public class DatesAndCalendar {
    public static void main(String[] args){

        DatesAndCalendar.displayCurrentDate();

    }
    public static void displayCurrentDate(){
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        Date date =new Date();
        calendar.setTime(date);
        System.out.println(calendar.getTime());
    }

}

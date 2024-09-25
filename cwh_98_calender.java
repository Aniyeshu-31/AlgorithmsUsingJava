package com.company;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.TimeZone;

public class cwh_98_calender {
    public static void main(String[] args) {
//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
        LocalDate dt= LocalDate.of(2022,5,31);
        System.out.println(dt.getDayOfWeek());


//        Calendar c= Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone().getID());
    }
}

package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cwh_101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now(); // This is the date
        System.out.println(dt);
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy --E H:m a"); // This is the format
//        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate= dt.format(df); // This the string made using the Date and Format.
        System.out.println(myDate);
    }
}

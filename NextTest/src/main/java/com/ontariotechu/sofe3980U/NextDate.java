package com.ontariotechu.sofe3980U;


public class NextDate {

    private int day;
    private int month;
    private int year;
    public static String Nextdate(int day, int month, int year){
        String returnDate;

        if(year < 1812 || year > 2212){
            System.out.println("This is not a valid year");
            return "This is not a valid year";
        }
        if (month < 1 || month > 12){
            System.out.println("This is not a valid month");
            return "This is not a valid month";
        }

    }

}

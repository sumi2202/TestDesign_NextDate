package com.ontariotechu.sofe3980U;


public class NextDate {
    public static String Date(int year, int month, int day){
        String returnDate;

        if(year < 1812 || year > 2212){
            System.out.println("This is not a valid year");
        }
        else if (month < 1 || month > 12){
            System.out.println("This is not a valid month");
        }
        else if (day < 1 || day > 31){
            System.out.println("This is not a valid day");
        }


        returnDate = year + "/" + month + "/" + day;
        return returnDate;
    }

}

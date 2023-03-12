package com.ontariotechu.sofe3980U;


public class NextDate {
    public static String Date(int day, int month, int year){
        String returnDate;

        if(year < 1812 || year > 2212){
            System.out.println("This is not a valid year");
            return "This is not a valid date";
        }
        else if (month < 1 || month > 12){
            System.out.println("This is not a valid month");
            return "This is not a valid date";
        }
        else if (day < 1 || day > 31){
            System.out.println("This is not a valid day");
            return "This is not a valid date";
        }


        returnDate = year + "/" + month + "/" + day;
        return returnDate;
    }

}

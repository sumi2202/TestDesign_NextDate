package com.ontariotechu.sofe3980U;


public class NextDate {
    public static String Date(int year, int month, int day){

        String returnDate;
        boolean yearLeap = true;

        //checking to see if a valid year, month, and day are provided
        if(year < 1812 || year > 2212){
            System.out.println("This is not a valid year");
            return "Invalid date entered!";
        }
        else if (month < 1 || month > 12){
            System.out.println("This is not a valid month");
            return "Invalid date entered!";
        }
        else if (day < 1 || day > 31){
            System.out.println("This is not a valid day");
            return "Invalid date entered!";
        }
        //confirming leap years
        if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            yearLeap = true;
        }
        //ensuring that the months that have 30 days and the months that have 31 days are accounted for
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31){
            month = month + 1;
            day = 1;
        }
        if((month == 4 || month == 6 || month == 9 || month == 11 ) && day == 31){
            month = month + 1;
            day = 1;
        }



        returnDate = year + "/" + month + "/" + day;
        return returnDate;
    }

}

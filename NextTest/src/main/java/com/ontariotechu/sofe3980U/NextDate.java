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
        if(year % 4 == 0 && year % 100 != 0|| year % 400 == 0 ){
            yearLeap = true;
        }
        //ensuring that the months that have 30 days and the months that have 31 days are accounted for
        //The months January, March, May, July, August, and October, all have 31 days
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31){
            month = month + 1;
            day = 1;
        }
        //The months April, June, September, and November, all have 30 days in them
        else if((month == 4 || month == 6 || month == 9 || month == 11 ) && day == 30){
            month = month + 1;
            day = 1;
        }
        //December 31st of any year before 2212 will be incremented to January 1st of the next year
        else if(month == 12 && day == 31 && year < 2212){
            month = 1;
            day = 1;
            year = year + 1;
        }
        //December 31st, 2212 will not be incremented as it is out of range
        else if(month == 12 && day == 31 && year == 2212){
            return "Beyond Range";
        }
        //Will be incremented to February 29th
        else if(yearLeap && month == 2 && day == 28){
            day = day + 1;
        }
        //Leap Year Februarys only have 29 days
        else if (yearLeap && month == 2 && day > 29) {
            return "Invalid Leap Year Entry";
        }
        //February 29th on a Leap Year will increment to March 1st
        else if(yearLeap && month == 2 && day == 29){
            month = month + 1;
            day = 1;
        }
        //During regular years, February 28th will be incremented to March 1st
        else if(!yearLeap && month == 2 && day == 28){
            month = month + 1;
            day =  1;
        }
        //There cannot be more than 28 days in February during a regular year
        else if (!yearLeap && month == 2 && day >= 29) {
            return "Invalid Non-Leap Year Entry";
        }
        else{
            day = day + 1;
        }
        returnDate = year + "/" + month + "/" + day;
        return returnDate;
    }

}

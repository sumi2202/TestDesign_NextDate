package com.ontariotechu.sofe3980U;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the date in numerical form in the following order:\nyear (yyyy)\nmonth (mm)\nday (dd)\nEnter after every input.");

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        System.out.println("The next date is: " + NextDate.Date(year, month, day));
    }
}

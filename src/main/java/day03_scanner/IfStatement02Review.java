package day03_scanner;

import java.util.Scanner;

public class IfStatement02Review {
    public static void main(String[] args) {

         /*
        Example 1: Type code to print "Weekday" for the weekday names, "weekend day" for the weekend days
        Monday - Friday ==> Weekday       Saturday, sunday ==> Weekend day
       */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName=input.next();

        //1.way :if statement

        if (dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if (dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }


        //2.way :if else statement

        boolean isWeekDay=dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");
        boolean isWeekendDay= dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

        if (isWeekDay){
            System.out.println("Weekday");
        } else if (isWeekendDay) {
            System.out.println("Weekend day");
        }else {
            System.out.println("Invalid day");
        }


    }
}

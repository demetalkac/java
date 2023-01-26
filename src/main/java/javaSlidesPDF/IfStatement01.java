package javaSlidesPDF;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
       //1. If an integer is even, output will be "The integer is even" .
       //  If the integer is odd, output will be "The integer is odd"

       int d=18;

       if (d%2==0){
           System.out.println("The integer is even");
       }
        if (d%2!=0){
            System.out.println("The integer is odd");
        }


        /* 2. Type java code by using if statement.When you enter the initial of the day of a week, output should
             be all possible names of the days.
                For example; if the initial is "S" output should be “Saturday or Sunday”
                */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the day name");
        String initialDayName=input.next();

        if (initialDayName.equalsIgnoreCase("M"));{
            System.out.println("Monday");
        }
         if (initialDayName.equalsIgnoreCase("T")) {
             System.out.println("Tuesday or Thursday");
         }
        if (initialDayName.equalsIgnoreCase("W"));{
            System.out.println("Wednesday");
        }
        if (initialDayName.equalsIgnoreCase("F")) {
            System.out.println("Friday");
        }
        if (initialDayName.equalsIgnoreCase("S")) {
            System.out.println("Saturday or Sunday");
        } else {
            System.out.println("Invalid day name");
        }

        System.out.println();


        //3) Type java code by using if statement. When you enter the name of the day of a week,
        //output will be “Weekday” or “Weekend day” according to the name of the day.

        System.out.println("Enter the day name");
        String dayName= input.next();

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
        }else {
            System.out.println("Invalid day");
        }

        System.out.println();

       //4) Ask user to enter the values of length and width of a rectangle, then check if it is square or not.

        System.out.println("Enter the length and width ");

       double l= input.nextDouble();
       double w= input.nextDouble();

        if (l==w){
            System.out.println("It is square");
        }

        if (l!=w){
            System.out.println("It is not square");
        }









    }
}

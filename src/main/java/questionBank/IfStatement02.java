package questionBank;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        // 4) Type code to print the name of the month when you entered the number of the month.
        //        Example; For 1 output is "January", for 2 output is "February" etc.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of the month");
        byte numOfMont =scan.nextByte();

        if (numOfMont==1){
            System.out.println("January");
        } else if (numOfMont==2) {
            System.out.println("February");

        } else if (numOfMont==3) {
            System.out.println("March");
        } else if (numOfMont==4) {
            System.out.println("April");

        } else if (numOfMont==5) {
            System.out.println("May");
        } else if (numOfMont==6) {
            System.out.println("June");

        } else if (numOfMont==7) {
            System.out.println("Jully");
        } else if (numOfMont==8) {
            System.out.println("August");

        } else if (numOfMont==9) {
            System.out.println("September");
        } else if (numOfMont==10) {
            System.out.println("November");

        } else if (numOfMont==11) {
            System.out.println("October");
        } else if (numOfMont==12) {
            System.out.println("Desember");
        } else {
            System.out.println("Invalid month number");
        }

      //5)  Type code to print
        //  a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        //  b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        //  c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied

        int a=5;
        int b=8;
        int c=4;

        if (a==b && b==c){
            System.out.println("Equilateral Triangle");
        } else if (a==b && b!=c || a==c && c!=b || b==c && a!=c) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Neither isosceles, nor equilateral5");
        }
       /*
        6) Type code to create a converter which converts mile to km, second to hour, fahrenheit to
           celsius. Find the formulas for conversions from Google.
                a) When user entered 10 and mileToKm String, your code should print "16 km"(The
                   number will be dynamic) on the console
                b) When user entered 7200 and secondsToHours String, your code should print "2
                   Hours"(The number will be dynamic) on the console
                c) When user entered 83 and fahrenheitToCelsius String, your code should print
                  "28.3333 celsius"(The number will be dynamic) on the console/*

        */





    }
}

package day04nestedifswitch;

import java.util.Scanner;

public class Scanner01Review {
    //switch statement does the same with "if - else-if", it has just different syntax

    public static void main(String[] args) {
        //Get the number of days from user and print the name of the day
        //For example; 1 ==> Sunday, 2 ==> Monday, etc.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter day number");
        byte dayNumber= input.nextByte();

        //way 1: if - else-if

        if (dayNumber==1){
            System.out.println("Sunday");
        } else if (dayNumber==2) {
            System.out.println("Monday");

        } else if (dayNumber==3) {
            System.out.println("Tuesday");

        } else if (dayNumber==4) {
            System.out.println("Wednesday");

        } else if (dayNumber==5) {
            System.out.println("Thursday");

        } else if (dayNumber==6) {
            System.out.println("Friday");

        } else if (dayNumber==7) {
            System.out.println("Saturday");

        } else {
            System.out.println("Invalid day number");
        }


        //way:2 "switch statement"


    }
}

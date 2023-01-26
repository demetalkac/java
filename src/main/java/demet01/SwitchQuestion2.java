package demet01;

import java.util.Scanner;

public class SwitchQuestion2 {
    public static void main(String[] args) {

       /*
           Use a switch statement to print the name of the month when you enter the number of the
       month. For example; if user enters 1 your code should print "January",
       if user enters 2 your code should print "February" etc. if user enters invalid month number
       your code should print "Invalid number

        */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter month number");

        int mont=8;
        String monthString;
        switch(mont) {

            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                monthString = "Juna";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
            default:
                monthString = "Invalid month";
                break;


        }


    }

}

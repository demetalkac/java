package javaSlidesPDF;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
                 //Switch Statement Questions
       //  1) If the user pressed 1, 2, 3 the program will print the number that is pressed;
        //   otherwise, program will print "Not allowed".
        System.out.println("Enter three integer");
        int number1= scan.nextInt();
        int number2= scan.nextInt();
        int number3= scan.nextInt();
        switch (number1 + number2 + number3){
            case 123:
                System.out.println("print the number");
                break;
            default:
                System.out.println("Not allowed");
        }



      //2)  Write a Java program user will choose answer among A, B, C, or D.
      //       If the answer is true, output will be “True.” If the answer is false, output will be
      //       “False”. Correct answer is ‘C’ for the multiple option question.

        System.out.println("Enter answer among A, B, C, or D");
      char answer =scan.next().charAt(0);


        switch (answer){
            case 'A':
                System.out.println("answer is false");
                break;
            case 'B':
                System.out.println("answer is false");
                break;
            case 'C':
                System.out.println("answer is true");
                break;
            case 'D':
                System.out.println("answer is false");
                break;
            default:
                System.out.println("ınvalid answer");
        }


        //3)Type java code by using switch statement.
        //  A school has the following rules for grading system:
        //  1. For 50 - C 2. For 80 - B. 4. For 100 - A
        //  Ask user to enter marks and print the corresponding grade.

        System.out.println("enter marks");
        char marks= scan.next().charAt(0);

        switch (marks){
            case 'C':
                System.out.println("Your note is:" + 50);
                break;
            case 'B':
                System.out.println("Your note is:" + 50);
                break;
            case 'A':
                System.out.println("Your note is:" + 100);
                break;
            default:
                System.out.println("Invalid note");
        }

        // 4) Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
        //    Then type a program by using “switch statement” to print “United” for ‘U’
        //    ”States” for ’S’, and “America” for ‘A’

        System.out.println("Enter one of the ‘U’, ’S’, and ‘A’");
        char countryName= scan.next().charAt(0);

        switch (countryName){
            case 'U':
                System.out.print("United" + " " );
            case 'S':
                System.out.print("States"+ " ");
            case 'A' :
                System.out.print("America");
        }

        //end











    }
}

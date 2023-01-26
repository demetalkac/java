package javaSlidesPDF;

import java.util.Scanner;

public class IfElseStatement01 {
    public static void main(String[] args) {

    //1)Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”
        // else output will be “No need to work”
        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");

        double age= input.nextDouble();

        if (age>=18 && age<=65){
            System.out.println("You should work");
        }else {
            System.out.println("No need to work");
        }


       //2) Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
        //  then output will be “Hey man you retired!” else output will be “No need to work”

         Scanner scan=new Scanner(System.in);

        System.out.println("Enter your age and gender");
        int ag= input.nextInt();

        String gender=input.nextLine();

        if ( gender.equalsIgnoreCase("Male") && ag>=65 ){
            System.out.println("Hey man you retired!");
        }else {
            System.out.println("No need to work");
        }

        System.out.println();

        //3) Ask user to enter a character, then check whether the character is alphabet or not

        System.out.println("Enter a character");
        char characterOfAlphabet= input.next().charAt(0);

        if (characterOfAlphabet>'A' &&  characterOfAlphabet<'Z'){
            System.out.println("the character is alphabet");
        } else if (characterOfAlphabet>'a' &&  characterOfAlphabet<'z') {
            System.out.println("the character is alphabet");
        }else {
            System.out.println("the character is  not alphabet");
        }


        System.out.println();


        /*
           4) Ask user ta enter any name of the week, then get second ,fourth,
              and sixth letter of the day name and print them on the console,
             in the same line.
             For example; if the user enters “Monday” output will be “ody”
         */

        System.out.println("Enter the day name");
        String dayName= input.next().trim();

        System.out.println(dayName.substring(1,2) + dayName.substring(3,4) + dayName.substring(5,6));





        /*
        5)Type java code by using if-else statement,
           if the password is “JavaLearner”, output will be “The password is true”.
           Otherwise, output will be “The password is false”.
         */
        String psw1="JavaLearner";


       if (psw1.equals("JavaLearner")){
           System.out.println("The password is true");
       }else {
           System.out.println("The password is false");
       }


        System.out.println();

       /*
       6) Type java code by using if-else statement,
          Write a program to print absolute value of a number entered by user.
          Absolute Value: If the number is positive or zero return the number itself
          If the number is negative return the number after multiplying by -1
        */

        System.out.println("Enter a number,please");
        double b= input.nextDouble();

        if (b>=0 && -1*b>=0){
            System.out.println("Is absolute value");
        } else {
            System.out.println("Is not absolute value");
        }





        /*
        7) Type java code by using if-else statement.
           A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
           Ask user for quantity and unit price then judge and print total cost for user.
           If the quantity is less than 1000 output will be “No discount.”
         */

        System.out.println("Enter the quantity and unit price");
        double quantity= input.nextDouble();
        double unitPrice= input.nextDouble();

        if (quantity<1000){
            System.out.println("No discount");
        } else if (quantity>=1000) {
            System.out.println("You won a discount");
        }









        /*
            Ask user ta enter a 4 digits integer, then print the sum of the first
            and the last digit of the number on console.
            For example; if user enters 1234 you will add 1 and 4,
            then print on the console 5
         */

        System.out.println("Enter a 4 digits integer");
        int i=input.nextInt();



















    }
}

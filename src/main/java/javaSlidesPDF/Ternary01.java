package javaSlidesPDF;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        //Example 1:
        int y =112;
        System.out.println((y>5)? (21) :("Zehra"));

        //Example 2:
        int a =11;
        int z=11;
        int result = a<10 ? a++ : z++;
        System.out.println(result+ "," + a + "," + z);

                   //Ternary Operator Questions
        //1) Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
        //the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.

        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");
        int number = scan.nextInt();

         //if-else
        if (number%2==0){
            System.out.println("The integer is even");
        }else {
            System.out.println("The integer is even");
        }

        //Ternary
        String num =(number%2==0) ? ("The integer is even") : ("The integer is even");
        System.out.println(num);

        //2)Type java code by using ternary and if-else. Ask user to enter two integers
        //Write a program to print the minimum one on the console.

        System.out.println("enter two integers");
        int num1= scan.nextInt();
        int num2 = scan.nextInt();
        //if-else
        if (num1<num2 ){
            System.out.println("Minimum number is: "+ num1 );
        } else if (num2<num1) {
            System.out.println("Minimum number is: "+ num2);
        }else {
            System.out.println("Number is not minimum ");
        }

        //Ternary
       int res =(num1<num2) ? (num1) :(num2);
        System.out.println(res);

        //3) Type java code by using ternary.
        //Write a program to print absolute value of an integer entered by user.
        System.out.println("Enter an integer");
        int b= scan.nextInt();

        int abs = b>0 ? b : -1*b;
        System.out.println(abs);


        //4) Type java code by  using ternary.
        //Take values of length and width of a rectangle from user and check if it is square or not.

        System.out.println("Plese enter values of length");
        double lenght= scan.nextDouble();
        System.out.println("Plese enter values of width");
        double width= scan.nextDouble();

        String square = lenght==width ? "it is square" : "it is  not square";
        System.out.println(square);

        //5)Ask user to enter a String. If the String has 2 characters, output will be
        //“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”

        //6)Ask user to enter an integer. If the number has 3 digits, output will be
        //“This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
        //How can you decide the number of digits of an integer?


        //7)Ask user ta enter a number. If the number is less than 10 and greater
        //than or equal to 0, calculate its cube. Otherwise, calculate its square.
        //Cube of a = a*a*a Square of a = a*a





    }
}

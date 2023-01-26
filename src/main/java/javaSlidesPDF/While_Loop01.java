package javaSlidesPDF;

import java.util.Scanner;

public class While_Loop01 {
    public static void main(String[] args) {
             //while loop Questions

        //1) Type java code by using while loop,
        //Write a program to print numbers from 1 to 5.

        int i=1;
        while (i<6){
            System.out.print(i + " "); //1 2 3 4 5
            i++;
        }
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");

        //2) Type java code by using while loop.
        //Write a program that types first 30 consecutive odd integers.

        int u=30;
        while (u>0){
            if (u%2!=0){
                System.out.print(u + " "); //29 27 25 23 21 19 17 15 13 11 9 7 5 3 1
            }
            u--;
        }

        System.out.println("===========================0");
        //3)Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer.
        //It should then print the multiplication table of that number.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = input.nextInt();

        int multiplication = 1;

        while (multiplication<11 ){
                System.out.println(number+ "x" + multiplication + "=" + number*multiplication);
            multiplication++;
        }

        //4)Type java code by using while loop,
        //Write a program that prompts the user to input a positive integer.
        //It should then print factorial of that number.
        System.out.println("Enter a positive integer");
        int num = input.nextInt();
        int prompts =1;
        while (num>0){
            prompts = prompts * num;
            num--;
        }
        System.out.print(prompts ); //120


        //5)Type java code by using while loop,
        //Write a program to count the factors of an integer which is entered by user.

        System.out.println("Enter an integer");
        int n =input.nextInt();    //I think the number is positive in this question.
        int in=1;
        int count=0;

        while (in<n){
            if (n % in==0){
                count++;
            }
            in++;
        }
        System.out.println("Count the factors of an integer " + count);

        //for loop ile cozersem:


//        System.out.println("Factors of " + num + " are: ");
//        // the solution with for loop, y is factor
//        for (int y = 1; y <= num; i++) {
//
//            if (num % y == 0) {
//                System.out.print(y + " ");
//            }
//            y++;
//        }



        //6)Type java code by using while loop,
        //Write a program that prompts the user to input an integer.
        //It should then find sum of the digits of that number.

        System.out.println("Enter an integer");
        int numb =input.nextInt();
        int sumOfTheDigit =1;
        int sum =0;
        while (numb>0){

            sumOfTheDigit  = sumOfTheDigit *numb%10;

           numb=numb/10;
        }
        System.out.println(sumOfTheDigit);


        //end






    }
}

package javaSlidesPDF;

import java.util.Scanner;

public class Do_WhileLoop {
    public static void main(String[] args) {

                    //do-while Loop Questions

        //1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.

        int  i = 1;
        do {
            System.out.println(i);
            i++;
        }while (i<5);



        //2)Write a program to print numbers from 10 to 3 on the console by using do-while loop.

        int k =10;
        do {
            System.out.print(k + " ");
            k--;
        }while (k>4);

        System.out.println();
        //3)Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
        //by using do-while loop.

        int num=100;
        do {
            if (num%5==0){
                System.out.print(num+ " ");
            }
            num--;

        }while (num>1);


        //4) Write a program to print letters from c to m on the console by using do-while loop.

        char letter='c';
        do {
            if (letter>'d' && letter<'n'){

            }
        }while (letter>'d' && letter<'n');




      //5) Ask user to enter a number.
        //If the number is divisible by 10 then print "Won!" on the console
        //otherwise ask user to enter another number.
        //Use do-while loop.
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number, please");
        int number = scan.nextInt();

        do {
            System.out.println("Enter a numbers, please");
            number = scan.nextInt();

            if (number%10==0){
                System.out.println("Won!");
            } else {
                System.out.println("Enter another numbers,please");
            }
        }while (number%10==0);

        System.out.println();
        //6) Ask user to enter a name.
        //If the name contains the letter ‘a’ then print "Won!" on the console
        //otherwise ask user to enter another name.
        //Use do-while loop
        System.out.println("Enter a name,please");
        String name = scan.nextLine();
        do {
            System.out.println("Enter a name,please");
            name = scan.nextLine();
           if (name.indexOf('a')==1){
               System.out.println("Won!");

            } else {
               System.out.println("Enter another name,please");
           }

        }while (name.indexOf('a')==1);


       //7)Ask user to enter a String
        //Print the characters whose indexes are odd on the console
        //For example; Germany ==> e m n
        System.out.println("Enter a String");

        String carecterOfIndexesAreOdd = scan.next();










    }
}

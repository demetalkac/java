package day02_scanner;

import java.util.Scanner;

public class Day02_TypeCasting {

    /*

    Type casting; converting a number primitive data type to another number primitive data type.For ex;
    while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
    byte. (You can't change char or boolean data types, as they are not numeric data types).



   byte - short - int - long - float-double

   For ex;

   **If you convert small data type to large dat type it is called 'Auto widening'.
   **If you convert large data type to small data type it is called 'Explicit Narrowing'.

   */

    public static void main(String[] args) {

    byte age= 12;
    int myAge= age;


   short population0fVillage= 21000;
   int myPopulationOfMyVillage= population0fVillage;

   //Explicitly narrowing

    double x=23.45; // 23.45
    System.out.println(x);

    long y= (long) x;//23
    System.out.println(y);

    //Example 1: Create 2 integer  variables and String value

     int i=13, k=21;
     String s= "Tom";
     System.out.println(i+ k+ s);

     System.out.println(s+ k*i);

        /*
            Order of the operations in Math
        1)Calculate the exponential
        2)Do the operations inside the parenthesis
        3)Do multiplication and division
        4)Do add subtraction
         */

        int result= 3 -2 * (5+2*3) /11;
        System.out.println(result);

        //Type Casting

        /*
        AutoWidening
        Java can put small data types into larger data types automatically
        When you put small data types into larger data type,you can widen the small data container into a bigger
        container data type

         */

        //Auto-widening
        int n= 14000;
        System.out.println(n);

        double d= n;
        System.out.println(d);
        /*
        Explicitly Narrowing
        Java does not put large data types into small data typ
          */

       // int n = 15;
        byte b=(byte) n;













        }


    public static class Scanner01 {

       /*
       Scanner class  is used to get the data from used into our codes.

       How do we get the data from the user?
       1. Step: Create an object from "Scanner Class".

       Class Name    Object Name   Assignment Operator   new Keyword    Constructor===> Class Name +()
       Scanner        input           =                     new           Scanner(system.in);
                      scan

       2. Step: Give a message to user about the data you ask

    */

        public static void main(String[] args) {

            //Ask user to enter his/her name
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name, please");
            String userFullName= input.nextLine();

            System.out.println();
            System.out.println("Enter your name, please"); //String

            String userName= input.next(); //till the first space
            System.out.println(userName); // Tom

            //Ask user to enter his/her name

            System.out.println("Enter your age, please"); //25/56
            byte age= input.nextByte();
            System.out.println(age);








        }



    }
}
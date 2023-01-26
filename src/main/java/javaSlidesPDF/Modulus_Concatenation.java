package javaSlidesPDF;

import java.util.Scanner;

public class Modulus_Concatenation {
    public static void main(String[] args) {
        int a = 20 ;
        int b = 8 ;
        int c = a % b ;
        System.out.println(c); //4

        int num1=45;
        int num2= 13;
        int remainder= num1 % num2;
        System.out.println("Remainder:"+remainder);  //Remainder:6

        /*
          (15) 1) Type a program like;
              Ask user to enter two integer values, the first will be greater than the second.
              The remainder when you divide the first by the second will be the width,
              and the sum of the two numbers will be the length of a rectangle.
              Then calculate the area and the perimeter of the rectangle, and print them
              on the console.
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two integer values but first greater please:");
       int i= input.nextInt();
       int j=input.nextInt();
       int width=i%j;
       int length=i+j;
        System.out.println("The ares of rectangle: "+ width*length);
        System.out.println("The perimeter of rectangle: "+ 2*(width+length));




       /*
       2) Ask user to enter two integer values. Write a Java Program to swap
          two numbers by using the third variable.
        */
        //1.way:
        System.out.println("Enter two integer values");
        int d=input.nextInt();
        int e=input.nextInt();
        System.out.println("Before swap d:" + d + " e:" + e);
        int temp=0;
        temp=d;
        d=e;
        e=temp;
        System.out.println("After swap d:" + d + " e:" + e);



        //2.way
        System.out.println("Enter two integer values");
        int x=input.nextInt();
        int y=input.nextInt();
        y= y-x;
        x=y+x;
        y=x-y;
        System.out.println(x+ " " +y);




        /*
        3) Ask user to enter two integer values. Write a Java Program to swap
           two numbers without using the third variable.
      */

        System.out.println("Enter two integer values");
        int f=input.nextInt();
        int h= input.nextInt();
        h= h-f;
        f=h+f;
        h=f-h;
        System.out.println(f+ " " +h);

        System.out.println();








    }
}

package javaSlidesPDF;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        /*
        1) Type a program which calculates the area and the perimeter of a square
           whose side length is entered by user.
           Hint 1: Area of a square is length x length
           Hint 2: Perimeter of a square is 4x length
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length");
        double l= input.nextDouble();
        System.out.println("Area of square is:"+ l*l);

        System.out.println("Perimeter of a square is:" + 4*l);







    }
}

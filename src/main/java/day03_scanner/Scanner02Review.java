package day03_scanner;

import java.util.Scanner;

public class Scanner02Review {
    public static void main(String[] args) {

        //Example: Get the width and the length of a rectangle from the user
        // and get the area==> width*length= area

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the width");
        double width=input.nextDouble();

        System.out.println("Enter the length");
        double length= input.nextDouble();

        System.out.println("The area of rectangle  is:"+ width*length);

    }
}

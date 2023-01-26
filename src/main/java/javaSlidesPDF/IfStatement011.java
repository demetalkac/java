package javaSlidesPDF;

import java.util.Scanner;

public class IfStatement011 {
    public static void main(String[] args) {
        //4) Ask user to enter the values of length and width of a rectangle, then check if it is square or not.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the values of length and width please");
        double l= input.nextDouble();
        double w= input.nextDouble();

        if (l==w){
            System.out.println("it is square");
        }
        if (l !=w){
            System.out.println("it is not square");
        }



    }
}

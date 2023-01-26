package day04nestedifswitch;

import java.util.Scanner;

public class Switch03Review {
    public static void main(String[] args) {
        //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation

        Scanner scan =new Scanner(System.in);
        System.out.println("enter first number...");
        double firstNumber =scan.nextDouble();

        System.out.println("enter second numer...");
        double secondNumber = scan.nextDouble();

        System.out.println("enter the operation among +, -, *, /, %" );
        char operationMark= scan.next().charAt(0);

        switch (operationMark){
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-' :
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/' :
                System.out.println(firstNumber / secondNumber);
                break;
            case '%' :
                System.out.println(firstNumber * secondNumber /100);
                break;
            default:
                System.out.println("That operation is not supported by this calculator");
        }



    }




}

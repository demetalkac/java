package day03_scanner;

public class IfStatement01Review {
    public static void main(String[] args) {

        //Example 1) The code to print "negative" for the numbers less than zero, "non-negative" for the numbers
        // greater than or equal to zero

     double d=2.3;

         if (d<0){
             System.out.println("Negative");
         }

         if (d>=0){
             System.out.println("Non-negative");
         }


        //Example 2: Type code to print "Divisible by 5" if the number can be divided by 5, otherwise print
        // "Not divisible by if 5" if the number cannot be divided by 5.

        //1.way
        int a=16;

         if (a%5==0){
            System.out.println("Divisible by 5");

         }

         if (a%5 !=0){
             System.out.println("Not divisible by if 5");

         }

        //2.way

        if (a%5==0){
            System.out.println("Divisible by 5");

        }else {
            System.out.println("Not divisible by if 5");
        }



     }





    }


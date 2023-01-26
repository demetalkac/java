package friend_class;

import java.util.Scanner;

public class Mentor01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        //1. Given two positive integer numbers
        //
        //     integer 1 is min
        //     integer 2 is max
        //
        //    create a random number between min and max output should be int.

        int min= 4;
        int max= 7;


        //2. Given a positive integer num name is max ,create a random number between 0 to max

        int maximum= 76;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

       //3. Given int number print all the even numbers from 0 to int number
        //    Example 1:
        //    int input = 10;
        //    print should be 0 2 4 6 8 10
        System.out.println("Enter an even number");
        int n = input.nextInt();

        // for (int i =0; i<=n; i++){
        //     if (i%2==0){
        //      System.out.print(i +" ");
        //     }
        // }


        //    Example 2:
        //    int input = 15;
        //    print should be 0 2 4 6 8 10 12 14
        for (int i= 0; i<=n; i++){
            if (i%2!=0){
                System.out.print(i +" ");
            }
        }

        //4.   Given a String ,if the count of the letter in the String is odd print true else print false

         String str = "I like the summer";
        String letters =str.replaceAll("[^a-zA-Z]","");
        System.out.println(letters);
        int l= letters.length();
        System.out.println(l);
       boolean result=  l%2!=0 ? true : false;
        System.out.println(result);

          /*
       5. Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1
         */

        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        String n1 = num1.replaceAll("[^0-9]","");
        String n2 = num2.replaceAll("[^0-9]","");
        String n3 = num3.replaceAll("[^0-9]","");

        int number1 =Integer.valueOf(n1);
        int number2 =Integer.valueOf(n2);
        int number3 =Integer.valueOf(n3);

        System.out.println(number1 + number2 + number3); //65

    }
}

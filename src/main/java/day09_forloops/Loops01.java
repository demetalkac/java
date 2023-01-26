package day09_forloops;

public class Loops01 {
    public static void main(String[] args) {

   //Example 1: Type code to reverse a String
   // For ex: Tom ==> moT

   String name= "Mark";

   String reversedName= "";

   for (int i=name.length()-1; i>=0; i--){

       char ch= name.charAt(i);
       reversedName= reversedName + ch;

   }
        System.out.println(reversedName); //kraM


       String lastName= "Johnson";
        String reversedLN= "";

       for (int i= lastName.length()-1;  i>=0;  i--){
           char ch2= lastName.charAt(i);
           reversedLN= reversedLN+ ch2;
       }
        System.out.println(reversedLN); //nosnhoJ


       //Example 2: Find the sum of the integers from 3 to 6

        int sum= 0;

        for (int i=3; i<7; i++){
            sum = sum+i;
        }
        System.out.println(sum); //18


        //Example 3:  Find the multiplication of the integers from 3 to 6

        int multiplication=1;

        for (int i=3;  i<7;  i++){
            multiplication= multiplication*i;
        }
        System.out.println(multiplication); //360


        //Example 4: Type code to find the sum of digits of an integer
        // 584 ==> 5+8+4= 17 ==> %10 AND ORDINARY DIVISION BY 10

        int sumOfDigits= 0;
        int num= -584;

        num= Math.abs(num);

        for (int i= 584; i>0; i=i/10){
            sumOfDigits= sumOfDigits + i%10;
        }

        System.out.println(sumOfDigits); //17



        //Math.abs()==> gives the positive value of the integer.
        // Even if it is negative, abs() will convert the value to positive value.



    }
}

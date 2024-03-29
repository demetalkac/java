package day05ternarystringmainpulation;

public class NestedTernary01 {
    public static void main(String[] args) {

   /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        1) If the year is divisible by 100 then it must be divisible by 400. ==> 1600+, 2000+, 1800-
        2) If a year is not divisible by 100 then it must be divisible by 4. ==> 2004+,  1996+, 2021-
   */

    int year= 1600;

   String isLeap = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap"  );

        System.out.println(isLeap);


    /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i'
        If it has no more than 8 characters initial should be 'K'
        Solve the task by using nested-ternary
    */

        String pwd = "ia1b3cXyz";  //"K123" 2.part

//     String isValid = pwd.length()>8 ? (pwd.charAt(0)=='i' ? "Valid" : "Invalid" ) : (pwd.charAt(0)=='K' ? "Valid" : "Invalid" );

        char ilkHarf = pwd.charAt(0);
        String isValid = pwd.length()>8 ? (ilkHarf=='i' ? "Valid" : "Invalid" ) : (ilkHarf=='K' ? "Valid" : "Invalid" );

        System.out.println(isValid);

// length() :Kac tane karakter oldugunu verir

    }
}

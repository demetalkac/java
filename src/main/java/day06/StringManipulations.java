package day06;

public class StringManipulations {
    public static void main(String[] args) {

        /*
        java.lang package is used to create a string object

        By string literal : 	String str = "Apple";
        By new keyword : 	String str = new String("Apple");

    */

       // Count the alphabetic characters in a given String
       // TomHanks!...==>

        String name= "        Tom12     Hanks!....  Hello...     ";
        int numOfLetters= name.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);

        /*
        If your code gives you correct output for some data but if it is not giving you correct output for some other data this is called "Hard coding".
        It is not accepted.

        If your code works for all data it is called "Dynamic coding"
         */

        String name2= "Tom";
        int numOfLetters2= name2.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters2);



    }
}

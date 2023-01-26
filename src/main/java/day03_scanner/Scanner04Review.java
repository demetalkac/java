package day03_scanner;

import java.util.Scanner;

public class Scanner04Review {
    public static void main(String[] args) {

        //Example 1: Get first, middle, last name and SSN from the user then print them the given format
        // Tom Jim Hanks
        //235698741

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first name");
        String firstName=input.next();

        System.out.println("Enter the middle name");
        String middleName=input.next();

        System.out.println("Enter the last name");
        String lastName= input.next();

        System.out.println("Enter the SSN name");
        String ssn=input.next();


        System.out.println(firstName+ " " + middleName+ " "+lastName);
        System.out.println(ssn);






    }
}

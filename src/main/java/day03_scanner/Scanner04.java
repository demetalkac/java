package day03_scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Example 1: Get first, middle, last name and SSN from the user then print them the given format
        // Tom Jim Hanks
        //235698741  kimlik numaraları matematik islemde kullanılmayacagı icin String seklinde kullanıyoruz.

        Scanner input= new Scanner(System.in);
//     1. way:
        //Getting the First name
        System.out.println("Enter your first name");
        String firstName= input.next();

        //Getting the middle name
        System.out.println("Enter your middle name");
        String middleName= input.next();

        //Getting the last name
        System.out.println("Enter your last name");
        String lastName= input.next();

        //Getting SSN
        System.out.println("Enter your SSN");
        String ssn= input.next();

        System.out.println(firstName + " " + middleName+ " "  + lastName);
        System.out.println(ssn);

//     2.way:
        System.out.println("Ilk, orta, soy isminizi ve kimlik numaranızı giriniz");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta+ " "  + soy);
        System.out.println(kimlik);

//     3.way:
        System.out.println("Ilk, orta, soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String kimlik2 = input.next();
        System.out.println(ilk + " " + orta+ " "  + soy);
        System.out.println(kimlik);

    }



}

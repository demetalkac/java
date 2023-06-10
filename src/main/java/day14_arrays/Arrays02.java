package day14_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays02 {

    //Mac ==> Command
    //Windows ==> Ctrl
    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date= "09/20/2022";
       //split() method return Array
        String dateArray[]= date.split("/");
        System.out.println(Arrays.toString(dateArray));

        System.out.println("Mont:"+ dateArray[0]);
        System.out.println("Day:"+ dateArray[1]);
        System.out.println("Year:"+ dateArray[2]);


        System.out.println("================================");

        //Get the String  from user and type code to find the number of words in the String.
        //"I like to move it,move it"==>7

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a sentence...");
        String str= input.nextLine();

        String arr[]= str.split(" ");

        System.out.println("The number of the words:"+ arr.length);


        //Example 3: Count the number of words starts with "a" in the String

        int counter=0; //flag : bazı durumların var olup olmadıgını kontrol etmek icin "flag" kullanılır.

        for (String w: arr){
            if (w.startsWith("a")  || w.startsWith("A")){

                 counter++;
            }
        }
        System.out.println(counter+ " words starts with a");


       //From here on from the lesson of Suleyman teacher
        //Example 4: Type code to find the longest word in the sentence
        String s = "I want to go to university to learn more";
// NOT: Eger cümlede noktalama isaretleri var ise önce onlardan kurtulmalıyız, sonra kelimeleri ayırmalıyız.
//        s.replaceAll("\\p{Punct}", "");

        String words[] = s.split(" "); // split ile ayırdıktan sonra bircok element olacagı icin Array konteynerina koyuyoruz.
        System.out.println(Arrays.toString(words));//[I, want, to, go, to, university, to, learn, more]
        Arrays.sort(words, Comparator.comparingInt(String::length));  //"Comparator"  2 parametre ile calısır.
//                                                              sort() unu "Comparator" olanı seciyoruz yoksa sort alfabetik olarak sıralar
//                                                             Comparator. karsılastır demek, (String::length) string icinde length'e gire karsılastır ve sırala.
        System.out.println(Arrays.toString(words));//[I, to, go, to, to, want, more, learn, university]
        System.out.println(words[words.length-1]);//university











    }
}

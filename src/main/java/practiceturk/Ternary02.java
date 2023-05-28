package practiceturk;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args){
        /*
        Kullanıcıdan final notunu A, B, C seklinde girmesini isteyiniz
        'A' -> "Cok Basarılı"
        'B' -> "Basarılı"
        'C' ->  "Orta"  , bu notlar dısında ise "Digerleri" yazdırınz. nested ternary ile cöznz
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");
        String finalNotu = scan.nextLine();

       String result = finalNotu.equalsIgnoreCase("A") ? "Cok Basarılı" :
                       finalNotu.equalsIgnoreCase("B") ? "Basarılı"  :
                       finalNotu.equalsIgnoreCase("C") ? "Basarılı" :
                               "Digerleri";
        System.out.println(result);

    }
}

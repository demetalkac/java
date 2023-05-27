package practiceturk;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        // kullanıcıdan iki sayı alin ve büyük olmayan sayıyı yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 2 sayı giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1<sayi2){
            System.out.println("Kücük sayı "+ sayi1);
        } else if (sayi1>sayi2) {
            System.out.println("Kücük sayı "+ sayi2);
        }else System.out.println("sayılar birbirine esittir");


        //ternary
       Object kucukSayı =  sayi1==sayi2 ? "Sayılar esittir" : sayi1 > sayi2 ? sayi2 : sayi1;
        System.out.println(kucukSayı);



        //kullanıcıdan 4 basamaklı bir sayı alın:
        //  girdigi sayı 5'e bölünüyorsa son rakamı kntrol edin: -son rakam 0 ise ekrana "5e bülünen cift sayı" yazdrn
        //                                                        -son rakam 0 degil ise ekrana "5e bülünen tek sayı" yazdrn
        // girilen sayı 5 e bölünmüyorsa ekrana "tekrar deneyin" yazdrn

        System.out.println("lütfen 4 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
         if (sayi<1000 || sayi>9999){
             System.out.println("litfen 4 basmaklı pozitif sayı giriniz");
         } else if (sayi%5==0 ) {
             if (sayi%10==0){
                 System.out.println("5'e bölünen cift sayı");
             }else {
                 System.out.println("5'e bölünen tek sayı");
             }
         }else {
             System.out.println("tekrar deneyin");
         }

    }
}

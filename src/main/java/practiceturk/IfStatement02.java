package practiceturk;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //kullanıcıdan 0 ve 120 aralıgında yas alın. - kadın ise ve 60 ve üstü yasında ise emekli
        //                                           - erkek ise 65 yas ve üstü ise emekli ,olacagını
        Scanner scan = new Scanner(System.in);
        System.out.println("litfen cisiyetinizi griniz :" + "\n Kadıns icin K  \n erkek icin E HARFİNİ GİRNZ..");
        char cinsiyet =scan.next().toUpperCase().charAt(0);
        System.out.println("litfen yasınızı   giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 || yas>120){
                System.out.println("lütfen dogru yas degeri giriniz");
            } else if (yas>=60 ) {
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olman icin "+ (65 - yas) + "yıl daha calısmalısın");
            }

        } else if (cinsiyet=='E') {
            if (yas<0 || yas>120){
                System.out.println("lütfen dogru yas degeri giriniz");
            } else if (yas>=60 ) {
                System.out.println("emekli olabilirsin");
            }else {
                System.out.println("emekli olman icin "+ (65 - yas) + " daha calısmalısın");
            }
        }else {
            System.out.println("Lütfen gecerli harf giriniz");
        }

    }
}
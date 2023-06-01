package practiceturk;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

        //1) Kullanıcıdan baslangıc, bitis ve artis miktarını alarak aradaki tüm sayılari ,aralarında virgul koyarak yazdırın.

        int baslangic =10;
        int bitis = 50;
        int artisMiktari= 5;

        for (int i=baslangic; i<=bitis; i+=artisMiktari){
            if (i<bitis){
                System.out.print(i+",");
            }else
                System.out.println(i); // en sondaki virgulu koymamak icin

        }

 //**INTERWIEV** example 2) Kullanıcıdan 100'den kücük bir tam sayı isteyin
 //         1'den baslayarak girilen sayıya kdar tum sayıları yazdırın. Ancak:
 //         - Sayı 3'un katı ise sayı yerine "Java" yazdırın
 //         - Sayı 5'in katı ise sayı yerine "Guzeldir" yazdırın
 //         - Sayı 3'un ve 5'in katı ise sayı yerine "** Java Guzeldir **" yazdırın

          Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100'den kucuk bir sayı giriniz");
        int sayi =scan.nextInt();

        for (int i=sayi; i<100; i++){
            if (i%3==0 && i%5==0){
                System.out.print("** Java Guzeldir **");
            } else if (i%5==0) {
                System.out.print("Guzeldir ");
            } else if (i%3==0  ) {
                System.out.print("Java ");
            }else System.out.print(i+" ");

        }
        System.out.println("===========================================================");

//  example 3) Kullanıcıdan bir cumle ve bır harf alın. Cumlede verilen harfin kac kere bulundugunu bulup yazdırın
//   ör: cumle: java guzeldır ==> a harfi 2 kere kullanılmıs

        System.out.println("Lutfen bir cumle girin");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir harf girin");
        char harf = scan.next().toLowerCase().charAt(0);

        int sayac =0;

        for (int i=0; i<cumle.length(); i++){

            if (cumle.charAt(i)==harf){
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede "+harf + " harfi " +sayac + " tanedir");


    }
}

package practiceturk;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        /*
       - Kullanıcı 0'dan büyük tam sayı girmesini isteyn
       - Girilen sayı 3 basamaklı ise ekrana "3 Basamaklı" ,
        3 basamaklı degilse cift olup olmadıgını kontrol edin.
        -Sayı cift ise "3 basamaklı olmayan cift sayı" yazdırın,
        cift degilse ise "3 basamaklı olmayan tek sayı" yazdırın,
         */
        Scanner scan = new Scanner(System.in);
     //   System.out.println("lütfen 0'dan buyuk pozitif bir tamsayı girin");
        System.out.println("lütfen pozitif bir tamsayı girin");
        int sayi = scan.nextInt();

      // String ucBasamak= sayi>99 && sayi<1000 ? "3 Basamaklı" : sayi%2==0 ? "3 basamaklı olmayan cift sayı" :"3 basamaklı olmayan tek sayı";
      //  System.out.println(ucBasamak);

      String  sonuc= sayi>0 ? (sayi>99 && sayi<1000) ? ("3 basamaklı 0'dan büyük") :sayi%2==0 ? "3 basamaklı olmayan cift sayı" :"3 basamaklı olmayan tek ":
                     "Lütfen sifirdan buyuk sayı girin";
        System.out.println(sonuc);


       //if-else ile

       if (sayi >0){
           if (sayi>99 && sayi<1000){
               System.out.println("3 basamaklı pozitif sayı");
           } else if (sayi%2==0 ) {
               System.out.println("3 basamaklı olmayan cift sayı");
           }else
               System.out.println("3 basamaklı olmayan tek ");

       }else System.out.println("Lütfen sifirdan buyuk sayı girin");

    }
}

package practiceturk;

import java.util.Scanner;

public class IfStatement_ASCIDegerleri {
    public static void main(String[] args) {
        /*
        Bir iscinin isi bitirme süresini ve toplam isci sayısını alarak, isin bitirme süresini hesaplayan kodu yazın
        ör: 1 isci bir isi 10 günde yaparsa, 2 isci aynı isi kac günde yapar?

        ekranda:
        -Bir isci isi kac günde bitirmektedir?
        -Toplam kac isci calısacak?
        - Isin bitme süresi ? gindür.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isci isi kac günde bitirmektedir?");
        double bitmeSüresi = scan.nextDouble();

        System.out.println("Toplam kac isci calısacak?");
        double isciSayısı = scan.nextDouble();

        double birlikteBitirmeSüresi = bitmeSüresi / isciSayısı;
        System.out.println(birlikteBitirmeSüresi);

        System.out.println("==================================");

//  ASCII DEGERLER: 1- Toplamaya etkisi olmayan "0" ile ASCII degerini bulmak istedigimiz char karakterini toplarız
//                  2- ASCII degerini bulmak istedigimiz karakteri bir konteynera koyup onu yazdırabiliriz.

        char harf1 ='a';
        char harf2 = 'A';
        System.out.println("harf1>harf2 ==>" + (harf1>harf2)); //true

// Herhangi bir char varieble'ın ASCII degerlerini kod yazarak bulunuz
 //1.yol
        char space = ' ';
        System.out.println("space ASCII degeri = " +(space+0)); //32

        char n = 'n';
        System.out.println("n ASCII degeri = " + (n+0));

//2.yol

        int harf3 = 'n';
        System.out.println("n ASCII degeri = " + harf3);



    }
}

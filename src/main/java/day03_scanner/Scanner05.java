package day03_scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Example: Sayıları kullanıcıdan alan ve toplama islemi yapan kodu yazın

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz.");
        double sayi1 = input.nextDouble();

        System.out.println("İkinci sayıyı giriniz.");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);

//   EXCAMPLE2: Kullanıcıdan ilk ve soy ismini alınız. İlk ve soy isminin ilk harflerini ekrana yazdırınız.
        //Ali Can
// 1.yol:
        System.out.println("ilk isminizi giriniz");
        char firstName= input.next().charAt(0);

        System.out.println("soy isminizi giriniz");
        char lastName= input.next().charAt(0);

        System.out.println(firstName + lastName); //132

        System.out.println(" " + firstName + lastName); //AC

//NOT: char variable'ları matematiksel islemlerde kullanırsanız, Java onların ASCII degerlerini kullanır

//not: Java'da "+" sembolunun 2 anlamı var: 1- Toplama islemi    2- Birlestirme islemi(concatenation)


//    2.yol:
        System.out.println("Tam isminizi giriniz");
        String tamIsim = input.nextLine();
       char ilkHarf= tamIsim.charAt(0);
        System.out.println(ilkHarf);
        char ikinciHarf= tamIsim.split(" ")[1].charAt(0);
        System.out.println(ikinciHarf);



    }
}

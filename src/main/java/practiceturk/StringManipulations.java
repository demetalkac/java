package practiceturk;

import java.util.Scanner;

public class StringManipulations {

    public static void main(String[] args){

        System.out.println(15 + 30 + "Merhaba");   //45Merhaba
        System.out.println("Merhaba" + 15 + 30);   //Merhaba1530
        System.out.println("Merhaba" + (15 + 30)); //Merhaba45
        System.out.println("Merhaba" + 15 * 30);   //Merhaba450

 //  Kullanıcıdan isim ve soy isim girmesini isteyin, sonrasında kullanıcı nasıl girerse girsin konsolda
  //  isimin tamamı büyük harfle yazılmıs olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ism ve soyisminizi giriniz");
        String name = scan.nextLine().toUpperCase();
        System.out.println(name);

        System.out.println("============================================");
 //            "substring" :
 // 10. index dahil sonuna kadar verilen Stringi yazdırn
        String cumle = "her insan ozeldir, bunu herkes bilir";
        System.out.println("her insan ozeldir, bunu herkes bilir : " + cumle.substring(10)); //ozeldir, bunu herkes bilir

// son 10 harfi yazdırın
        System.out.println(cumle.substring(cumle.length()-9)); //kes bilir

// ilk 10 karakteri alma
        System.out.println(cumle.substring(0,11)); //her insan o

        System.out.println("====================================================");
//         "replace" : metin icindeki karakter/karakterlerin yerine baskalarını koymak
    /*    (regular expression-regex-)
    1) \\d  ==> tum rakamları
       \\D  ==> tum rakam dısı karakterleri

     */

        String str2 = "$45.99";

//    rakam haricindekileri silin

        String str3 =str2.replaceAll("\\D","");
        System.out.println("str3 = " + str3);

//    verilen cumleyi * ile gizleyin ve ,10 karakterden sonrasını yazdırın
        String cumle2 = "her insan ozeldir, bunu herkes bilir";
        System.out.println( cumle2.replaceAll("\\w","*")+ cumle2.substring(10));

//   "replaceFirst :ilk bulunan karakteri degistirir 

        String str4 ="merhaba dunya";
// verilen string deki a'ları e ile degistrn

        String b = str4.replaceAll("a","e"); //merhebe dunye
        System.out.println("b = " + b);

      String a= str4.replaceFirst("a","e");
        System.out.println("a = " + a); //merheba dunya

        System.out.println("====================================================");
//     "startsWith"
     String text = "Kazananlar hic hata yapmayanlar degil, vazgecmeyenlerdir";

//     "Ka" ile baslıyor mu?
        System.out.println(text.startsWith("Ka")); //true

//    "dir" ile bitiyor mu?
        System.out.println(text.endsWith("dir")); //true

//     " isEmmty"

        System.out.println(text.isEmpty()); //false

      String st1=""; //hiclik
        System.out.println(st1.isEmpty()); //true

        String st2=" ";  //space
        System.out.println(st2.isEmpty());  //false


 //    Kullanıcıdan alacagınız bir stringde bosluk karakterinn olup olmadıgını kontrol edin

        System.out.println( "lütfen bir cümle giriniz");
        String cumleee= scan.nextLine();
        if (cumleee.contains(" ")){
            System.out.println("bu stringte bosluk karekteri var ");
        }else {
            System.out.println("bu stringte bosluk karekteri yok ");
        }


//     Kullanıcıdan isim ve soyisim isteyin ve hangisinin daha uzun oldugunu yazdırın
        System.out.println("lütfen isminizi girin");
        System.out.println("lütfen soy isminizi girin");
        String isim= scan.nextLine();
        String soyIsim= scan.nextLine();

        if (isim.length()== soyIsim.length()){
            System.out.println("karekter sayısı esittir");
        } else if (isim.length() > soyIsim.length()) {
            System.out.println("isim daha uzun");
        } else {
            System.out.println("soyisim daha uzun");
        }


//     Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın

       String kelime = "Ayse";
        if (kelime.length()==4){
            char bir= kelime.charAt(0);
            char iki= kelime.charAt(1);
            char uc= kelime.charAt(2);
            char dort= kelime.charAt(3);
            System.out.println("tersten yazılımı :" + dort+uc+iki+bir);

        } else if (kelime.length()>4) {
            System.out.println("Girdiginiz kelime 4 karekterden fazla");
        } else if (kelime.length()<4) {
            System.out.println("Girdiginiz kelime 4 karekterden fazla");
        }


    }
}

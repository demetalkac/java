package practiceturk;

import java.util.Scanner;

public class Variables_Sout {

    /*
    variable : bellekte (memory) ayrılmıs olan alanın (reerved area) adıdır.
              -uygun data türü secilmeli
     */
    public static void main(String[] args) {
        System.out.println("hello word");
        
        
        int i =1;
        
        
        boolean yagısVarMı = false;
        System.out.println("yagısVarMı = " + yagısVarMı);
        
        /*

        ctrl+alt+l ==> sayfayı düzenler
        \n         ==>alt satıra gecirir
        \t         ==> tab bosluk brakır
        \b         ==> gerisindeki harfi s,iler

        \\: :\ (ters slash) yazdırır - prints a back slash
        \': ' tek tırnak yazdırır - prints single quote
        \" :"" cift tırnak  yazdırır - prnts double quote

         */


   /*ör:  Konsolda  asagıdaki cıktıyı yazdırın

        A
        L
        I

        C
        A
        N

    */
      //1.YOL


        System.out.println(" A");
        System.out.println(" L");
        System.out.println(" I");
        System.out.println(" ");
        System.out.println(" C");
        System.out.println(" A");
        System.out.println(" N");


        //2.YOL
        System.out.println("\nA\nL\nI\n\nC\nA\nN");

        // Kelime kelime alt alta yazdır

        System.out.println("\nALI\nCAN");

       // ALI CAN => ARASINDA BİR TAB BOSLUK OLACAK SEKİLDE YAZDIR
        System.out.println("ALI\tCAN");  //ALI	CAN


      //  ALI CAN => ARALARINDAKİ BOSLUK OLMAYACAK SEKİLDE KOD YAZ
        System.out.println("ALI \bCAN");

     // "techpro" ile java cok 'kolay'
        System.out.println("\"techpro\" ile java cok \'kolay\'");


    //ör: kullanıcıdan 3 basamaklı bir sayı alın ve sayının birler, onlar ve yüzler basamagındaki rakamı ekrana yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();

        int birlerBasamagı = sayi%10;
        System.out.println("birlerBasamagı = " + birlerBasamagı);

        sayi = sayi/10;

        int onlarBasmagı = sayi%10;
        System.out.println("onlarBasmagı = " + onlarBasmagı);

        sayi = sayi/10;

      int yuzlerBasamagı = sayi;
        System.out.println("yüzlerBasamagı = " + yuzlerBasamagı);



//ör: kullanıcıdan 5 basamaklı sayının ilk 2 ve son 2 basamagındaki rakamlafın toplamını bulunuz.
//     ör:  12345 => 1+2+4+5=12
        Scanner scan2 = new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz");
        int besBasamakliSayi = scan.nextInt();
/*
        int birler = besBasamakliSayi%10;

        besBasamakliSayi= besBasamakliSayi/10;

        int onlar =besBasamakliSayi%10;

        besBasamakliSayi= besBasamakliSayi/10;

        int yuzler =besBasamakliSayi%10;

        besBasamakliSayi= besBasamakliSayi/10;

        int binler = besBasamakliSayi%10;

        besBasamakliSayi= besBasamakliSayi/10;

        int onbinler= besBasamakliSayi%10;

        System.out.println(birler+onlar+binler+onbinler);

 */
        int ilkIkiSayi = besBasamakliSayi/1000;  //12

        int ilkIkiSayiTop = ilkIkiSayi%10 + ilkIkiSayi/10;  //1+2=3

        int sonIkiSayi = besBasamakliSayi%100; //45
        int sonIkiSayiTop = sonIkiSayi%10 + sonIkiSayi/10; //4+5=9

        System.out.println(ilkIkiSayiTop + sonIkiSayiTop);


    }


    

}

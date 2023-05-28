package practiceturk;

import java.util.Scanner;

public class SwitchCase02 {
    public static void main(String[] args) {

// Exemple 1:    Girilen pozitif 3 basamaklı bir sayıyı yazı ile yazdırın
//     ex: 568  => besyuzaltmissekiz

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen 3 basamaklı pozitif bir sayı giriniz");
        int sayi = scan.nextInt();

       int birlerBasamagi = sayi%10;
       int onlarBasamagi = (sayi/10)%10;
       int yuzlerBasamagi = sayi/100;

       if (sayi>99 && sayi<1000){
           //yuzler basamagı
           switch (yuzlerBasamagi){
               case 0:
                   System.out.print("");
                   break;
               case 1:
                   System.out.print("Yuz");
                   break;
               case 2:
                   System.out.print("Ikıyuz");
                   break;
               case 3:
                   System.out.print("Ucyuz");
                   break;
               case 4:
                   System.out.print("Dortyuz");
                   break;
               case 5:
                   System.out.print("Besyuz");
                   break;
               case 6:
                   System.out.print("Altıyuz");
                   break;
               case 7:
                   System.out.print("Yediyuz");
                   break;
               case 8:
                   System.out.print("Sekizyuz");
                   break;
               case 9:
                   System.out.print("Dokuzyuz");
                   break;
           }
           switch (onlarBasamagi){
               case 0:
                   System.out.print("");
                   break;
               case 1:
                   System.out.print("On");
                   break;
               case 2:
                   System.out.print("Yirmi");
                   break;
               case 3:
                   System.out.print("Otuz");
                   break;
               case 4:
                   System.out.print("Kirk");
                   break;
               case 5:
                   System.out.print("Elli");
                   break;
               case 6:
                   System.out.print("Altmıs");
                   break;
               case 7:
                   System.out.print("Yetmis");
                   break;
               case 8:
                   System.out.print("Seksen");
                   break;
               case 9:
                   System.out.print("Doksan");
                   break;
               default:
           }
           switch (birlerBasamagi){
               case 0:
                   System.out.println("");
                   break;
               case 1:
                   System.out.println("Bir");
                   break;
               case 2:
                   System.out.println("Iki");
                   break;
               case 3:
                   System.out.println("Uc");
                   break;
               case 4:
                   System.out.println("Dort");
                   break;
               case 5:
                   System.out.println("Bes");
                   break;
               case 6:
                   System.out.println("Altı");
                   break;
               case 7:
                   System.out.println("Yedi");
                   break;
               case 8:
                   System.out.println("Sekiz");
                   break;
               case 9:
                   System.out.println("Dokuz");
                   break;

           }

       }else System.out.println("lütfen 3 basamaklı bir sayı giriniz");

        System.out.println("=====================================================");


        /*
        Exemple 2:
        Kullanıcıdan ilk 3 buyuk harfden birini secildiginde cumle yazdıran kod yazınız
        ÖR:Kullanıcı A, B, C harflerinden birını secsin
        'A' secerse -> "Java kolay"
       'B' secerse-> "Java eglenceli"
        'C' secerse->  "Java calısmalıyım"
         */

        System.out.println("Lutfen su harflerden birini giriniz : \nA\nB\nC");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'A':
                System.out.println("Java kolay");
                break;
            case 'B':
                System.out.println("Java eglenceli");
                break;
            case 'C':
                System.out.println("Java calısmalıyım");
                break;
            default:
                System.out.println("Lutfrn gecerli harf bir giriniz");
        }

    }
}

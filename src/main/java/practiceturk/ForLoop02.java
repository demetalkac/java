package practiceturk;

import java.util.Scanner;

public class ForLoop02 {

    public static void main(String[] args){
  /*
   Kullanıcıdan bir kelime isteyin.Alınan kelimenin karakter dizisinin her harfi ve
  bu harfin karakter dizisi icindeki indexini yazdırın

     ornegın: ıstanbul
     Karakter        Index
      ı                0
      s                1
      t                2
      a ...               3...

   */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine();

        int index = 0;

        System.out.print("\tKarakter" + "\tIndex");

        for (int i=0; i<kelime.length(); i++){
            System.out.println(); //her harf ve indexini yazdıktan sonra bi alt satıra gecsin diye sout'u yazdık.
            System.out.print("\t\t"+kelime.charAt(i)+ "\t\t"+index);
            index++;

        }

        System.out.println("====================================");

//   Kullanıcıdan alınan bir Stringin ilk ve son harfini yine kullanıcıdan alınan sayı kadar tekrarlayan kodu yazınız
//   ör:   input        output
//         elma 2       eaea
//        aynur 3       ayayay

        System.out.println("Lutfen bir kelime griniz");
        String kelimee= scan.nextLine();
        System.out.println("Lutfen kac kere tekrarlanmasini istiyorsanız  sayı ile belirtiniz");
        int tekrar = scan.nextInt();

        String ilkSonHarf = kelimee.substring(0,1)+kelimee.substring(kelimee.length()-1);
        String cikti="";

        for (int i=1; i<=tekrar; i++){
            cikti+=ilkSonHarf;   //      cikti=cikti+ilkSonHarf
        }
        System.out.println(cikti);



    }
}

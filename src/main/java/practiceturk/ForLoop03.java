package practiceturk;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args) {

 //  Kullanıcıdan aldıgınız 'a' ve 'c' iceren bir String deger icerisindeki 'c' karakterinden önceki
//   'a' karakterinin sayısını bulan b,ir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bır string griniz");
        String str = scan.nextLine();

      int counter =0;
      for (int i=0; i<str.length(); i++){

          if (str.charAt(i)=='a'){
              counter++;
          } else if (str.charAt(i)=='c') {
              break;
          }
      }
        System.out.println(" 'c' öncesi 'a'ların sayısı :" + counter);



//ex:1- 1'den 100'e kadar hic rakam kullanmadan sayıları konsola yazdırınız. (ASCII)
        for (int i = 'a'/'a'; i <='d' ; i++) { //a'nın ASCII degeri 97 , d'nın 100
            System.out.print(i+" ");
            
        }



//ex:2-  Girilen bir stringin harflerini teker teker ekrana alt alta olacak sekilde yazdırınz.
//       Bosluk veya a harfi geldiginde yazmasın

        System.out.println("Lutfen bir cumle giriniz.");
        String cumle = scan.nextLine();

        for (int i = 0; i < cumle.length(); i++) { //karakterler
            if (cumle.charAt(i) == 'a' || cumle.charAt(i)==' ') {
                continue;
            }
                System.out.println(cumle.charAt(i));


        }







    }
}

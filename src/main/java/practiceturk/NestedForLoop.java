package practiceturk;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

  // Dikey olarak bulunan bir agac seklini cızınız. Agacın tac uzunlugunu kullanıcıdan alınız.
  // not: govde sabit sayi: 5 olsun

   /*
   ^
   ^^
   ^^^
   ^^^^
   ^^^^^
   ^^^^^^
   |||
   |||
   |||
   |||
   |||


    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen agacın tac uzunlgunu griniz");
        int tac =scan.nextInt();

        String yaprak = "";
        for (int i = 0; i < tac; i++) {
            yaprak+="^";
            System.out.println(yaprak);

        }

            for (int j = 0; j < 6; j++) {
                System.out.println("|||");

            }






    }
}

package day10_forloops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // while -  loop ==> zero execution is possible, {cünkü 1'den basladı 1 de bitti kod kırılır, 1 1'den büyük degil]

        int i=1;
         while (i<1){
             System.out.println("while loop");
             i++;
         }

         // do-while kullandıgımızda loop body'si icindeki kod en az bir kere calısır. do-while icin "zero execution" mümkün degil
         //When you use do-while loop, zero execution is impossible, loop body will be executed at least for once
         // If it is mandatory to execute the code inside the loop body at least once, use do while loop
        int k=1;

         do {
             System.out.println("do-wile loop");
             k++;
         }while (k<1);

          /*
              Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
	     */

        Scanner input= new Scanner(System.in);
         int num= 0;
        do {
            System.out.println("Enter a number to play");
            num= input.nextInt();

            if ( num< 100){
                System.out.println("Wow!");
            }

        }while (num<100);

        System.out.println("Lost");


        //infinite loops
        // Note: If you do mistake in increment or decrement part. the loop will be infinite loop.
        // Do not create infinite loop
        //Yani artırma ve azaltma kısmında hata yaparsak VEYA bu kısmı hic yazmassak "infinite loops" olusur.


        for (int p=1; p<10; p--){

            System.out.println(p+ " ");
        }

        //NOT:Bazen "increment" yeya "decrement" kısmını koymadan kod yazarız, fakat  "break" koyarak loop'u kırarız ve sonsuz döngüden kurtarırız..


        int r=0;
        while (true){
            System.out.println("Hi!");
            r++;

            if (r==5){
                break;
            }
        }

//   Example 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz

        //     24.5673  ==>5+6+7+3 = 23

        double numm = 24.5673;
        System.out.println(numm);

        //String.valueOf() methodu parantezin icine konulan data nın tipine String yapar
        String str = String.valueOf(numm);  //decimal kısmı ayırmak icin string methodlarına ihtiyacımız var.
        System.out.println(str); //24.5673


        //REGEX icin nokta kullandıgınızda önüne "\\" koyunuz. "\\." seklinde kullanınız.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart); //5673

       int decimalInt = Integer.valueOf(decimalPart);  // islemimize devam etmek icin (toplama-cıkarma yapabilmek icin) stringi int'e cevirdik.

        int sum = 0;
        do{

            sum = sum + decimalInt%10;
            decimalInt = decimalInt/10;

        }while (decimalInt>0);

        System.out.println(sum);


    }
}

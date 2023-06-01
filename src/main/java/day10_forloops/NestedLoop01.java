package day10_forloops;

import java.util.Scanner;

public class NestedLoop01 {

    public static void main(String[] args) {
        /*
           1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....

         not: nested looplarda önce en dıstaki looptan baslanır yazmaya
         */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week:" + i);

            for (int k = 1; k < 8; k++) {
                System.out.println("Day:" + k);
            }
        }
        System.out.println();

        /*
            2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int row = input.nextInt();

        System.out.println("Enter the number of the columns");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int k = 2; k <= column; k++) {
                System.out.print("*");
            }
            System.out.println(); // her döngüde bi alt satıra gecmesi icin
        }
        System.out.println();


    /*
            Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of the rows");
        int row= input.nextInt();

        System.out.println("Enter the number of the columns");
        int column= input.nextInt();

        System.out.println("karakter seciniz");
        char ch = input.next().charAt(0);

        for (int i=1;  i<=row; i++){

            for (int k=2; k<=column; k++){
                System.out.print(ch);
            }
            System.out.println(); // her döngüde bi alt satıra gecmesi icin
        }


     */





        /*
        3. Example:  type code to get the output like
             1
             1 2
             1 2 3
             1 2 3 4
             1 2 3 4 5
         */

        System.out.println("Enter the number of the rows");

        int numOfRows = input.nextInt();

        for (int i = 1; i <= numOfRows; i++) {

            for (int k = 1; k <= i; k++) { // 2.loop da k satır sayısı kadar rakam yazar, yani k i'nin aldıgı satır rakamı ne ise o kadar yana yazacak
                System.out.print(k + " ");
            }
            System.out.println();
        }
        System.out.println();




        /*
              *
            *   *
          *       *
         *         *
        * * * * * * *

        seklilde gorulen ucgeni yazdırınız
 */

        for (int i=1; i<=5; i++){  //satır
            for (int k=1; k<=9; i++){  //sutun

                if ((i==1 && k==5) || (i==2 && (k==4 || k==6)) || (i==3 && (k ==3 && (k==3 || k==7)) || (i==4 && (k==2 ||k==8)) || i==5)) {
                    System.out.println("*");
                }else
                    System.out.println(" ");

            }
            System.out.println();
        }
        System.out.println("==========================");

    }
}
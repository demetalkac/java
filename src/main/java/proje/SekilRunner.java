package proje;

import java.util.Scanner;

public class SekilRunner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapacagınız islem icin sekil secin");
        System.out.println("Dikdortgen = "+ 1);
        System.out.println("Kare = "+ 2);
        System.out.println("Cember = "+ 3);
        int sekil =scan.nextInt();




        switch ( sekil){
            case 1:System.out.println("Dikdortgenicin bir uzun bır kısa kenar griniz");
                Dikdortgen dikdortgen = new Dikdortgen(scan.nextDouble(),scan.nextDouble());
                dikdortgen.alan();
                dikdortgen.cevre();
                System.out.println(dikdortgen);
                break;

            case 2:
                System.out.println("Kare icin bir kenar griniz");
                Kare kare =new Kare(scan.nextDouble());
                    kare.alan();
                    kare.cevre();
                System.out.println(kare);
                    break;

            case 3 : Cember cember = new Cember(scan.nextDouble(),3.14,1);
                     cember.alan();
                     cember.cevre();
                System.out.println(cember);
                break;
            default:
                System.out.println("Gecersiz deger girdiniz");

        }







    }
}

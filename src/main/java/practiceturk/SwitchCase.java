package practiceturk;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        DERS PROGRAMI

        Hangi gün hangi dersin oldugunu gösteren program yazınız.

        Pazartesi ve Salı ise : Java
        Persembe ve Cuma ise : Selenium
        Carsamba ve Cumartesi ise : SQL
        AKSİ HALDE: izin günü: off day
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen gun ismi giriniz");
        String gun = scan.next().toUpperCase();

        switch (gun){

            case "PAZARTESİ":
            case "SALI" :
                System.out.println("JAVA");
                break;

            case "PERSEMBE" :
            case "CUMA"   :
                System.out.println("SELENIUM");
                break;

            case "CARSAMBA" :
            case "CUMARTESI" :
                System.out.println("SQL");
                break;
            default:
                System.out.println("OFF DAY");
        }


       // Kullanıcı yasadıgı gune göre: Kullanıcını verecegi gun kadar sonraki gunun hangi gun oldugunu yazdırınz
       // pazartesi hafta baslangıcı ,  BulunanGun = (kacgunSonrası + kacıncıGun) % 7;

        System.out.println("Pazartesi : 1 \t Salı : 2 \t Carsamba :3 \t Persembe :4 \t Cuma :5 \t Cumartesi :6 \t Pazar :7" +
                "Haftanın kacıncı gununde oldugunuzu giriniz");
        int kacinciGun = scan.nextInt();

        if (kacinciGun<=0 || kacinciGun>8){
            System.out.println("lütfen gün icin belirlenen numaralardan birini girin");
        } else  {
            System.out.println("Kac gun sonrasını bilmek istiyorsunuz ona göre sayı girin");
            int kacgunSonrası = scan.nextInt();
            int bulunanGun = (kacgunSonrası + kacinciGun) % 7;

            switch (bulunanGun){
                case 1:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Salı");
                    break;
                case 3:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Carsamba");
                    break;
                case 4:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Persembe");
                    break;
                case 5:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Cumartesi");
                    break;
                case 7:
                    System.out.println(kacgunSonrası + "gun sonra gunlerden Pazar");
                    break;
                default:
            }

        }


    }
}

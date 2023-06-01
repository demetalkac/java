package practiceturk;

public class DoWhileLoop {

    public static void main(String[] args) {

    /*
    Adada sadece 1 maymun var. Her gun 4 yemesi gerekiyor ve adada sadece 165 muz var.
    Asagıdaki degiskenleri olusturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yazız.
    int muzSayisi = 165, hayattaHalmaGun =0;
    boolean maymunAlive = true;

     */
        int muzSayisi = 165;
        int hayattaKalmaGun =0;
        boolean maymunAlive = true;

        do {
         muzSayisi-=4;
         hayattaKalmaGun++;

         if (muzSayisi<4)  {
             maymunAlive =false;
                System.out.println("bugun " +( hayattaKalmaGun+1)+ ". gun icin muz kalmadı.Maymun oldu");
         }  else System.out.println("bugun " + hayattaKalmaGun+ ". gun icin muz var.Maymun hayatta");


        }while (maymunAlive);
        System.out.println("Maymunun toplam yasadıgı sure :"+ hayattaKalmaGun);




    }

}

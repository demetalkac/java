package day14_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {

 //EXAMPLE 1: Bir ögretmenin sınıfındaki ögrencilerin isimlerini application'a yüklemesini saglayan kodu yazınız.
 //       (Kullanıcı ile beraber bir Array olusturunuz ve icine data ekleyiniz)
        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStudent = input.nextInt();

        String names[] =new String[numOfStudent];

        System.out.println("Girisi sonlandırmak icin Q harfine basınız.");

        for (int i = 1; i <=numOfStudent ; i++) {  // 1'den baslattık cinkü ögrenci isimlerini girerken indexe gerek yok

            System.out.println("Lutfen "+ i + ". ogrencinin ilk ismini giriniz");

            String strName =input.next();

            if (strName.equalsIgnoreCase("Q")){  // girilen isim q ya esit olmadıgı icin fols olur break calısmaz, ismi array'e ekler taki yorulup artık bırakmak istersek q harfini girince break calısır, kod kırılır.
                break;
            }

            names[i-1] = strName;

        }
        System.out.println(Arrays.toString(names));

        // [ali, eder, yasın, null, null, null,..] Array oldugu icin girdigimiz isimler gözüküyor girmedigimiz
        //  kısmı null olarak gözükür. Listlerde null lar da gözükmez, sadece grilen data gözükür bos olan kısım null olarak gözükmez.


//EXAMPLE 2: Bir Array'in icinde herhangi bir elementin olup olmadıgıni kontrol eden ve kac kere tekrarlandıdını gösteren kodu yazınız
//   [2, 1, 2, -3, 2] kullanıcı 2'i sordu ==> 2 elemanı var ve 3 kere tekrarlandı.
//                  kullanıcı 6'i sordu ==> 6 elemanı array de yok.

        int arr[] = {2, 1, 2, -3, 2};

        int element = 2;

        int counter = 0;  //flag

        for (int w : arr){
            if (w==element){
                counter++;
            }
        }

        if (counter>0){
            System.out.println(element + " array de " + counter + " defa var");
        }else {
            System.out.println(element + " array de yok");
        }


    }
}

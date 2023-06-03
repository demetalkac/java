package day13_arrays;

import java.util.Arrays;

public class ARR {
    public static void main(String[] args) {

    int sayı[] = new int[5];
    sayı[0] = 34;
    sayı[1] = 3;
    sayı[2] = 66;
    sayı[3] = 7;
    sayı[4] = 4;


        Arrays.sort(sayı);

        int ilk = sayı[0];
        int son= sayı[sayı.length-1];
        System.out.println(ilk+son);


     int top =0;

     for (int w:sayı){
         top =top+w;
     }
        System.out.println(top);

     String isim[] = new String[5];
     isim[0] ="ali";
     isim[1] ="alil";
     isim[2] ="alilll";
     isim[3] ="ali";
     isim[4] ="ayse";

     int karekters =0;

     for (String w:isim){
         karekters =karekters+ w.length();
     }
        System.out.println(karekters);


     char cr[]=new char[5];

     cr[0]='a';
     cr[1]='C';
     cr[2]='s';
     cr[3]='T';
     cr[4]='H';

        char crr[]={'a', 'C', 's','T','H'};

        for (char w:crr){
            if (w>='A' && w<='Z'){
                System.out.print(w);
            }
        }



    }
}

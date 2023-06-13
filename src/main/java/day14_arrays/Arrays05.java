package day14_arrays;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //EXAMPLE 1: Size verilen pozitif ve negatif sayılar iceren bir integer array deki "en buyuk negatif" ve "en kucuk pozitif" elemanı bulunuz.
       //Matematik classında yer alan  Math.max() ve Math.min() methodlarını kullanabilirz.
        int arr[] = {-12, 18, -5, 23, -2, 0};

        Arrays.sort(arr);

        int maxNegative = arr[0];   // sort()dan sonra ilk element negatif olur
        int minPositive = arr[arr.length-1];  // sort()dan sonra sondaki element pozitif olur

        for (int w :arr){
            if (w<0){
                maxNegative =Math.max(maxNegative, w);

            }
            if (w>0){
                minPositive =Math.min(minPositive, w);
            }

        }
        System.out.println("En buyuk negatife :" + maxNegative + " and  En kucuk positive sayı :" + minPositive); //En buyuk negatife :-2 and  En kucuk positive sayı :18

//EXAMPLE 1: Bir String'deki sesli harflerin sayısını bulan kodu yazınız
        //    a-e-i-u-o-A-E-I-O-U

        String str = "java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";

        str = str.toLowerCase(); // buyuk harfleri tek tek case olusturmak yerine bu kodu kullandık.

        String harfler[] = str.split("");

        int counter = 0;

        System.out.println(Arrays.toString(harfler)); //[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,  , k, a, z, a, n, m, a, k,  , k, o, l, a, y, ,,  , o, g, r, e, n, m, e, y, i, n, c, e,  , n, e,  , k, o, l, a, y,  , k, i, .]

        for ( String w: harfler){

            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter); //22

//NOT:  "switch" kullanırken case'lerin altına counter ve break koymadan yukardaki gibi de yazzabiliriz, kodu kısaltmıs oluruz.
//     Yani ;         case "a":
//                    counter++;
//                    break;      tek tek boyle yapmak yerine butun case'ler yerine en sonda sadece counter kullanmak yeterli
//                                break'e gerek yok. Bu switch'in özellligi.

    }
}

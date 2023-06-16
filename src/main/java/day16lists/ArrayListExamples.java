package day16lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {


    public static void main(String[] args) {

        //Example01 : "p" Arraylistindeki tum tek sayıları 11 artıkdan sonra ekrana yazdırın

        List<Integer> p = new ArrayList<>();
        p.add(19);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(25);
        p.add(56);

        for (int w :p){
            if (w%2!=0){
                p.set(p.indexOf(w),w+11); //indexOf() tek sayıların elementin indexini alıp 11 ile topluyor
             //   System.out.print(p.get(p.indexOf(w+11))); //30 34 36 => sadece update olan elementleri yazdırdı

            }
        }
        System.out.println(p); //[30, 34, 32, 14, 36, 56]

    }
}

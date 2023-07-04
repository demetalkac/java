package day28collections;

import java.util.PriorityQueue;

public class Queues03 {

    public static void main(String[] args) {

        /*
             "PriorityQueue"
        -Java kendine göre bir kural belirler ve ona göre elementleri sıraya koyar.Yani yazdıgımız sıraya göre veya alfabetik
         sıraya göre bir sıra yapmıyor, ama java bir sıra yapıyor fakat kendine göre bir sıra yapıp elemanları yerlestiriyor.
        -Biz istersek sıralamayı belirleyebiliriz.
         */

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        System.out.println(myQueue); //[A, C, B, G, E]

    }
}

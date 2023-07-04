package day28collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {


    /*

               "Queue"
           Queue<String> wareHouse = new LinkedList<>();
        1)Queue's are for storing multiple non-primitive data in the same data type
        2)Queue's are used for FIFO(First In First Out)

       - Queue interface'dır ve bu nedenle object olusturamayız.Queue olusturulurken ya LinkedList veya PriorityQueue ın constructorını kullanabiliriz.
       -Ilk giren eleman ilk kullanmamız FIFO(First In First Out) gerektiginde Queue en iyi secimdir.
       -Queue lar elemanları verilen sıraya(ınsertion order) göre dizer.
       -add(), peek(), poll(), element(), , remove() gibi ilk elemanı ilgilendiren bir cok method vardır.
       -offer() methodu kapasite kontrolu yapıldıktan sonra eleman ekleme durumlarında kullanılır.Eleman eklenirse true verir ,eklenemedi ise false verir.

               "Deque"
             Deque<String> furnitureTruck = new LinkedList<>();
       -Deque constructor olarak "LinkedList" i kullanır, cünkü parent'ı olarak normal class olarak LinkedList var, digerleri interfase.
       - Deque's are for storing multiple non-primitive data in the same data type
       "Deque" means "Double Ended Queue", it works successfully in FIFO and LIFO operations
       -Yani iki uclu queue demektir.FIFO ve LIFO gerektiginde beraber kullanılır.
       -removeLastOccurrence(), removeLast(), addFirst(), addLast() gibi ilk ve sona eleman ekleme-silme gibi bircok methoda sahiptir.

                              "PriorityQueue"
               PriorityQueue<String> myQueue = new PriorityQueue<>();
        -Java kendine göre bir kural belirler ve ona göre elementleri sıraya koyar.Yani yazdıgımız sıraya göre veya alfabetik
         sıraya göre bir sıra yapmıyor, ama java bir sıra yapıyor fakat kendine göre bir sıra yapıp elemanları yerlestiriyor.
        -Biz istersek sıralamayı belirleyebiliriz.

     */

    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);// [Milk, Meat, Bread, Honey, Tomatoes]

        String el1 = wareHouse.poll();//Retrieves and removes the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(el1);//Milk
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        String el2 = wareHouse.peek(); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        //Returns the head of this queue, or null if this queue is empty
        System.out.println(el2);//Meat
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        String el3 = wareHouse.element();//Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
        //Returns:the head of this queue
        System.out.println(el3);//Meat
        System.out.println(wareHouse);// [ Meat, Bread, Honey, Tomatoes]

        Queue<String> emptyWareHouse = new LinkedList<>();

        String el4 = emptyWareHouse.peek();
        System.out.println(el4);//null

        //String el5 = emptyWareHouse.element();//If the Queue is empty, element() method throws "NoSuchElementException"
        //System.out.println(el5);

        /*
            Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
            When using a capacity-restricted queue, this method is generally preferable to add, which can fail to insert an element only by throwing an exception.
            Returns: true if the element was added to this queue, else false
            Throws:
            ClassCastException – if the class of the specified element prevents it from being added to this queue
            NullPointerException – if the specified element is null and this queue does not permit null elements
            IllegalArgumentException – if some property of this element prevents it from being added to this queue
         */
        boolean result1 = wareHouse.offer("Chocolate");
        System.out.println(result1);//true
        System.out.println(wareHouse);

        /*
            Retrieves and removes the head of this queue.
            This method differs from poll() only in that it throws an exception if this queue is empty.
            Returns: the head of this queue
            Throws: NoSuchElementException – if this queue is empty
         */
        String el6 = wareHouse.remove();
        System.out.println(el6);//Meat
        System.out.println(wareHouse);// [ Bread, Honey, Tomatoes, Chocolate]


        String el7 = emptyWareHouse.poll();
        System.out.println(el7);//null

        String el8 = emptyWareHouse.remove();//NoSuchElementException
        System.out.println(el8);
    }





}

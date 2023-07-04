package day27exceptionscollections;

import java.util.LinkedList;

   /*
      Collections are for storing multiple data in the same data type.
      Collections are flexible in length.
      Collections have many useful methods.

        There are 3 main Collections: i)List ==> a)ArrayList:Successful in "search operations" but not good at "adding" and "removing"
                                                 b)LinkedList:Successful in "adding" and "removing" not good at "search operations"
                                      ii)Queue ==> a)PriorityQueue  b)Deque
                                      iii)Set ==> a)HashSet  b)LinkedHashSet  c)TreeSet
    */

   /*
    COLLECTİON
    1-List:Coklu ve tekrarlı data depolamak istedigimizde ihtiyac duyarız
           Bir okuldaki ögrenci isimleri
    2-Set: Coklu ama tekrarsız data depolamak istedigimizde ihtiyac duyerız.
          Bir okuldaki ögrenci id'lerini depolamak icin
    3-Queue:FIFO veya LIFE gerektiginde kullanırız.
         Bir bankada islem yapma sırasını bekleyen müsterileri sıralamak icin

              ----
     -ArrayList'ler index kullanır ama index kullanmak ,eleman ekleme ve eleman silme islemlerinde
          bize zaman kaybettirir. Cünkü bircok elemanın re-index edilmesi gerekir.
                "LinkedList"
      1 -)LinkedList:Elemanlar 2 bölümden olusur; data ve pointer. "Linked"  demek birbirine baglanmıs demek.
                 Element yerine LinkedList de "node" olarak adlandırılır.
                 Her node'u bir pointer(ok ile) ile diger node'a baglar.En sondaki pointer'a "tail"(kuyruk) denir.
                 En bastaki node'u gösteren sadece bir ok(pointer) var. Ona da "head" denir.
       2-)LinkedList’ler eleman silme ve eklemede basarılıdırlar.Bu nedenle elemen silme ve eklemede LinkedList ler kullanılır.
       Örnegin bir müzenin günlük ziyaretcileri icin kullanılabilir, sil-ekle islemi tekrar tekrar olur. Bu islemi hızlı olması gerekir.
       3 -)LinkedList’ler eleman arama islemlerinde basarısızdırlar.
       4-) 2. ve 3. maddelerden dolayı eleman silme ve ekleme islemlerinin cok yapılacagı durumlarda LinkedList kullanılmalıdır.
       5-)ArrayList'ler index kullanır LinkedList’ler index kullanmaz.
       6-) index kullanmak eleman bulma islemlerinde cok basarılıdır. Bu yüzden eleman bulma islemlerini yapacagımız islemlerde ArrayList kullanmalıyız.
       7-) LinkedList’ler eleman silme ve eklemede basarılı oldukları icin  ekleme ve silme ile ilgili fazla method icerir.
           addFirst(), addLast(), removeFirst(), removeLast(), removeFirstOccurrence()......


     -ArrayList eleman bulma (search) islemlerinde cok basarılıdır, cünkü index kullanarak bulur.
      LinkedList ise  eleman (elemenın adressini) bulma(search) bulmada basarısızdır, cünkü index kullanmadıgı icin bastan baslar
       tek tek elementleri kontrol eder taki istedigi elementi bulana kadar, buda zana kaybı demek, hızını azaltır.
     ör: "Süzlük" ile ilgili bir applicationda ArrayList kullanmak daha mantıklı.kelimeler bir kere koyulur ve search yapılır daha cok.
         Sehir isimleri, bölgeler gibi aplicationlarda ArrayList kullanmak daha iyi olur, sehir isimleri kolay kolay degismez ve
         sehirler ile ilgili bircok konuda arama islemi yapılabilir.


     */



public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();
        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");

        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali]

        visitors.addLast("Mahmut");
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali, Mahmut]

        visitors.addFirst("Chris");
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut]

        LinkedList<String> kids = new LinkedList<>();
        kids.add("Abc");
        kids.add("Xyz");

        visitors.addAll(kids);
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.add(2, "Miami");//Normally LinkedList does not use "indexes", Java displays it as index to make usage easy for us
        System.out.println(visitors);// [Chris, Tom, Miami, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.addAll(6, kids);
        System.out.println(visitors);// [Chris, Tom, Miami, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove(2);
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove("Abc");//remove() method removes the "first occurrence" of the object
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirst();
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove();
        System.out.println(visitors);// [Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirstOccurrence("Xyz");
        System.out.println(visitors);// [Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.removeLast();
        System.out.println(visitors);// [Jane, Mary, Carl, Ali, Mahmut, Abc]
        System.out.println("==================================");
  // pop() method ilk elementi siler ve bize sildigimiz elementi verir.Bu method removeFirst() methodu ile aynı isi yapar.
  //      Eger list bos ise(emty) NoSuchElementException atar.
    String firstEi=  visitors.pop();
        System.out.println(firstEi); //Jane

        System.out.println(visitors);// [Mary, Carl, Ali, Mahmut, Abc]

    LinkedList<String>  myList = new LinkedList<>();
 //   myList.pop(); //NoSuchElementException attı cünkü list bos


 //peek() methodu ilk elemanı verir ve elemanı silmez listten. Eger list bos(emty) ise "null" döndürür.
        String firstEleman= visitors.peek(); //Mary
        System.out.println(firstEleman);
        System.out.println(visitors);// [Mary, Carl, Ali, Mahmut, Abc]

        LinkedList<String>  myLst = new LinkedList<>();
        myLst.peek(); //null


// poll() methodu işlk elementi verir ve listten ilk elemanı siler. pop() methodundan farkı ise; list bos ise exception
// vermez "null" verir.

/*element() methodu: işlk elementi verir ve list'ten silmez. Eger list bos ise "NoSuchElementException" exception atar.
         Retrieves, but does not remove, the head (first element) of this list.
         Throws: NoSuchElementException – if this list is empty

 */
       String first= visitors.element();
        System.out.println(first); //Mary
        System.out.println(visitors);// [Mary, Carl, Ali, Mahmut, Abc]

        System.out.println("????????????????????????");
        //Example 1: Change all names start with "A" to "*****"

         for (String w: visitors ){
             if (w.startsWith("A")){
                 visitors.set(visitors.indexOf(w),"*****");
             }
         }
        System.out.println(visitors); //[Jane, Mary, Carl, *****, Mahmut, *****]


        //Exemple 2: If the number of characters is more than 4, remove them from the linked list
        //          Interview question
        LinkedList<String> names = new LinkedList<>();
        names.add("Chris");
        names.add("Alexandre");
        names.add("Mark");
        names.add("Tom");
        names.add("Jeremy");
        names.add("Hans");
        System.out.println(names);

        for (int i=0; i<names.size(); i++){

          if (names.get(i).length()>4){
              names.remove(names.get(i));
              i--;
          }

        }
        System.out.println(names); //[Mark, Tom, Hans]





    }

}

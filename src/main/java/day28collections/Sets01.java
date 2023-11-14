package day28collections;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets01 {

    /*
        1)Sets are for storing multiple non-primitive data in the same data type
        2)Sets are for storing unique data like email addresses, SSN, Phone Numbers in a Country, ...
        3)There are 3 different Sets: i)HashSet: Uses "Hashing Technique".
                                                 It does not put the elements in any order.
                                                 HashSet accepts just a single "null" as element
                                      ii)LinkedHashSet: Puts the elements in "Insertion Order"
                                      iii)TreeSet: Puts the elements in "Natural Order"(Ascending Order in numbers, Alphabetical Order in Strings)
                                          TreeSet is so slow in adding elements
        Question: If you need to store "unique elements" in "natural order", which collection do yo use?
                  Answer: TreeSet
        Question: As you know, TreeSet is so slow in adding elements, how can you improve your code?
                  i)Create a HashSet
                  ii)Add elements into the HashSet
                  iii)Convert HashSet to TreeSet
      note: Tekrarsız elemanları natural order da depolamak icin TreeSet kullanmak mantıklıdır ama TreeSet ler cook yavas calıstıgı
            icin biz, elemanları önce HashSet ile depolarız sonra HashSet'i TreeSet'e cevirerek
            TreeSet'in yavas olma problemini atmıs oluruz.

     Note: HashSets are data structure.
        Note: .size();-->returns the number of elements of the set
        Note: .clear();-->Delete all elements in set
        Note: If you want to add an element back to the HashSet, the old one is deleted and the new one is overwritten.

                  ***************************
                    "HashSet"
               HashSet<String> emails = new HashSet<>();
      Hash bir tekniktir, birbirine benzemeyen code'lar üretür bu code'lar data'yı unique yapar.
     -HasSet'lere coklu ama tekrarsız data depolamak istedigimizde ihtiyac duyarız.(ögrenci numaraları gibi)
     -Set'lere var olan elemanı eklersek hata vermez, son ekleneni var olan data'nın üstüne yazar(yani overwrite yapar).
     -"null" element kabul eder.
     -HashSet'ler eklenen elemanların sıralaması ile ugrasmaz.Sıralama ile alakalı zaman harcamaz buyüzden cok hızlı calısır.
     -HashSet'ler index kullanmaz, cünkü her calısmada elementin yeri farklı olabilir, rastgele sıralar.
                 *** HashSet'leri:1) Tekrarsız elemanlar gerektiginde
                                  2) Sıralama önemli olmadıgında
                                  3)Hız cok önemli ise, kullanılır.

                          ***

                    "LinkedHashSet"
             LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
    -LinkedHashSet'ler elemanları ekleme sırasına(Insertion Order) göre yerlestirirler.
    -LinkedHashSet elemanları sıraşlamada zaman harcadıgı icin HashSet'lere göre yavas caalısırlar

                     ***
                  "TreeSet"
            TreeSet<Integer> nums1 = new TreeSet<>();
     -TreeSet tekrarsız elemanları "alfabetik" veya "kücükten büyüge"(natural Order) dizer.
     -TreeSet coooook yavas calısır(elemanları natural Order a göre sıraya koydugu icin).
     -TreeSet does not accept "null" as element
     */

    public static void main(String[] args) {

        //HashSet
        HashSet<String> emails = new HashSet<>();
        System.out.println(emails);// []

        emails.add("Apple");
        emails.add("Mango");
        emails.add("Orange");
        emails.add("Apricot");
        emails.add("Fig");
        emails.add("Mango");//When you try to add repeated data, Java does not give any error, and last data will be overwritten to the previous data
        emails.add(null);
        emails.add(null);
        System.out.println(emails);// [null, Apple, Fig, Mango, Apricot, Orange]
        // If you use many elements, the order can be different in everyone because there is no rule to order the elements.
        // It is a random order.

        emails.remove("Fig");
        System.out.println(emails);// [Apple, Mango, Apricot, Orange]

        //emails.clear();//Deletes all elements from the HashSet
        //System.out.println(emails);// []

        //When you use clone() method, you can make data type "Object"
        Object emails2 = emails.clone();//if you want to get same HashSet in different container we use clone() method
        System.out.println(emails2);

        HashSet<String> emails3 = (HashSet<String>) emails.clone(); //TypeCasting ==> explicit narrowing
                                                                    // HashSet is the child of the object class
        System.out.println(emails3);

        //LinkedHashSet
        LinkedHashSet<Integer> ssn = new LinkedHashSet<>();
        ssn.add(123456789);
        ssn.add(234567891);
        ssn.add(345678912);
        ssn.add(456789123);
        ssn.add(null);

        System.out.println(ssn);//[123456789, 234567891, 345678912, 456789123]
        //HashSet is faster than LinkedHashSet because it will take time to put elements into insertion order

        //TreeSet
        //1.Way: Slower
        Long starting = LocalTime.now().toNanoOfDay();
        TreeSet<Integer> nums1 = new TreeSet<>();
        nums1.add(23);
        nums1.add(5);
        nums1.add(17);
        nums1.add(67);
        nums1.add(41);
        nums1.add(-5);
        //nums1.add(null);//TreeSet does not accept "null" as element
        System.out.println(nums1);//[ -5, 5, 17, 23, 41, 67]  ==> Ascending order

        Long middle = LocalTime.now().toNanoOfDay();
        System.out.println(middle - starting);



        //2.Way: Faster
        HashSet<Integer> nums2 = new HashSet<>();
        nums2.add(5);
        nums2.add(17);
        nums2.add(67);
        nums2.add(41);
        nums2.add(-5);

        Set<Integer> perfectNums = new TreeSet<>(nums2); //HashSet'i TreeSet'e cevirmek icin bu kodu yazdık. //We can use the data type from the Set Parent Class
//      TreeSet<Integer> perfectNums = new TreeSet<>(nums2);
        System.out.println(perfectNums);//[ -5, 5, 17, 23, 41, 67]

        Long ending = LocalTime.now().toNanoOfDay();

        System.out.println("1.Way: " + (middle-starting)); //5998100
        System.out.println("2.Way: " + (ending-middle));   //0 bir nanosecenttan az oldugu icin 0 verdi cok hızlı.
    }

}

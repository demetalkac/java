package day33lambdafp;

import day32_lambdafp.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda_StringUsage {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Tom");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");


        printInUpperCase01(l);//TOM ALLEY MARK AMANDA JOHN JACKSON MARRY ALBERTO TUCKER BEN
        System.out.println();
        System.out.println("helloooo");
        printInUpperCase02(l);//[TOM, ALLEY, MARK, AMANDA, JOHN, JACKSON, MARRY, ALBERTO, TUCKER, BEN]
        System.out.println();
        printEleSortedByLengths(l);//TOM BEN MARK JOHN ALLEY MARRY AMANDA TUCKER JACKSON ALBERTO
        System.out.println();
        printEleInReverseOrderSortedByLength(l);//JACKSON ALBERTO AMANDA TUCKER ALLEY MARRY MARK JOHN TOM BEN
        System.out.println();
        printDistinctEleSortedByLastChar(l);//AMANDA MARK TOM JOHN JACKSON BEN ALBERTO TUCKER ALLEY MARRY
        System.out.println();
        printSortedByLengthAndSortedByInitial(l);//BEN TOM TOM JOHN MARK ALLEY MARRY AMANDA TUCKER ALBERTO JACKSON
        System.out.println();
        //removeIfTheLengthIsGreaterThanFive(l);//[TOM, ALLEY, MARK, JOHN, MARRY, TOM, BEN]
        System.out.println();
        //printRemoveIfStartingWithAOrEndingWithN01(l);//[TOM, MARK, MARRY, TOM]
        //printRemoveIfStartingWithAOrEndingWithN02(l); //[TOM, MARK, MARRY, TUCKER, TOM]
        // removeIfEleLengthIsBetweenFiveAndNineOrEndingWithO(l); //[TOM, MARK, JOHN, TOM, BEN]
        System.out.println(checkLengthToBeLessThanTwelve(l));
        System.out.println(checkNotToStartWithX(l));
        System.out.println(checkAnyEleEndsWithN(l));
        lengthSquareDistinctReversed(l); //49 36 25 16 9


    }

    //1)Create a method to print all list elements in uppercase.
     //map() elementleri  update yapmakta kullanıyoruz
    public static void printInUpperCase01(List<String> list){
        //1.way:
        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    public static void printInUpperCase02(List<String> list){
        //2.Way:
        list.replaceAll(String::toUpperCase); //We do not have to use every time stream() method
        System.out.println(list);             //We can use replaceAll() method from the List Interface


    }

    //2) Create a method to print the elements after ordering according to their lengths

    public static void printEleSortedByLengths(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    //3)Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printEleInReverseOrderSortedByLength(List<String> list){

        list.stream().
                sorted(Comparator.comparing(String::length).reversed()).
                forEach(UtilsClass::printInTheSameLineWithASpace);

    }

    //4) Create a method to sort the distinct elements by using their last characters

    public static void printDistinctEleSortedByLastChar(List<String> list){

        list.
                stream().
                distinct().
                sorted(Comparator.comparing(UtilsClass::getLastChar)).
                forEach(UtilsClass::printInTheSameLineWithASpace);
      //list.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);
    }
    //5)Create a method to sort the elements according to their lengths then according to their first character

    public static void printSortedByLengthAndSortedByInitial(List<String> list){

        list.
                stream().
                sorted(Comparator.comparing(String::length).  //If we have to compare in multiple ways we use "then comparing"
                        thenComparing(t-> t.charAt(0))).
                forEach(UtilsClass::printInTheSameLineWithASpace);

    }
    //6) Remove the elements if the length of the element is greater than 5

//    public static void removeIfTheLengthIsGreaterThanFive(List<String> list){
//
//        list.removeIf(t-> t.length()>5);//[TOM, ALLEY, MARK, JOHN, MARRY, TOM, BEN]
//        System.out.println(list);
//
//    }
    // 7)Remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'

//    public static void printRemoveIfStartingWithAOrEndingWithN01(List<String> list){
//        //1.way:
//
//        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');
//        System.out.println(list);
//
//    }
//    public static void printRemoveIfStartingWithAOrEndingWithN02(List<String> list) {
//
//        //2.way:
//        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
//        System.out.println(list);
//
//
//    }

    //8)Remove the elements if the length is between 5 and 9 or ending with 'o'

//    public static void removeIfEleLengthIsBetweenFiveAndNineOrEndingWithO(List<String> list){
//
//        Predicate<String> checkCondition= t-> (t.length()>4 && t.length()<10) || t.endsWith("o");
//
//        list.removeIf(t->checkCondition.test(t)); //[TOM, MARK, JOHN, TOM, BEN]
//        System.out.println(list);
//
//    }

    //9) Create a method to check if the lengths of all elements are less than 12
    public static boolean checkLengthToBeLessThanTwelve(List<String> list){

        return  list.stream().allMatch(t-> t.length()<12);

    }

    //10)Create a method to check if the initial of any elements is not "X"

    public static boolean checkNotToStartWithX(List<String> list){

        return list.stream().noneMatch(t-> t.startsWith("X"));

    }

    // 11) Create a method to check if at least one of the elements ending with "n"

    public static boolean checkAnyEleEndsWithN(List<String> list){

        return list.stream().anyMatch(t-> t.endsWith("N"));

    }

    //12) Create a method which takes the square of the length of every element, prints them distinctly in reverse order
  public static void lengthSquareDistinctReversed(List<String> list){
    list.stream().map(String::length).
            map(UtilsClass::getSquare).distinct().
            sorted(Comparator.reverseOrder()).
            forEach(UtilsClass::printInTheSameLineWithASpace);

  }  //49 36 25 16 9
/*
ForEach:
   Stream içindeki veriyi tek tek tüketmek için oluşturulmuş bir yapıdır.
   **Terminal işlemi olduğundan dolayı stream artık tüketilmiş olarak kabul edilir ve
   artık kullanılamayacağı anlamına gelir.


  Filter:
  Dizimiz veya Collection'ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
  filtreleme işlemi yapmamıza yarayan bir yapıdır.
  Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
  Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


  Collect:
  Collect metodu Stream türündeki nesneleri başka biçimdeki nesneye,
  veri yapısına dönüştürmek için kullanılır.


  Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
  ve başka elemanlara dönüştürmemize imkan sağlayan


  Distinct:
  Stream içerisinde bulunan ve tekrar eden elemanlar varsa
   bunları distinct metodu ile çıkartabilir ve
  elimizde tekrar etmeyen birbirinden farklı
  elemanlar barından bir veri setimiz kalır


  Sorted:
  Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
          2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
  İkinci formatı ise Comparator arayüzünden türediği için
  bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.



  reduce : indirgeme demektir.
  kullanımı; elemanları teker teker işler. Bir önceki adımda elde edilen sonuç,
  bir sonraki elemanla işlemle tutulur


  Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
  Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
  değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

      AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
      herhangi bir elemanla eşleşme durumunda true dönecektir.


      AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
      bu şarta uyması durumunda true dönecektir.


      NoneMatch: Şarta göre Stream içindeki hiç bir
      elemanın şartı sağlamaması durumunda true dönecektir.


  Limit
  Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize yarayan,
  sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
  Stream içerisinde dönen çok sayıda veri var
  ancak sen bize şu kadarını göster diyoruz.


  findFirst() => İlk elemanı verir. Bu akışın ilk elemanını açıklayan bir
  İsteğe bağlı veya akış boşsa boş bir İsteğe bağlı döndürür.
  Akışın karşılaşma sırası yoksa herhangi bir öğe iade edilebilir. Optional return eder.


 Arraylerde Stream kullanabilmek icin 2 yol vardir

  1) Stream <Integer> isim=StreamOf(cevrilecek olan)
  2) Arrays.stream(arr).


  Count
  Stream içerisinde bulunan toplam veri sayısını öğrenmemize yarar.


  split() => Bu String öğesini verilen normal ifadenin eşleşmelerine böler.
  Bu yöntem, iki bağımsız değişkenli bölünmüş yöntemi verilen ifade ve sıfır
  sınır değeriyle çağırır gibi çalışır.
  Sondaki boş dizeler bu nedenle sonuç dizisine dahil edilmez.

  Comparator => bir Class'tır. Compar karşılaştırmak demektir.
   Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma işlevi.
  Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol sağlamak için bir
  sıralama yöntemine (Collections.sort veya Arrays.sort gibi) aktarılabilir.
  Karşılaştırıcılar, belirli veri yapılarının (sıralı kümeler veya sıralı haritalar gibi)
  sırasını kontrol etmek veya doğal sıralaması olmayan
  nesnelerin koleksiyonları için bir sıralama sağlamak için de kullanılabilir.

  reverseOrder() => Comparator Class'ının bir methodudur.
  Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator (karşılaştırıcı) döndürür.
  comparing() => karşılaştırma demektir.
  reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
  uygulayan bir karşılaştırıcı (comparator) döndürür.


  skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından
  oluşan bir akış döndürür.
  Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
  Bu, durum bilgisi olan bir ara işlemdir.
  skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.

 */





}
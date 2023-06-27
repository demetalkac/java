package day24interfaces;

  /*
     * Atomic olsun diye "parent" classı parcalayıp farklı fonksiyomlar icin farklı parent classlar olusturup ,
    child classı da onlara baglamak istesek birden fazla parent olacagından dolayı java kabul etmez.
    Cünkü java "multible ınheritance"ı desteklemez. Fakat java "interface" diye yeni bir yapı olusturdu bu yapıyı da
    "multible inheritance"a müsade etti.

   * Bir classı bir interface'in child'ı yapmak icin "implements" keywordu kullanılmalı
     ör: public class Honda implements Ac, Brake, Engine {

   *interface olunca methodlara body koyulamaz, kabul etmez.
   ör:public void ecoEngine();

   *interface'lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
   ör:  public abstract void ecoEngine(); => yerine  => public void ecoEngine();

   *interface'lerdeki tüm methodlar java tarafından otomatik olarak "public" kabul edilir, bu nedenle o methodlar icin
    access modifier olarak "public" yazmaya gerek yoktur.(yazsakta sıkıntı olmaz)
     ör: void ecoEngine();
      public abstract void ecoEngine(); ile void ecoEngine(); aynı anlama gelir.
   *interface'lerdeki tüm metodlar "abstract" oldugu icin interface'lere "fully abstraction" (tam abstract) denir.
    "abstract class"larda "abstract method" ve "concrete method" bir arada kullanıldıgı icin "abstract class"lara
    "fully abstraction" denmez, yani yarım abstacttır.

    * To create "concrete method" in an interface you have 2 potions
       i) Use "default" keyword     ii) Use "static" keyword
    - interface'lerde normalde  "concrete method(body'i olan)" koymamıs java ama developerların istegi üzerine koymus
      ama "defoult" keywordu kullanmak sartıyla, kullanmassak hata verir. Bu istisnai bir durumdur.
      ör:  public default int calculate(){
            return 1200;
           }
     -"static" keyword kullanarakta interfacelerin icinde body'si olan methodlar üretilebilir, bu da istisnai bir kullanımdır.
     ör: public static String update(String str){
         return str + "!";
         }

      *"abstract methodlar" sadece ne yapılacagını söyler(what to do)
       "concrete method"lar ne yapılacagını (what to do) ile birlikte nasıl(How to do) da söyler.

       -interface'ler bir yapılacak isler listesidir.(To do list)
     *"multible parent interface" kullandıgınızda aynı method isii ile birden fazla method olusturursanız bu method'ların
      return type'ları aynı olmalıdır..Aksi takdirde hata verir.
      --
         variable
      *iterface'lerdeki tüm variable'lar otomatik olarak(defoult) "public"tir.
      *iterface'lerdeki tüm variable'lar otomatik olarak(defoult) "final"tir.Olusturdugumuz variable'la deger ataması
      yapmazsak sikayet eder java degr ataması yapınca sikayet ortadan kalkar, "final" oldugunu burdan anlıyoruz(atanan deger degistirilemezdi finalda).
      ör: int price = 2300;
      *iterface'lerdeki tüm variable'lar otomatik olarak(defoult) "static"tir.

     note:public static final int price = 2300; seklinde de yazabiliriz ama intellj "public static final" kısmını silik yazar yani yazmasanda olur demektir.

     * multiable interface parent oldugunda aynı isimle variable olusturulabilir parent classlarda,
       java'nın aklı karısmaz cünkü variable cagırıken class ismiyle cagırdıgımız icin hangisini kullanacagını bilir java.

     *multiable interface parent oldugunda aynı isimle ve aynı data type ile VEYA aynı isim farklı data type ile variable
      olustursak parent classlarda,gene problem olmaz.

      NOT: interface'lerden object olusturulamaz. Cünkü interface'lerde constructor yoktur.
      "abstract class"larda class oldukları icin constructor vardır. Ama constructor'lar abstract class'larda object olusturamazlar.
--------------------------------------------------------------------------

   * Child      Parent
     Class =>  Interface   => implements
     Class =>  Class       => extends
     Interface = Interface == extends
     Interface => Class    => mumkün degil
     -------------------------------
    INTERVİEW!!!! ABSTRACT CLASS İLE INTERFACE'IN FARKI NEDİR?

    1- Method
     "abstract class" hem abstract hem de concrrete method'lar icerebilir.
     "interface"ler ise sadece abstract method'lar icerir.
     Ama istersek interface'ler icinde de "defoult" ve "static" keyword'leri kullanarak concrete method lar olusturabiliriz.

   2- Variable
     "abstract class"larda normal class'lardaki gibi her türlü variable olusturulabilir.
     "ınterface"lerde ise variable'lar public ,static ve final olmak zorundadır.

   3- Inheritance
     "abstract class"lar class oldukları icin multible inheritance'a müsade etmezler.
     "interface" ler ise multible inheritance'i desteklerler.

   4- Object creation
     "abstract class"larda constructor vardır ama object olusturmada kullanılmazlar.
     "interface" lerde ise constructor olmadıgından object olusturulamaz.


     Soru: Object Oriented Programing Language prensibleri nelerdir?
          i- inheritance  ii- polymorphism  iii- encapsulation iv- abstraction
                    ***************************************************



   1)An interface cannot have "concrete method"
   2)All methods in an interface are "public" and "abstract" as default
     Because of that; even you don't declare the methods "public" and "abstract", they will be "public" and "abstract"
     "public abstract void digital();" and "void digital();" are same
   3)If "parent interfaces" have methods with the same name, overriding just one of them will be enough.
   4)"parent interfaces" cannot have methods with the same name and the different return types.
      If you do that, Java will give you compile time error
   5)Variables in an interface are "public", "static", and "final"
     "public static final int price = 2300;" and "int price = 2300;"
   6)Variables in interfaces are "static" default, therefore no need to create object to access
     variables in interfaces.
   7)Whenever you need to call any variable use "Interface Name" to call

   8) "Class" parent of another "Class" ==> extends
   "Interface" parent of another "Interface" ==> extends

   "Interface" parent of "Class" ==> implements
   "Class" parent of "Interface" ==> impossible. ==> An "Interface" can have "just" Interface as parent
      ---------------



 */

public interface Ac extends BigAc{
     void digital();

     void price();

      int price = 2300;

      String name =  "Perfect AC";

      // To create "concrete method" in an interface you have 2 potions
      //i) Use "default" keyword     ii) Use "static" keyword

    //i) Use "default" keyword
    public default int calculate(){
        return 1200;
    }

    //ii) Use "static" keyword
     public static boolean climate(){
        return true;
     }




}

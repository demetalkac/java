package day29maps;


import java.util.HashMap;

public class HashMap02 {

    /*
        1)When you create a HashMap, Java creates 16 "bucket"s in memory and index them from 0 to 15
        2)When you use "put()" method, Java creates an integer HashCode and calculates HashCode%16
        3)The result of HashCode%16 will be the index to select bucket
        4)After selecting bucket Java will put the entry into the selected bucket as a node of a Linked list
        5)Every node will have 4 parts in it i)HashCode ii)Key iii)Value  iv)Pointer
        6)Java makes every HashCode unique bur sometimes Java can create same HashCodes accidentally, this is called "HashCode Collision"
        7)"HashCode Collision"s are common phenomena of hashing functions.
        8)If the key is "null" hashcode will be zero, that's why the entry whose key is "null" will be put into the bucket whose index is zero
     */
    /*
        1)Siz HashMap olusturmak icin  HashMap<String,Integer> hm=new HashMap<>(); " kodunu yazdiginizda Java
        16 tane bucket(kova) olusturur ve bu bucket leri 0 dan 15 e kadar indexler
        2) Siz entry eklemek icin hm.put("Istanbul",17000000); yazdiginizda Java;
        i) "key" icin "hashCode" uretir
        ii) "hashCode" u 16 ya boler
        iii) kalani index olarak kullanip indexi kalana esit olan bucket'a bu "entry" e yerlestirir
        iv)Bucket a "entry" eklenirken  Java o bucketin icinde "LinkedList" yapisini kullanir
        LinkedList'te node"lar vardi. map yapisina giren her node 4 bolumden olusur.i)HashCode ii)Key iii)Value iv)Pointer
        Her HashCode unique tir bazen Java kazara ayni hashCode u verir buna hashcode collision denir(hashcode kazasi)

        //hashmapler her bir index icin linkedlist kullanir. Bunun da StringBuilder gibi 16 kutusu var her kutucuga Bucket denir.
// linkedlistte bulmak zordu yan yana gidiyordu bu 16 ya boler ve ona gore kalan sayiyi index yapar ustuste gelince linked list gibi yan yana ekler


        1)HashTable "thread-safe" ve "synchronized"dir.
        2)HashTable entry'leri rastgele siralar.
        3)HashTable'lar HashMap'lere gore daha yavastirlar
        4)HashTable" key"lerde ve" value"larda "null" kullanilmasina musaade etmezler.

        Note:i) "multi thread" ve synchronization kullanmaniz gerekirse ve
             ii)"key" ve" value"larda "null" kullanilmak  yasaksa; "HashTable" kullanmak gerekir.

     */
    /*
        Iterator'lar Loop'ların yaptığı işi yapar.
        Iteratorslar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterator'ları ortaya çıkarma sebebi infinit Loop riskini bitirmektirr.

        Iterator'larda sonsuz loop yoktur.
        Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
        Loop'ların yaptıkları bütün işlemleri yapabilirler.
        Looplar ile iteratorlarin performans farki yoktur ama Iteratorlar eleman silme ve update etmede daha basarilidirlar
        eger bir collectionda eleman silme ve update islemi yapcaksan loop kullanmamaliyiz

        iki tip iterator var
        i) Iterator : Sadece elemanlari remove edebilirsiniz.
                      Sadece soldan saga calisir yani tek yonludur(for-each loop gibi.)
                      index yok

        ii)ListIterator : Eleman "remove etme", "update etme" ve "add" yapabilirsiniz
                          Hem sol'dan saga hem de sag'dan sola calisabilir yani cift yonludur
                          sadece listlerde kullanilir
         **************
       [14:06, 16.11.2023] Ayse Arzu Battal QA-ing: /*
        1)TreeMap entry'leri "key"lere gore natural order"a koyar.
          2)TreeMap  cok yavastir. cunku "natural order" yapmak cok zaman ister.
        3)TreeMap "thread-safe" ve "synchronized" degildir.
        4)TreeMap'lerin "key"lerinde null kullanilamaz ama value"larda istediginiz kadar kullanabilirsiniz.

 **********************
            /*
       i) Enum bir data deposudur.
       ii)Enum'in icine sabit, degisme ihtimali olmayan datalari koyariz.
        Mesela yilin aylari, Haftanin gunleri, ABD'nin eyaletleri,
        Honda icin yapilan App'lerde Crv, Accord class'lari enum'dir.
       iii)Sabit datalari app'in icine gommek icin enum kullaniriz.
        App'ler standalone (kendi basina ayakta durabilmesi icin) olmasi gerektigi icin sabit datalari app'in icine gomeriz.

        */

    public static void main(String[] args) {

        HashMap<String, Double> coursePrices = new HashMap<>();
        coursePrices.put("Full Stack Java Development", 6000.00);
        coursePrices.put("Full Stack Automation Engineer", 5800.00);
        coursePrices.put("SalesForce Development", 4500.00);

//How do you get hashCode?
        int hashCode = coursePrices.hashCode();
        System.out.println(hashCode);//685489871

    }
}

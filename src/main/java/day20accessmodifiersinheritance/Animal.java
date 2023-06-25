package day20accessmodifiersinheritance;

public class Animal {
      /*
      inheritance: miras anlamındadır. Childe'ların ihtiyacı olanları(method...) parent class'tan kullanabilmesine denir.
      1- Tekrarlı kod problemi
      2- Cod tamirinin(maintenance) cok zor olması problemi
      3- Cok büyük classlar olusturma problemi , bu 3 problemi cozmek icin inheritance olusturmus java.
         --
     - Inheritance'in calısması icin classlar arasında parent-childe iliskisi kurmalıyız.
     - parent-child iliskisi icin "extends" keyword'unu kullanırız. "extends"in solunda child class,
       sagında parent classın ismi olur. ör: public class Cat extends Animal { => Cat child, Animal parent
     - Child Class object'ler Parent Class'dan method ve variable'ları kullanabilirler.
     - Parent Class object'ler Child Cass'dan method ve variable'ları kullanamaz.
        ---
            "method ve variable"
     - "privede" method ve variable'lar Child Class'lar tarafından kullanılamazlar(yani prived olanlar inheritance edilemez)
     -"protected" method ve variable'lar Child Class'lar tarafından kullanılabilirler(yani protected olanlar inheritance edilebilirler)
     -"public" method ve variable'lar Child Class'lar tarafından kullanılabilirler(yani public olanlar inheritance edilebilirler)
    -"default" method ve variable'lar aynı package'deki Child Class'lar tarafından kullanılabilirler(yani default olanlar inheritance edilebilirler)


    NOT: "Object class" bütün kılasların parenti oldugu icin onda yeralan bütün methodları extends yapmadan da kullanabiliriz.
         Java da "Object class" haric her classın parent'ı vardır.

         ---
         inheritance Cesitleri:
         1- Multilevel Inheritance =>her classın bir parentı ve her classın bir childı var.apartman gibi, java kabuleder
         2- Hierarchical Inheritance => Bir parentın birden fazla child'ı var
         3- Multible Inheritance => bir childen iki parenti var. java doesnt support(desteklemez)
         4- Single Inheritance => bir child class icin bir Prent Class demektir, java bunu destekler.

         ----
                "objekt" olusturup variable cagırma:
           objekt olustururken: (aralarında parent-child iliskisi var yani extends edilmis classlar icin konusuyoruz):
        - bulundugu classın ismi ile olusturabiliriz => Cat cat1 = new Cat();
        - bulundugu classın parentinin ismini kullanarak da olusturabiliriz  =>Mamal cat2 = new Cat();
        - bulundugu classın parentinin parentinin ismini kullanarak da olusturabiliriz =>Animal cat3 = new Cat();
          Yani objeckt olustururken data type'nı bulundugu clastan secebilecegimiz gibi parentlarından da secebiliriz.Bunu
          yapacagımız göre seceriz.
       * Classların icine aynı isimle variable koydugumuzda: Kullanmak istedigimizde, variable'ı objekt icinde cagırdıgımızda ,
       hangi data type ile objeckt olusturduysak onun icindeki variable degerini getirir bize. ör:
        Mamal clasında ,"public int a = 14;" olusturduk ve Cat classında da "public int a = 10;" olusturduk
        Eger Cat objesinden cagırırsam: Cat cat1 = new Cat();
                                        System.out.println(cat1.a); ==> 10
        Ama Mamal objesinden cagırırsam: Mamal cat2 = new Cat();
                                        System.out.println(cat2.a); ==> 14 ,olur.

     not:  Mamal clasında ,"public int b = 74;" olusturduk ama Cat classında b variable yok ise, ve
           Cat classından obje yapıp ordan cagırsak variable'ı  Cat classında olmadıgı icin parent'ı
           olan Mamal classına gider ordan alır.
          -Inheritance da variable'lar seclirken Java object'in data type'ına bakar.
           Oncelikle istedigimiz variable'ı Objectin data type'ı olan Class'da arar.
           Ama variable O child classda yoksa parent'ına gidecek ordan alacak.
           Hicbir parent classda bulamazsa hata verir.

        ----------
                              "methodlar"
  *Objeckt olustururken Object'in data type'i Child Class'lardan secilemez.:
   Cat cat5= new Mammal(); seklinde olamaz, error verir.
   Mammal cat5= new Mammal(); seklinde olmalı

   *Inheritance'da metdod'lar secilirken Java Constructor'a bakar.
    Önce istedigimiz method'u Constructorı kullanılan class'dan alır.
      Cat cat4= new Cat();
      cat4.eat(); =>Cat Classındaki eat methodunu alır,cunkü constructorı da Cat()

     Mammal cat5= new Mammal(); =>Mammal Classındaki eat methodunu alır,cunkü constructorı da Mammal()

   *Mammal Classına drink() methodu koyup:
                     "public void drink(){
                     System. out.printl.("mammal eat"); } ve Cat methodu ile cagırsak constructorına bakar
                                                    Cat clasında drink methodu olmadıgı icin parantı olan Mammal'dan alır.
        Cat cat4= new Cat();
        cat4.drink(); //  "mammal eat" , seklinde gelir.

   -Yani method cagırırken constructora bakar ve Constructorı olan clasta yoksa bir üst parentendan alır, parentlarında da yoksa hata verir.

       -----
          "Constructor"
     *"Constructor" lar obje üretmede kullanılır, constructor olmadan obje üretilemez.
     *Constructor da :-return typ yok
                      - class ismi ile aynı olmalı ismi
                    - ismi büyük harfle baslamalı
       Methodlarda ise  :-return typ var
                         - class ismi ile aynı olmak zorunda degil istedigimiz ismi verebiliriz
                        - ismi kücük harfle baslamalı

     * access modifier => constructor ismi(clas ismi ile aynı olmalı) => () => {}
          public Mammal(){ System. out.printl.("mammal"); }
     *Constructor'un nasıl callıstıgına bakmak icin runnur classta main icinde bir obje olusturup calıstırırsak,
     ilk önce parenttaki constructor'ı görürüm sonra en alttaki child classın constructorını görürüm.
      ör: Animal=> Mammal => Cat class'larımız var ve bu classlarda constructorları var
          Cat cat1 = new Cat(); => calıstırdıgımızda sırasıyla  "Animal=> Mammal => Cat" constructurlarını görürüz konsolda.
    Yani constructorlar yukardan asagıya dogru calısır.

     * -Java da object olustururken constructorlar parenttan child’a dogru calıstırır
       -Java en üst parent constructor’a cıkabilmek icin “super()” kodunu kullanır.
       -“super()” kodu her constructor’ın ilk satırında “gizli” olarak bulunur.
       -“super()” kodunu istersek görünür sekilde yazabiliriz
       -“super()” kodunu görünür sekilde yazarsak , ilk satır dısında bir satıra koyamayız, hata verir.
       -“super()” kodu parent class’tan constructor cagırmaya yarar.
          --
         //1) super() is used to call constructor from parent class.
        //2) super() is in the first line of every constructor body.
        //3) super() is invisible as default, if you want you can type it explicitly.

        Civic d = new Civic(2021);
        //1) super() can be used with parameters like super(true), super("Hybrid"), super(2021)
        //2) When a class has multiple constructors to select the constructor we need, we use
        //   super() with parameters
       ---

       **
       1-Class olusturuldugunda  Java otomatik olarak görünmez bir constructor verir, cünkü Java Class'ın bir kalıp oldugunu
        ve Object olusturmak icin olusturuldugunu ve Object olusturmak icin constructor'ın sart oldugunu bilir.
       2-Java'nın otomatik olarak olusturuldugu bu görünmez constructor'a "default constructor" denir.
       3- Biz kendimiz herhangi bir constructor olusturdugumuzda Java  "default constructor"ı siler.
       4- Bir classta birden fazla constructor olabilir. Ama parametreleri farklı olmalı
       ör: public Honda(){}
           public Honda(int price)}
           public Honda (int price, int year)} ... gibi

       5-"this" keyword "bu class" anlamındadır.örnegin "this.price" demek bu class'daki "price" isimli variable demektir
       "this.price" syntax'i construclorın icinde kullanılır.

       6- Constuctor kullanarak variable'lar üzerinde yaptıgınız degisimler sadece Object üzerindeki variable'ların degerlerini degistirir.
       Class daki variable degerlerini degistirmez.
       */
    public void eat (){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

}

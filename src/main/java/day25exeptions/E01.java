package day25exeptions;



public class E01 {
   /*
        1)"Exception" means un-expected issues in code execution
        2)There are two ways to work with Exceptions
            i)Using try-catch block: Handling Exception: exception olsa bile calısmayı devam ettirir.
            ii)Throw Exception and block the application: "throw" ise calısmayı durdurur.
        3) If you do not handle the Exception, Java stops execution and the application is blocked.
        4) "try" can be used with a "single" or "more" catch blocks: "try" bir kere, catch block'u ise bir ve daha fazla kullanabiliriz.
        5) "try" "cannot" be used "alone": "try" tek basına kullanılamaz.
        6)(e.getMessage());//Gives technical message about the Exception
          ör: System.out.println(e.getMessage());//Gives technical message about the Exception
        7) System.out.println("A problem occurred in array indexes"); seklinde catch bloc icine yazdıgım kod yazanın
             kendisi icin yazdıgı, teknik olmayan mesajdır.
        8)   e.printStackTrace();//Gives detailed technical message about the Exception.Detaylı
             "log(application'nın adım adım ne yaptıgını gösterir)" icin. Bunu kullanırken sout icine
             yazmaya gerek yok,cünkü kendi icinde print var. Genelde developurlar bunu kullanırlar.
        9) System.err.println("A problem occurred in array indexes"); Bu ise kendi mesajımı konsolda renkli yazdırı,
            renkli gösterir. Hata olan yeri daha rahat görmek icin kullanılır.
        10) try icindeki kod düzgün calısırsa "catch" kısmı calısmaz.

        11- Aralarında "parent-child" relationship olan Exception Class'ları multible catch'lerle kullanmak isterseniz
           "child" olan önce kullanımalıdır, aksi takdirde hata verir.
        12-  Aralarında "parent-child" relationship olan Exception Class'ları multible catch'lerle kullanmak isterseniz
             sıralamanın bi önemi yoktur.


           ---
           Java'da bir program calısırken, farklı sorunlar ile karsılasılabilir, beklenmedik bu sorunlara "exception"denir.
           Bu sorunların sebebi: code da hata olabilir, kullanıcı yanlıs degerler girebilir, internet baglantsı kesilmesi...

         *"if-else" We do not recommend that way.
          i)It is not mandatory for developers to know all math rules.
          ii)In Math, there may be very problematic rules, it is so difficult to cover all in if statement

                  *************
                  Exception 2'ye ayrılır.
                  i-RunTime Exception(diger ismi Unchecked exception)
                  ii-CompileTime Exception(diger ismi Checked exception)
        1-"AritmeticExeption" :matematik ile ilgili yapılan yanlıslıkları kapsar. Bunu if-else ile de cözebiliriz fakat
                               matematik kurallarını bilmemize gerek yok bu nedenle exceptionlarda kullanımı tavsiye edilmez
                               onun yerine try-chatch kullanırız.Handle Exception by using try-catch block
        2-ArrayIndexOutOfBoundsException : Bir arrayde length'inin bir eksigini index olarak alabiliriz.
                                           Ama length-1 den fazla bir rakam girersek hata alırız. Yani arrayin uzunlugunu asarsa istedigimiz hata verir.

        3-NullPointerException: If  you use "length()" method with "null" you will get NullPointerException
          int r3 = getNumOfChars(null);
          System.out.println(r3);
          Eger lenght() methodunda "null" kullanırsanız "NullPointerException" alırsınız.

       4-NumberFormatException: If you use "valueOf()" method with a String has non-digit character in it,
         you will have NumberFormatException. Yani String icinde rakamlar haricinde harfler gibi farklı karakter varsa bunu
         "valueOf()" kullanara integer'a cevirmek istedigimizde  exception'u verir.

       5-StringIndexOutOfBoundsException: If you use non-existing index for a String, you will get StringIndexOutOfBoundsException
                 Stringin sınırlarının yani indexinin  dısına cıkınca, stringde var olmayan idx kullanıldıgında bu exception verir.
          Yani: char r1 = getCharFromString("Java", 9);
                System.out.println(r1); //String2imin indexi 3 ama ben 9 girdigim icin bu exceptionu alırım.

     6-IllegalArgumentException: uygun olmayan deger hatası demek. örnegin yas icin olan bir methodda eksi bir deger girerse kullanıcı
        aplicationa uygun olmayan bir deger girmis olur. Bunu da "throw"  yani exception atarak engelleyebiliriz.
        Yani burda biz bilerek yanlıs bir deger girildiginde exception atarak uygulamanın durmasını saglamıs oluyoruz.
        -exception'ı biz üretirsek methodumuzda ,istersek try-catch ile method dısında cözüm üretebiliriz.
    -Method icinde exception nicin üretilir? -APLİCATİONUN MİMARLARININ OLUSTURDUGU KURALLARI KOYMAK İCİN
                                             -GÜNLÜK HAYATTA YASAK AMA JAVA İCİN YASAK OLMAYAN SEYLER İCİNDE EXCEPTİON ATILIR.(18 YAS ALTI CALISMA IZNI OLMAMASI GİBİ)
     */

    public static void main(String[] args) {
        divide(6, 2);
        divide2(6, 0); //AritmeticExeption matematik ile ilgili yapılan yanlıslıkları kapsar. => matematikde bir sayı 0 ile bölünemez.
    }

    //1.Way: We do not recommend that way.
    //       i)It is not mandatory for developers to know all math rules.
    //       ii)In Math, there may be very problematic rules, it is so difficult to cover all in if statement
    public static void divide(int a, int b){
        if(b==0) {
            System.out.println("A number cannot be divided by zero");
        }else {
            System.out.println(a / b);
        }
    }

    //2.Way: Handle Exception by using try-catch block
    public static void divide2(int a, int b){
        try{
            System.out.println(a/b);
            System.out.println("Hi Exceptions");
            System.out.println("Bye Exceptions");
        }catch(ArithmeticException e){
            System.out.println("A problem occured in division");
        }
    }

}

package day27exceptionscollections;

 //To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword
 //If you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)

  /*
           EXCEPTION OLUSTURMA:
           SORU: Costum Exception nedir ve nasıl üretilir?
           -Java kendi kurallarını exception olusturarak, developerların bu java kurallarına uymasını saglamıstır.
           -Bizde application üretirken kendi exceptionumuzu olusturarak diger developerların bizim kurallara uymasını saglamıs olusruz.
            Bizim ürettigimiz exceptionlar'a "Costum Exception" denir.
           -Custom exceptionlar da  "Run time Exception" ve"Compile Time Exception" olabilir.
           -Custom "RuntimeException" üretmek icin "extends RuntimeException" seklinde yazarız.
           -Custom "CompaileTimeException"  üretmek icin "extends Exception" yazılır.


        A-) "Compile Time Exception"(Checked Exception) OLUSTURMA
       - To make a class "Exception Class" make it child of the "Exception Class" by using "extends" keyword
        -If you use "extends Exception" it will be "Compile Time Exception"(Checked Exception)
   - Bütün exeption'ların sonunda "exception" kelimesi vardır o nedenle kendimizin ürettigi exception class'ın
    isminin sonundada "exception"kelimesi kullanmalıyız. ör: IllegalGradeException
    Ve "extends" etmeliyiz "Exception"sın parent clasına.
    -constroctor olustur ve obje olustururken mesajıda burdan almasını istedigim icin icine "String message" koydum.
    Bununda parent classına gidip alır : "super(message);" bunu parentdaki message iceren constructor'ı kullan.

      B-) RuntimeException OLUSTURMA:
      When you "extend" to "RuntimeException Class",your "Custom Exception" will be "RuntimeException"
      public class IllegalNameException extends RuntimeException{

  */
public class IllegalGradeException extends Exception{ // Bütün exeption'ların sonunda "exception" kelimesi vardır o nedenle kendimizin ürettigi exception class'ın isminin sonundada "exception"kelimesi kullanmalıyız.

    public IllegalGradeException(String message){

        super(message);
    }

// burda olusturdugumuz exception'ı "CustomExceptions01" classında kullandık.


}

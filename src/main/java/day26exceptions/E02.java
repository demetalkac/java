package day26exceptions;

public class E02 {


    /*
        1)If you want to execute a code for every scenario, use "finally" block after "try" body
        2)"try" can be used like i) try + single catch  ii)try + multiple catch  ii)try + single catch + finally
                                 iv)try + multiple catch + finally   v)try + finally
                                 Note: "try" cannot be used alone
        3)"ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundsException", "NumberFormatException",
          "StringIndexOutOfBoundsException", "IllegalArgumentException"  are displayed on the console after I click on "Run" button
          therefore those are called "RunTime Exception"
        4)There is "Compile Time Exception", they will be displayed before clicking on the "Run" button.
          Therefore, they are called "Compile Time Exception"
                --------------
         "final" , "finally" , "finalize" nedir acıklayınız:

        "final": Bir keyword'dür. verable,method , class icin kullanılır....
        "finally": -Bir "code block"dur.(süslü parantez icine yazıyoruz)
                  -"try-catch" veya sdece "try" ile de kullanılabilir.
                  - "finaly" code block icine yazılan code'lar her halukarda calıstırılır(ister exception olsun ister olmasın, her zaman calısır)
                   Mesela Database ile connection'ı kesmek herhalukarda yapılması gereken bir fiildir.Bunu "finaly" ile yaparız.
                  -"finaly" code blockunun en sonunda kullanılır.
       "finalize" : Bir methoddur. Bu method java tarafından datalar imha edilmeden cagrılır, bu method dataları imha edilecek
                   duruma getirir ve daha sonra "Garbage Collector" bu data'ları imha eder.
                   -"finalize" methodunu Java Developer'lar da cagırabilir ama Java kendi bildigini yapar.


     */

    public static void main(String[] args) {

        divide(6, 2);

      System.out.println("_______________");
        double r1 = compareNumOfCharacters("Java","xy");
        System.out.println(r1); //2.0
        //    System.out.println(compareNumOfCharacters("Java","xy")); //2.0

        double r2 = compareNumOfCharacters("null","xy");
        System.out.println(r2);

        double r3 = compareNumOfCharacters("selenium","");
        System.out.println(r3); //Herhangi bir sayı sıfır ile bölünemez

    }


    //Create a method to do division then save the result into database
    public static void divide(int a, int b){

        try {
            System.out.println(a / b + " was saved into database");
        }catch(ArithmeticException e){
            System.out.println("Do not use zero as divisor");
        }finally{
            System.out.println("Cut the connection with the database");
        }

    }

//NOT: Kod yazarken "finally" kullanıldıgında exception oldugunda da calıstırırlır, exception olmadıgında da calıstırılır.
 // Verilen 2 String'den birinin karekter sayısının digerinin kac katı oldugunu veren method yazınız
   public  static double compareNumOfCharacters(String s, String t) {

      double result =0;
      try {
          result = s.length() / t.length();
      }catch (NullPointerException e){
          System.out.println("length() methodu null ile kullanılamaz");

      }catch (ArithmeticException e){
          System.out.println("Herhangi bir sayı sıfır ile bölünemez");
      }finally{
          System.out.println("Cut the connection with the database");
      }
      return result;

   }



}

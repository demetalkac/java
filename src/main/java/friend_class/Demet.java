package friend_class;

import java.util.Scanner;

public class Demet {
    public static void main(String[] args) {

        //kullanıcıdan alınan ismin ilk ve son harfı
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.next();
        //1.WAY
        char firstName = name.charAt(0);
        char lastName = name.charAt(name.length() - 1);
        System.out.println(" " + firstName + lastName);

        //WAY
        String first = name.substring(0, 1);
        String last = name.substring(name.length() - 1);
        System.out.println(first + last);

        //"Ben kedi esim tavuk oglum inek sever"
        String str = "Ben kedi esim tavuk oglum inek sever";
        String animal1 = str.substring(4, 8);
        String animal2 = str.substring(14, 19);
        String animal3 = str.substring(26, 30);
        System.out.println(animal1 + " " + animal2 + " " + animal3);

        System.out.println("=================================0");
        // ilk ve soy ismini iceren isimlerden ilk ve soy ismin bas harflerini yazdırınız


        String sentence = "Ali ne zaman gelir";
        int num = sentence.replace(" ", "").length();
        System.out.println(num);

        String sen = "Ali ne zaman gelir";
        String n = sen.replace("a", "A");
        System.out.println(n);

        String t = "Kara kara dusunme Ankara";
        String h = t.replace("kara", "*");
        System.out.println(h);

        String ıd = "AC202117004";
        String newId = ıd.replaceAll("[0-9]", "*");
        System.out.println(newId);

        String u = "Ali 13 yasında, dersem inanma!...";
        String nu = u.replaceAll("[\\p{Punct},[0-9],[ ]]", "");
        int number = nu.length();
        System.out.println(number);


        String pwd = "B78c? K!m";

        boolean frst = pwd.replace(" ", "").length() > 7;

        boolean sec = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;

        boolean thr = pwd.replaceAll("[^0-9]", "").length() > 0;
        boolean four = pwd.replaceAll("[a-z0-9,\\p{Punct} ]", "[A-Z]").length() > 0;
        boolean fif = pwd.replaceAll("[A-Z0-9,\\p{Punct} ]", "[a-z]").length() > 0;
        boolean gec = frst && sec && thr && four && fif;
        if (gec) {
            System.out.println("is true");
        } else {
            System.out.println("is not true");
        }

      /*
First we need to create "Scanner"
If we want, we can get the 2 words we need from the user.
 //We must create an empty string to put the elements we will use.
 //We must create separate indexes for the entered elements. That's why we use the split() method.
   When we split, the index of the 1st element becomes 0, that of the 2nd element 1.It gives us the split() method, its rule.
//We need the last character of element s1. How can we find this? We can find it using substring(int beginIndex):s1.substring(s1.length()-1)
  //We need to find the first character of the second element, namely s2. We can find this again with substring(int beginIndex, int endIndex):(s2.substring(0,1)
//If the last character of s1 is the same as the first character of s2,
use the replace() method to replace the last character of s1 with nothing.
 Why did we create s3? Because we replaced s1 with replace() to combine 2 elements. If this condition cannot be met, that is, if we cannot combine, we call Java to add s1 and s2.
      */

        /*
        İlk önce "Tarayıcı" oluşturmamız gerekiyor
İstersek kullanıcıdan ihtiyacımız olan 2 kelimeyi alabiliriz.
 //Kullanacağımız elemanları koymak için boş bir string oluşturmalıyız.
 // Girilen elemanlar için ayrı indeksler oluşturmalıyız. Bu yüzden split() yöntemini kullanıyoruz.
   Böldüğümüzde, 1. elemanın indeksi 0, 2. elemanın indeksi 1 olur. Bize split() yöntemini, kuralını verir.
// s1 öğesinin son karakterine ihtiyacımız var. Bunu nasıl bulabiliriz? Bunu substring(int startupIndex):s1.substring(s1.length()-1) kullanarak bulabiliriz.
  //İkinci elemanın ilk karakterini, yani s2'yi bulmamız gerekiyor. Bunu substring(int startupIndex, int endIndex):(s2.substring(0,1) ile tekrar bulabiliriz.
//s1'in son karakteri s2'nin ilk karakteriyle aynıysa, s1'in son karakterini hiçbir şeyle değiştirmek için replace() yöntemini kullanın. Neden s3'ü yarattık?
Çünkü 2 elemanı birleştirmek için s1'i replace() ile değiştirdik. Bu koşul sağlanamıyorsa yani birleştiremiyorsak s1 ve s2 eklemek için Java diyoruz.
         */


    }
}

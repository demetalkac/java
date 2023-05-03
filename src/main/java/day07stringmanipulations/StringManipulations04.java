package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data type in Java";

        boolean result1 =str.isEmpty(); // isEmpty() method returns true if the String does not have any character,
                                        // returns false if the String has any character,
                                        // str.length()==0 and isEmpty() have same meaning but to check if a String
                                        //is empty using isEmpty() is preferable

        System.out.println(result1); //true

        boolean result2 = str.isBlank();  //isEmpty("")==>true, isEmpty(" ")==>false
                                          //isBlank("")==>true, isBlank(" ")==>true
        System.out.println(result2); //true

        //Example 1: Check if a String has just letters and spaces in it
        String s= "Learn Java earn money!";

        Boolean result3 = s.replaceAll("[a-zA-Z]","").isEmpty();
        System.out.println(result3); //false

        //Example 2: Check SSN for the following rules
        //         1)It must have just digits
        //         2)It must have 9 digits
        String ssn = "234A45678";

        // 1)It must have just digits
        Boolean firstRule = ssn.replaceAll("[0-9]","").isEmpty();

        // 2)It must have 9 digits
        boolean secondRule = ssn.length()==9;

        if (firstRule && secondRule) {
            System.out.println("Valid ssn");
        }else {
            System.out.println("Invalid");
        }


        //Example 3: Bir password'un gecerli olup olmadıgını asagıdaki kurallara göre test eden kodu yazınız
        //         i)Space haric en az sekiz karakter olmalı
        //        ii)En az 1 sembol icermeli
        //       iii)En az 1 rakam icermeli
        //        iv)En az 1 büyük harf icermeli
        //         v)En az 1 KüCük harf icermeli

        String pwd = "B89C? Kn!";

//         i)Space haric en az sekiz karakter olmalı

      boolean first =  pwd.replace(" ", "").length()>7;
//        ii)En az 1 sembol icermeli
      boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>8;

//       iii)En az 1 rakam icermeli
      boolean third = pwd.replaceAll("[^0-9]","").length()>0;
//        iv)En az 1 büyük harf icermeli
      boolean fourth =pwd.replaceAll("[^A-Z]","").length()>0;
//         v)En az 1 KüCük harf icermeli
      boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

      boolean gecerliPwd = first && second && third && fourth && fifth;

      if (gecerliPwd){
          System.out.println("Pasword'unuz gecerli");
      }else {
          System.out.println("Pasword'unuz gecersiz");
      }


    }

}

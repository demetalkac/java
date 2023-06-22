package day17listpassbyvalue;

public class PassByValue01 {

    /*
        1) When you use a variable inside a method, Java creates the copy of the variable
           and uses it inside the method. Java does that to protect the original value of the variables.
           If in every method usage, the value changes, it creates very big problems.

           Java "Pass by value" kullanır, orjinali degeri degistirmez.

       2) Some programming languages do not use "Pass by value" they use "Pass by reference".
          If you use "Pass by reference" original will change in every method usage.

          Bazı developerlar "Pass by reference" kullanır bunda degerin orjinaali degisir.

      3) If you insist on changing the original value in Java you can do it as well.
         Assign the updated value to the original variable then original value will be updated.
 */

    public static void main(String[] args) {

        int price = 20;
        System.out.println(price);


        price = change(price);  //burda orginal degeri degistirdik. Java'nın esnekligi normalde degistirmez ama biz istersek bu sekilde degistirebiliriz degeri.
        System.out.println(price);//40


    //not: alttakinde orginal degeri degistirmedik
      int x= 5;
        System.out.println(x); //5

        ucret(x); //10
        System.out.println(x); //5



    }

    public static int change (int a){

        return a*2;
    }

    public static void ucret (int a){

        System.out.println( a*2);
    }



}

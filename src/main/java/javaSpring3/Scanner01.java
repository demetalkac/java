package javaSpring3;

public class Scanner01 {
    public static void main(String[] args) {
        //4) soru
        int a = 12;
        int b = 15;
        a*=2;
        b/=3;
        System.out.println(a+b);
        /*
                     a=a*2       b=b/3
                     a=12*2      b=15/3
                      =24    +     =5   =29
         */

     //6.Which one prints true on the console?
        System.out.println(2!=3 || 4>=4);  //true
        System.out.println('A'>'a' || 'c'<'f');  //true
        System.out.println('A'>23 || 'A'<'z');  //true
        System.out.println(4<3 || 2==3 || 5>=7);//false

     //7.What is the output?
        int result = 2+3*(12 - 4/2)/15 - 3;
        System.out.println(result); //1

        System.out.println(5/2.0);
      //  Prints 2.5 on the console




    }
}

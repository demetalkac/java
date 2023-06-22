package day18datetimeclassvarargs;

public class Varargs01 {

    /*
        1)If you want to make number of parameters flexible in a method, use "varargs"
        2)To create a varargs "Data Type + ... + space + a name for the varargs"
        3)"Varargs" use Arrays behind. When you work with varargs you may think you are working with Arrays.
        4)"Varargs" can accept zero or more elements
      ınt q1==> 5)Can I use another regular parameter after "varargs"?
          No, because "varargs" cannot be made full, second parameter will be unreachable, it will give error.
          "varargs" must be last parameter everytime.

       ınt q2==> 6)Can I use another regular parameter before "varargs"?
          Yes, you can use many regular parameters before "varargs"

      intq3==> 7)Can I use multiple "varargs" parameter in a method?
             No.Because once we type varargs as first parameter then we cannot add other parameters after varargs...

       "varargs" : variable argument
     */



    public static void main(String[] args) {

        System.out.println(add(3,5)); //8
        System.out.println(add(3,5,2)); //10
        System.out.println(add()); //0
        System.out.println(add(3)); //3


    }

    // Create a method adds two integers ( sade ce 2 tane sayı degil, istedigim kadar sayıyı toplayabilirim.
    public static int add(int... a){

        int sum =0;

        for (int w : a){  //varags'ların arkasında arrays calısır, o nedenle for each kullanıyoruz.

            sum = sum + w;
        }
        return sum;
    }


}

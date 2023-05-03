package questionBank;

public class WrapperClasses {
    public static void main(String[] args) {

        //1) Type a code to find the sum of the minimum value of the byte and the maximum value of
        //short data types.
       byte min=Byte.MIN_VALUE;
       short max=Short.MAX_VALUE;
        System.out.println(min+max); //32639

        //2) Type a code to convert “103” String to byte and to convert “2351” String to short then print
        //the difference on the console.
          byte first=Byte.valueOf("113");
          short second=Short.valueOf("2351");
        System.out.println(second-first);  //2238

        //What are the differences between valueOf(String s) and parseByte(String s) methods?
       /* parseByte() returns primitive integer type (int), whereas valueOf() returns java.lang.Integer, which
        is the object representative of the integer. There are circumstances where you might want an Integer
        object, instead of a primitive type.
        Of course, another obvious difference is that valueOf() is an instance method whereas parseByte()
        is a static method.


       parseByte(), primitive tamsayı türünü (int) döndürürken, valueOf(), java.lang.Integer'ı döndürür;
       tamsayının nesne temsilcisidir. Bir Tamsayı isteyebileceğiniz durumlar vardır.
       nesne, ilkel bir tür yerine.
      Tabii ki, başka bir bariz fark, valueOf()'un bir örnek yöntem, parseByte()'nin ise statik bir yöntem olmasıdır.
         */



    }
}

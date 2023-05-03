package day03_scanner;

public class IfStatement01 {

    public static void main(String[] args) {

       //If statement: We sometimes need to execute some codes under some specific conditions
       //If it rains, I will cansel  the picnic


       //Example 1) The code to print "negative" for the numbers less than zero, "non-negative" for the numbers
        // greater than or equal to zero

        double d= 2.3;
        if (d<0) {
            System.out.println("Negative");
        }
        if (d>=0) {
            System.out.println("Non-negative");
        }

        //Example 2:Verilen character büyük harf ise ekrana "Büyük harf" yazdırın
        char ch= 'A';

        if (ch>='A' && ch<='Z'){
            System.out.println("Büyük harf");
        }

        //Example 3:Verilen bir sayı üc basamaklı ise ekrana "Uc basamaklı" yazdırın
        int n= 113;
        n =Math.abs(n); //abs() methodu negatif sayıyı pozitif sayıya cevirir. Ve "Math" classından cagılır.

        if (n>99 && n<1000){
            System.out.println("Uc basamaklı");
        }



        //Example 4: Type code to print "Divisible by 5" if the number can be divided by 5, otherwise print
        // "Not divisible by if 5" if the number cannot be divided by 5.

        //Note: In java "==" means equals.
        //Note:  in java "=" is assignment operator.

        //Note:  % (modulus operator) ==> gives the remainder of a division operation.
        //      " % " is called "modulus"  operator

        //Note: "!" in java means "not"
        //      !true ==> false   !false ==> true  !!true ==>true
        //       "!=" means "does not equal to"

       int i= 1505;

        //1.way: Multiple if statement

        if (i%5==0){
            System.out.println("Divisible by 5");
        }

        if(i%5 != 0){  // "!" means "NOT" in Java!.
            System.out.println("Not divisible by 5");
        }

        //2.way: İf else statements ==>use it if you have just two conditions
        //In the second way java check  just 1 condition, but in the first Java checks 2 conditions.
        //If you type the code in the second firstly, you will prevent repetition and secondly Java will execute your code faster.
        int k=15;
        if (k%5 ==0) {
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Not divisible by 5");

        }

        }
             // not:  1.way 2 conditions were checked
             // 2.w/ay 1 conditions was checked
             // 2.way better






}

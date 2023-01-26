package day06;

public class ConcatenationIf {
    /*
    Concatenation: Joining String with each other or with other data type.
    To do concatenation we have 2 option:
    1) Use '+' sign ==> We can use this way with all data types
    2) Use 'concat()' method ==> Inside the concat() parenthesis you can put just string not other data types
     */

    public static void main(String[] args) {
        String s= "Tom";
        String t= "Hanks";

        int i= 12;
        int a= 5;
        char c='A';

        //Way:By using "+" sing
        System.out.println(s+" "+t); //Tom Hanks

        System.out.println(s+ i+ a); //Tom125
        System.out.println(s+ (i+a));  //Tom17
        System.out.println(i+ a+ s); //17Tom
        System.out.println(i+ s+ a ); //12Tom5

        System.out.println(s+ a*i); //Tom60

        System.out.println(i + c +s); //77Tom
        System.out.println(c+ s+ a); //ATom5


        //2. Way:By using concat()
        System.out.println(s.concat(" ").concat(t));//Tom Hanks







    }
}



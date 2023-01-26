package day34lambdafpintstreamandpojo;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class LambdaIntStreamUsage {
    public static void main(String[] args) {

        List<Integer>  l = new ArrayList<>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);

        getSumOfAllElements(l);
        System.out.println();
        getSumOfIntFrom7To100A();
        System.out.println();
        getSumOfIntFrom7To100B();
        System.out.println();
        getMultiplicationOfIntFrom2To11();
        System.out.println();
        findFactorial(5);
        System.out.println();
        sumOfEvenIntGivenRange(4,13); //4+6+8+10+12=40
        System.out.println();
        findSumOfDigitsForTheIntsInTheGivenRange(23,32);
        System.out.println();
        getSumOfDigitsOfInteger(123,127);




    }

    //1) Create a method to find the sum of all elements in the list
    public static void getSumOfAllElements(List<Integer>  l){
       Integer sum= l.stream().reduce(0, Math::addExact);
        System.out.println(sum); //80
    }

    //2) Create a method to find the sum of the integers from 7 to 100.
    //1.way
    public static void getSumOfIntFrom7To100A(){
        Integer sum=  IntStream.range(7,101).reduce(0,Math::addExact);
        System.out.println(sum); //5029
    }

    //2.way
    public static void getSumOfIntFrom7To100B(){
        Integer sum=  IntStream.rangeClosed(7,100).sum(); //sum() ==>Returns the sum of elements in this stream
        System.out.println(sum); //5029
    }

    //3)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).
    public static void getMultiplicationOfIntFrom2To11(){
      Integer result =  IntStream.rangeClosed(2,11).reduce(1,Math::multiplyExact);
        System.out.println(result); //39916800
    }

    //4) Create a method to calculate the factorial of a given number. (5 factorial = 1*2*3*4*5 ==> 5! = 1*2*3*4*5)
    public static void findFactorial(int x) {

        if (x < 0) {
            System.out.println("Do not use negative numbers");
        } else{
           Integer result = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
            System.out.println(result);
        }
    }

    //5) Create a method to calculate the sum of even integers between given two integers
    public static void sumOfEvenIntGivenRange(int s, int e){
     Integer result = IntStream.rangeClosed(s,e).filter(UtilsClass::checkToBeEven).sum();
        System.out.println(result);
    }
    /*
     5.soru SARA HOCA:
    public static int sumOfIntsInGivenRange2(int a, int b){
        int x=0;
        if(a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum();
    }
     */

    //6)Create a method to calculate the sum of digits of every integer between two given integers
    //Sara h.
    // 23 and 32 ==> 2+3  2+4 .... 3+2
    public static int findSumOfDigitsForTheIntsInTheGivenRange(int a, int b) {
        int x = 0;

        if (a > b) {
            x = a;
            a = b;
            b = x;
        }
        return IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigits).sum();
    }
    //Suleyman h.
    public static void getSumOfDigitsOfInteger(int s, int e) {
        Integer result = IntStream.rangeClosed(s, e).map(UtilsClass::getSumOfDigits).sum();
        System.out.println(result); //40
    }










}


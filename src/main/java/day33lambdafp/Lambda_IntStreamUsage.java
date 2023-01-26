package day33lambdafp;

import java.util.stream.IntStream;

public class Lambda_IntStreamUsage {

    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred01());//5029
        System.out.println(getSumFromSevenToHundred02());//5029

    }

    //1) Create a method to find the sum of the integers from 7 to 100.

    public static int getSumFromSevenToHundred01(){

        //IntStream.range(7, 101)==> has the same functionality with for-loop in structured programming

        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }
    public static int getSumFromSevenToHundred02(){

        //IntStream.rangeClosed(7, 100)==>has the same functionality with for-loop in structured programming
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);

    }
    //2)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).


}

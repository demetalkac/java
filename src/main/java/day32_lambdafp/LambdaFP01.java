package day32_lambdafp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);


        getMinGreaterThanSevenEvenNum1(l); //8
        System.out.println();
        getMinGreaterThanSevenEvenNum2(l);
        System.out.println();
        getHalfOfDistinctEleInReverseOrder(l); //[65.5, 5.0, 4.5, 4.0]


    }
    //1) Create a method to find the minimum value which is greater than 7 and even elements from the list
    //1.way:
    public static void getMinGreaterThanSevenEvenNum1(List<Integer> list){
        Integer min = list.stream().distinct().filter(t-> t%2==0).filter(t-> t>7).sorted().findFirst().get();
        //Note: This code returns Integer because lists work with non-primitive data types
        System.out.println(min); //8
    }

    //2.way
    public static void getMinGreaterThanSevenEvenNum2(List<Integer> list){
        Integer min = list.stream().distinct().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
        System.out.println(min); //8
    }


    //2)create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list.

    public static void getHalfOfDistinctEleInReverseOrder(List<Integer> list){
       List<Double> result= list.
               stream().
               distinct().
               filter(t-> t>5).map(t-> t/2.0).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());
        System.out.println(result); //[65.5, 5.0, 4.5, 4.0]
    }






}

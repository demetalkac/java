package demet01;

import java.util.Arrays;

public class ArraysWhitMethod02 {

    //   question 1: Write a method that acceepts an array and swap the first and last element in the arra.
    //   Print the modified array
    //   int[] x={1,2,3,4}; ==> [4,2,3,1]
    //   int[] y={1,2,3}; ==> [3,2,1]

    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        swap(arr);

    }

    public static void swap(int[] arr){
        int emty =0;
        emty= arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=emty;
        System.out.println(Arrays.toString(arr));


    }

}

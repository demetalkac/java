package day14_arrays;

import java.util.Arrays;

public class Arrays01 {


    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
        // [2, 3, 12, 0, 0, 0]

        int arr[] = {0, 2, 3, 0, 12, 0};

        int brr[] =new int[arr.length];
        int idx=0;


        for (int i =0; i<arr.length; i++){

            if (arr[i]!=0){
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr)); // [0, 2, 3, 0, 12, 0]
        System.out.println(Arrays.toString(brr)); // [2, 3, 12, 0, 0, 0]

        System.out.println();

        // Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[]={-12, 23, 5, 99, 45, 63};
        int counter= 0;
        int element= 23;

        for (int w: crr){
            if (w==23){
                counter++;
            }
        }
         if (counter>0){
             System.out.println("The number exists in the array");
         }else {
             System.out.println("The number  does not exists"); //The number exists in the array
         }




    }
}

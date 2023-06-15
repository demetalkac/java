package demet01;

public class ArraysWhitMethod03 {

//   question 1: Write a method that acceepts an array and print the difference between the largest and smalest values i the array
//    int[] x = {10,3,5,6} ==>7

    public static void main(String[] args) {

        int[] arr = {10,3,5,6};
        System.out.println(difference(arr));


    }
    public static  int difference(int[] arr){

        int max =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }

        int min =max;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return max-min;

    }

}

package javaSlidesPDF;

public class MultiDimensionalArraysQuestions {
    public static void main(String[] args) {

  //1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }

        int arr1[][] ={{1,2,3}, {4,5,6} };
        int sum =0;
       for (int[] w: arr1){
           for (int u:w){
             sum =sum +u;
           }
       }
        System.out.println(sum); //21

        System.out.println();
   //2) Find the product of the last elements in the array elements of the
     // given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int arr2[][] = { {1,2,3}, {4,5}, {6} };






    }
}

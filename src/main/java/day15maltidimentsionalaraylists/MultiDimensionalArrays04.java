package day15maltidimentsionalaraylists;

public class MultiDimensionalArrays04 {
    public static void main(String[] args) {
        //Example 1: Find the maximum element in two-multidimensional array , minimum element and maximum element+minimum element
        //          { {5,0}, {-2,4}, {65, -12, 23} }

        int arr[][] = { {5,0}, {-2,4}, {65,-12,23} };

        int maxElement = arr[0][0];
        int minElement = arr[0][0];

        for (int[] w : arr){

            for (int u : w){
                //1.Way
               // if (max < u){
                  //  maxElement = u;
                //}
                //2.Way
                maxElement = Math.max(maxElement, u); // max() method selects the maximum value of the given two numbers
                minElement = Math.min(minElement, u);
            }
        }
        System.out.println(maxElement); //65
        System.out.println(minElement); //-12

        System.out.println(maxElement + minElement); //11


    }
}

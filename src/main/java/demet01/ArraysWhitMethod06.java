package demet01;

public class ArraysWhitMethod06 {

    //     question 1: Write a method that acceepts an array and prints true if the sum of all 2's in the
    //     array is exactly 8
//    int[] x={2,3,2,2,4,2} ==> true
//    int[] y={2,3,2,2,4,2,2} ==> false



    public static void main(String[] args) {
        int[] x={2,3,2,2,4,2};
        sumOfTwo(x);

        System.out.println(sumOfTwo(x));
    }

    private static boolean sumOfTwo(int[] x) {

        int sum =0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]==2){
                sum+=x[i];
            }

        }
        if (sum==8){
            return true;
        }


        return false;
    }

}

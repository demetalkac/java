package demet01;

public class ArraysWhitMethod04 {

    public static void main(String[] args) {
//   question 1: Write a function that accepts an array and prints the sun of the numbers in the arra.
//   Except the number 13 is very nulucky, so it does not count and numbers that come immediately after a
//   13 also do not count.
//     int [] x= {1,2,2,1,13} ==>6


        int [] x= {1,2,2,1,13} ;
        sumOf (x);
        System.out.println(sumOf(x));

    }

    public static int sumOf(int[] x) {
        int sum =0;

        for (int i = 0; i <x.length ; i++) {

            if (x[i]!=13){
                sum =sum+x[i];

            }else {
                break;
            }

        }
        return sum;

    }


}

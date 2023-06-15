package demet01;

public class ArraysWhitMethod05 {

    //   question 1: Write a method that acceepts an array and print the total of the numbers in the array,
//   axcept ignore sections of numbers starting with a 6 and extending to the next 7
//   (every 6 will be followed by at least one 7)
//  int[] y ={1,2,2} ==>5
//  int[] x = {1, 2, 2, 6, 99, 99, 7, 3} ==>5


    public static void main(String[] args) {
        int[] x = {1, 2, 2, 6, 99, 99, 7, 3};
        System.out.println(sumOf(x));
    }
    public  static int sumOf(int[] x){
        int sum =0;
        boolean checkSix =false;

        for (int i = 0; i <x.length ; i++) {

            if (checkSix){
                if (x[i] ==7){
                    checkSix=false;
                }
            } else if (x[i] ==6){
                checkSix=true;

            }else {
                sum=sum+x[i];
            }

        }
        return sum;
    }
}

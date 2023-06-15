package day14_arrays;

public class flag02 {
 //   question 1: Write a method that acceepts an array and prints true if the array contains a 2 next
 //   to a 2 somewhere.  (arka arkaya 2 gelirse true yoksa false)
 //         ex: int [] x= {2,2,1} ==>true
 //         int [] y= {2,1,} ==> false

    public static void main(String[] args) {
        int [] x= {2,2,1};

        /*
       boolean flag=false;

        for (int i = 0; i <x.length ; i++) {

            if (x[i] ==2 && x[i+1]==2){

            }
            if (flag){
                System.out.println(true);
            }else {
                System.out.println(false);

            }

         */


        System.out.println(containss(x));
    }



    private static boolean containss(int[] x) {


        for (int i = 0; i <x.length ; i++) {

            if (x[i] ==2 && x[i+1]==2){
                System.out.println(true);
            }else {
                System.out.println(false);
            }


        }

        return false;
    }


}

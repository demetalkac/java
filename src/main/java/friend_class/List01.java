package friend_class;

import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {

        List<Integer> arr= Arrays.asList(12, 11, 15, 34);
        int sum=0;
        for (Integer w: arr){

            sum= sum +w;
        }
        System.out.println(sum);

      //Find the multiplication of all even list elements in an integer list
        List<Integer> brr= Arrays.asList(12, 11, 15, 34, 8, 38, 13, 33);
        int sumOf=1;

        for (Integer u: brr){
            if (u%2==0 ){
                sumOf=sumOf*u;


            }else {continue;
            }

        }
        System.out.println(sumOf);




    }
}

package practiceDay19;

import java.util.Arrays;
import java.util.List;

public class Q02_ConvertingEleInALıst {
    public static void main(String[] args) {

 /*
   If the list has 15 as element, change all 15s to 51
   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
   */
        List<Integer> list = Arrays.asList(12, 11, 15, 34,15, 43);
        System.out.println(list); //[12, 11, 15, 34, 43]

        if (list.contains(15)){
            for (int w: list){
                if (w == 15){
                    list.set(list.indexOf(15), 51);
                }
            }
        }else {
            System.out.println("List does not contain the expected element");
        }
        System.out.println(list); //[12, 11, 51, 34, 51, 43]

    }
}

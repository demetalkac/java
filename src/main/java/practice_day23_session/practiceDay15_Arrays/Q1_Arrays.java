package practice_day23_session.practiceDay15_Arrays;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not


        String str[] = {"Ellie", "Susan", "Michael", "George", "Tom"};

         //1.Way

        String name= "George";
        int counter=0;


        for (String w: str){
            if (w.equals(name)){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(name + "exists in the array");
        }else {
            System.out.println("does not exists in the array");
        }

        //2.Way:We will use binarySearch()
        // If the element existing binarySearch() method returns the index of the element
        // When we need to use binarySearch(), we have to sort the array first and then use binarySearch().

        Arrays.sort(str);
        System.out.println(Arrays.toString(str)); //[Ellie, George, Michael, Susan, Tom]

         int idx=Arrays.binarySearch(str, "George");

        System.out.println(idx);

        int idxAli= Arrays.binarySearch(str, "Sally");
        System.out.println(idxAli);  //-4



    }
}

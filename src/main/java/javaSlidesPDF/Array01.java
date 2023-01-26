package javaSlidesPDF;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        //sort: (sayfa:134)
       int[ ] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);

        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //example 1:
        int arr[] = {2, 1, 7, 6};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        //example2:
        String str[] = {"Ali", "Ahmet", "Kemal", "Can"};
        Arrays.sort(str);
        for (int i =0; i<str.length; i++){
            System.out.print(str[i] + " ");
        }

        //exsample3: binarySearch(),
        int[ ] number = { 2, 4, 6, 8 };

        System.out.println(Arrays.binarySearch(number, 2)); //0
        System.out.println(Arrays.binarySearch(number, 4)); //1

        System.out.println(Arrays.binarySearch(number, 1)); //-1
        System.out.println(Arrays.binarySearch(number, 3)); //-2
        System.out.println(Arrays.binarySearch(numbers, 9)); //-5
        System.out.println();
        //exsample4: binarySearch()
        int ar[] ={2,1,7,6};
        Arrays.sort(ar);
        System.out.println(Arrays.binarySearch(ar,2)); //1
        System.out.println(Arrays.binarySearch(ar,7)); //3
        System.out.println(Arrays.binarySearch(ar,3)); //-3
        System.out.println(Arrays.binarySearch(ar,9)); //-5
        System.out.println();
       String s[] ={"A","C","B" ,"D"};
       Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"A")); //0
        System.out.println(Arrays.binarySearch(s,"C")); //2
        System.out.println(Arrays.binarySearch(s,"E")); //-5
        System.out.println(Arrays.binarySearch(s,"G")); //-5

        System.out.println();
        //exsample5: String method split()
        String st = "What about Java, did you like it";
        String arra[] = st.split(",");
        System.out.println(Arrays.toString(arra)); //[What about Java,  did you like it]

        //exsample6: Note 1: equals() returns boolean
        //Note 2: equals() compares both values and indexes
        int arr1[]= {2,1,7,6};
        int arr2[]= {2,1,7,6};
        System.out.println(Arrays.equals(arr1,arr2)); //true

        int arr3[]= {3,2,8,7,11};
        int arr4[]= {7,8,3,11,2};
        System.out.println(Arrays.equals(arr3,arr4)); //false

        int arr5[]= {4,5,9,8,10};
        int arr6[]= {8,9,4,10,5};
        Arrays.sort(arr5);
        Arrays.sort(arr6);
        System.out.println(Arrays.equals(arr5,arr6)); //true
















    }
}

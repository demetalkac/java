package friend_class;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        //1) Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
        int sum= 0;

        int arr[][] = {{1,2,3}, {4,5,6} };

        for (int[] w: arr){
            for (int u: w){
                sum = sum + u;
            }
        }
        System.out.println(sum);
        //2) Find the product of the last elements in the array elements of the
        //given multi dimensional array { {1,2,3}, {4,5}, {6} }

        int brr[][] = { {1,2,3}, {4,5}, {6} };
        for (int[] w:brr){

        }

       /* 3) Find the sum of the elements whose indexes are same in the given two multi dimensional arrays
                arr1 = { {1,2}, {3,4,5}, {6} } and arr2 = { {7,8,9}, {10,11}, {12} }
        4) Find the sum of the elements in the array elements of the given multi dimensional array
        { {1,2,3}, {4,5}, {6,7} } and return an array.
                For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
        Multi Dimensional Arrays Questions
        5) Ask user to enter long two sentences. Then type a program to count all “words” in the sentences.
                For example; if user enters “Java is easy, if you study. Nothing is easy, if you do not study” output will be 14.
        Hint: Use split()
        6) Write a Java program to remove a specific element from an array.
    */

        // 4) Find the sum of the elements in the array elements of the given multi dimensional array
        //        { {1,2,3}, {4,5}, {6,7} } and return an array.
        //                For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
        //        Multi Dimensional Arrays Questions

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter long two sentences");
        String a = scan.nextLine();

        String b [] = a.split(" ");

        System.out.println(b.length);
        System.out.println(Arrays.toString(b));

     //6) Write a Java program to remove a specific element from an array.
        int crr[]={12,34,54};




        /*
        List Questions
       1)Create a String list whose elements are A, C, E, and F. Print it on the console.
       2)By using add() with index method, add B into the 1st index.
        List elements should be like A, B, C, E, and F. Print it on the console
        3)By using set() method, convert E to D.
      List elements should be like A, B, C, D, and F. Print it on the console
        4)By using remove() method, remove F from the list.
     List elements should be like A, B, C, D. Print it on the console
      5)Find the size of the list and print the size on the console.
         */














    }
}

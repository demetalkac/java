package day14_arrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: Type code to check if a specific element exists in an Array or not
        String str[] = {"Ali", "Tom", "Carl", "Angie"};

        //1.Way:
        String name = "Carl";
        int counter = 0;
        //Ali, Tom, Carl, Angie
        for (String w : str) {
            if (w.equals(name)) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(name + " exists in the Array");
        } else {
            System.out.println(name + " does not exist in the Array");
        }

        //2.Way: We will use binarySearch() method
        // binarySearch() methodunu kullanmadan önce mutlaka "Arrays.sort()" methodunu kullanmalıyız.
        // binarySearch() bize bir elementin arrayde olup olmadıgını verir. Eger element arrayde varsa o elementin indexini verir.
        // binarySearch() methodu tekrarlayan elementler icin kullanılmaz( iki tane 22 varsa bazen 1.yi bazen 2. 22'i verir, o nedenle kullanılmaz)
        //      i)If the element exists binarySearch() method returns the index of the element

        Arrays.sort(str);//["Ali", "Angie", "Carl", "Tom"]

        int idx = Arrays.binarySearch(str, "Carl"); // 2 parametre ile calısır: 1.arrayın adı, 2.aradıgımız element
        System.out.println(idx);//If the index is zero or more, it means the element exists

        int idxMiami = Arrays.binarySearch(str, "Miami");
        System.out.println(idxMiami);   //  -4 ==>  "-" means does not exist. ("-" elementin arrayde olmadıgını, "rakam(4)" ise olsaydı kacıncı sırada oldugunu gösterir. sırayıda sort kullandıgımız icin ona göre sıraya sokar)
        //          "4" means if it exists it would be 4th element


//    Example 1:

        int arr[] = {12, 23, 45, 9};

        int number = 45;

        Arrays.sort(arr);

       int indxx= Arrays.binarySearch(arr, number);
        System.out.println(indxx); //3

    }
}

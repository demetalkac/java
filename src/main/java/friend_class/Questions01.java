package friend_class;

import java.util.Scanner;

public class Questions01 {
    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle .
        Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
       Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"

                   // code start here use s1 and s2 as words
        // kodu burdan başlatın ve s1 ve s2 kelime olarak kullanın
         */

         /*
            Given two string by using scanner class and add each other
            if first word last letter is same with second word first letter then remove one of them.
            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        //First we need to create "Scanner"
        Scanner scan = new Scanner(System.in);

        //If we want, we can get the 2 words we need from the user.
        System.out.println("enter two element");

        //We must create an empty string to put the elements we will use.
        String  allElements = scan.nextLine();

        //We must create separate indexes for the entered elements. That's why we use the split() method.
        // When we split, the index of the 1st element becomes 0, that of the 2nd element 1.
        // It gives us the split() method, its rule.
        String[] elements = allElements.split(" ");
        String s1 = elements[0];
        String s2 = elements[1];

        //We need the last character of element s1. How can we find this?
        // We can find it using substring(int beginIndex):s1.substring(s1.length()-1)

        //We need to find the first character of the second element, namely s2.
        // We can find this again with substring(int beginIndex, int endIndex):(s2.substring(0,1)

        //If the last character of s1 is the same as the first character of s2,
        // use the replace() method to replace the last character of s1 with nothing.
        // Why did we create s3? Because we replaced s1 with replace() to combine 2 elements.
        // If this condition cannot be met, that is, if we cannot combine, we call Java to add s1 and s2.

        if(s1.substring(s1.length()-1).equals(s2.substring(0,1))){
            String s3=s1.replace(s1.substring(s1.length()-1),"");
            System.out.println(s3+s2);
        }else{
            System.out.println(s1+s2);
        }


    }
}

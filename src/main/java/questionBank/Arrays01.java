package questionBank;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        1) Find the middle element in an integer array
           Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
                    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */

        int arr1[] ={12, 5, 8, 13};
        Arrays.sort(arr1);

        if(arr1.length%2!=0){       //arr1'in 2'ye bolumunden kalan 0 degılse,yani length de element sayısı tek ise
            Integer indexOfMiddleElement = arr1.length/2;  //arr1 lenght'i 2 ye bol
            System.out.println(arr1[indexOfMiddleElement]); //midil element budur
        }else{                                              // degilse
            Integer indexOfMiddleElement = arr1.length/2;   // arr1 lenght'i 2 ye bol ve
            Integer averageValue = (arr1[indexOfMiddleElement] + arr1[indexOfMiddleElement-1])/2;
            System.out.println(averageValue);  //averageValue(ortalamaDeger) bulmak icin sonucu -1 ile topla ve 2'ye bol
        }

        //2) Find the smallest positive element and greatest negative element in an integer array
        //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, greatest negative is -2
          //1.Way:
        int arr2[] ={-12, 18, -5, 23, -2 };
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        Integer minPositive= arr2[arr2.length-1];
        Integer maxNegative= arr2[0];

        for (Integer w:arr2){
            if (w>=0){
                minPositive = Math.min(minPositive,w);
            }

            if (w<0){
                maxNegative= Math.max(maxNegative,w);
            }
        }
        System.out.println("Minimum positive:"+ minPositive);
        System.out.println("Maximum negative:" + maxNegative);

         //2.way:
        int arr3[]= {-12, 18, -5, 23, -2 };
        Arrays.sort(arr3);

        for (Integer i=0;  i<arr3.length; i++){
            if (arr3[i]<0 && arr3[i+1]>0) {
                System.out.println("Maximum negative: " + arr3[i]);
                System.out.println("Minimum positive: " + arr3[i+1]);
            }
        }



    }
}

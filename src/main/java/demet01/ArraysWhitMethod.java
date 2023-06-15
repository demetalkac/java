package demet01;

import java.util.Arrays;

public class ArraysWhitMethod {
    public static void main(String[] args){

        //question 1: Write a method that acceept 2 arras and prints a new array containing all their elements.
        // ex: int[] x = {1,2}   int [] y ={3,4}  ==>[1,2,3,4]

        int[] x = {1,2};
        int [] y ={3,4};

        System.out.println(Arrays.toString(merchArray(x,y)));

    }
    public static int[] merchArray(int[] x, int[] y){
        int [] z=new int[x.length + y.length];


        for (int i=0; i<z.length; i++){

            for (int j = 0; j < x.length; j++) {
                z[i] =x[j];
                i++;
            }
            for (int j = 0; j <y.length ; j++) {
                z[i] =y[j];
                i++;
            }
        }
        return z;



    }


}

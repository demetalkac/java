package friend_class;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        //Ask user to enter 2 numbers  then swap them
        // a = 12; and b= 13; ==> a=13; and b=12;

     //   int a = 12, b=23;

        //1.Way: We used third variable
       //First we create an empty container, it doesn't put anything in it.
        // The value of this container should be 0. Because I need an empty box to be able to swap.
    //    int temp = 0;
        //Then I put int b=23 in the empty container.==> int temp=23; , int b=0;
    //    temp = b;
        //We put int a=12 in the empty b. ==>int b=12;
     //   b= a;
        //Since a is empty, I put the value I put in int temp into a.==>int a =23;
    //    a = temp;
    //    System.out.println(a);//23
    //    System.out.println(b);//12

        //2.Way: Without using third variable
        /*
        1) y= y-x             2) x= y + x                3) y = x - y
              25-14=11             11 +  14 =25                25-11 =14
              y=11                 x=25                        y = 14


            1) I subtract y from x, the value of y is 11.
            2) I add x with the new value of y, the value of x becomes 25.
            3) Then I subtract y from the new value of x to find the true value of y. y=14
         */
        int x=14, y=25;
        y = y - x;
        x = y + x;
        y = x - y;

        System.out.println(x);//25
        System.out.println(y);//14


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers for a ");
        int numberFora = scan.nextInt();

        System.out.println("Enter the numbers for b ");
        int numberForb = scan.nextInt();
          //1.way
     //   int temp =numberForb ;
     //   numberForb =numberFora;
     //   numberFora =temp;

        //2.way
        numberForb = numberForb- numberFora;
        numberFora = numberForb + numberFora;
        numberForb = numberFora - numberForb;

        System.out.println("Swap a =" + numberFora + ", " + "b =" + numberForb);




    }
}

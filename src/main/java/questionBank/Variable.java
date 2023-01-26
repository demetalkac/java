package questionBank;

public class Variable {
    public static void main(String[] args) {

        // 1Create double variables for the prices of any 3 items. Print the sum of the prices on the
        //console with a label.
        double shirtPrice= 12.99;
        double hatPrice= 23.99;
        double shoesPrice=15.99;
        System.out.println("Total price:" +(shirtPrice + hatPrice + shoesPrice)); //Total price:52.97

        //2.  Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label.
        float x= 15.99F;
        long y= 13L;
        int z= 12;
        System.out.println("Multiplication:"+ x*y*z);  //Multiplication:2494.44

        //3
        // Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

        int principal= 10000, rate =6, numberOfYear=3;
        int simpleInterest= principal * rate * numberOfYear/100;
        System.out.println("The simple interest is:"+ simpleInterest);//The simple interest is:1800

        //4
        //Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console.

        String s="The result is";
        Long a= 123L;
        Long b= 9133456782L;
        System.out.println(s+(a+b)); //The result is9133456905
        System.out.println(s+(a*b)); //The result is1123415184186


        //5
        //Create two boolean variables whose values are different and print their values in the same
        //line with a space between two consecutive values.

        boolean c = true;
        boolean d =false;
        System.out.println(c+" "+d); //true false


        //6
        //Create 3 float variables for the price of a book, notebook, and laptop.
        //Print the total price of 2 books, 4 notebooks and 3 laptops on the console

        float book=12.99F, noteBook=23.45F, laptop=34.12F;
        float totalPrice= 2*book + 4*noteBook + 3* laptop;
        System.out.println("The total price is:" + totalPrice);  //The total price is:222.14




    }
}

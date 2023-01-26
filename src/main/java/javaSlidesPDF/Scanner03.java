package javaSlidesPDF;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
    /*
    3.
    Type a program which calculates the area and the perimeter of a rectangle
    whose length and with are entered by user.
    Area of a rectangle is width*length
    perimeter of a rectangle is 2*(width+length)
     */

      //  Scanner input = new Scanner(System.in);
       // System.out.println("Enter the width and length");
      //  double w= input.nextDouble();
       // double l= input.nextDouble();

       // System.out.println(" Area of a rectangle is:"+ w*l);
      //  System.out.println("Perimeter of a rectangle is:"+ 2*(w+l));


       /*
       4) Type a program which calculates the volume of a rectangular prism
          whose length, width, and height are entered by user.
          Hint 1: Volume of a rectangular prism is width x length x height
        */

         // Scanner scan = new Scanner(System.in);
       // System.out.println("Enter the length, with and height");
       // double a= scan.nextDouble();
       // double b= scan.nextDouble();
       // double c= scan.nextDouble();
        //System.out.println("Volume of a rectangular prism is:"+ a*b*c);


        /*
          5)Type a program which calculates the area and the perimeter of a circle
            whose radius is entered by user. (Use float)
            Hint 1: Take pi number as 3.14159
            Hint 2: Area of a circle is 3.14159 x radius x radius
            Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
            Hint 4: To get float, use nextFloat()
         */
       // Scanner scn= new Scanner(System.in);
       // System.out.println("Enter the radius");
       // float d= scn.nextFloat();
        // System.out.println("Perimeter of a circle is:"+ 2*3.14159*d);
       // System.out.println("Area of a circle is:"+ 3.14159*d*d);


        /*
           6) Type a program which calculates the perimeter of a triangle whose
              Side lengths are entered by user. (Use byte)
              Hint 1: Perimeter of a triangle is a + b + c
              Hint 4: To get byte, use nextByte()
         */
      //   Scanner sn= new Scanner(System.in);
      //  System.out.println("Enter the lengths");
      //  byte e= sn.nextByte();
      //  byte f= sn.nextByte();
      //  byte g= sn.nextByte();
      //  System.out.println("Perimeter of a triangle is:"+ e*f*g);

        /*
          7) Type a program which converts the mile to kilometer. Mile value will be
             entered by user. (Use double)
             Hint 1: km = mile x 1.6
             Hint 2: To get double, use nextDouble()
         */

      //    Scanner sr= new Scanner(System.in);
      //  System.out.println("Enter mile value");
      //  double h= sr.nextDouble();
      //  System.out.println("km="+ h*1.6);

        /*
          8) Type a program which converts the hours to seconds. Hours value will be
             entered by user. (Use long)
             Hint 1: second = hour x 60 x 60
             Hint 2: To get long, use nextLong()
         */
     //   Scanner sca= new Scanner(System.in);
     //   System.out.println("Enter hours value");
     //   long e= sca.nextLong();
     //   System.out.println("Seconds value is:"+ e*60*60);

        /*
          9)Type a program which asks user to enter his/her first name and last name,
            then print it on the console.
            Hint: To get String, use nextLine()
         */
      //  Scanner inp= new Scanner(System.in);
      //  System.out.println("Enter his/her first name and last name,please");
      //  String g= inp.nextLine();
      //  System.out.println("His/her name and last name is:"+g);


        /*
          10) Type a program which asks user to enter his/her full name, and address
              then print them on the console like the full name should be in the first line,
              and the address will be in the second line.
              Hint: To get String, use nextLine()
         */
        Scanner in= new Scanner(System.in);
        System.out.println("Enter your full name and address");
        String fulName= in.nextLine();
        String address= in.nextLine();
        System.out.println(fulName);
        System.out.println(address);






    }
}

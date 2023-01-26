package questionBank;


public class IfStatement01 {
    public static void main(String[] args) {
     /*
         1) Type code to print
            a) "Winter" for December,January , February
            b) "Spring" for March, April, May
            c) "Summer" for June, July, August
            d) "Fall" for September, October, November
            e) "Invalid month name" for all the others
      */

       String mName= "December";
       mName= mName.toLowerCase();

       if (mName.equals("december") || mName.equals("January") || mName.equals("February")){
           System.out.println("Winter");
       } else if (mName.equals("March") || mName.equals("April") || mName.equals("May")) {
           System.out.println("Spring");
       } else if (mName.equals("June") || mName.equals("July") || mName.equals("August")) {
           System.out.println("Summer");
       } else if (mName.equals("September") || mName.equals("October") || mName.equals("November")) {
           System.out.println("Fall");
       }else {
           System.out.println("Invalid month name");
       }

       /*
           2) Type code to print
            a) "Valid Password" if the password has at least 8 characters different from space
               character
            b) "Do not use space character in password" if the password has any space
               character in any position
            c) "Invalid Password" if a and b conditions are not satisfied
            Note: Be careful about the orders of conditions in the solution
        */

        String password= "a1b2c3d4";

        if (password.replaceAll("\\S","").length()>0){

            System.out.println("Do not use space character in password");
        } else if (password.replaceAll("\\S","").length()>=8) {

            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }


        //3) Type code to print
        //    a) "Round up by last digit:" and print the rounded value if the last digit is greater than
        //    or equal to 5
        //    b) "Round down by last digit" and print the rounded value if the last digit is less than 5

        int i= 224;

        if (i%10>=5){
            System.out.println("Round up by last digit:"+ (i/10+1)*10);
        }else {
            System.out.println("Round down by last digit:" + (i/10)*10);
        }




    }
}

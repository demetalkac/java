package day03_scanner;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        /*
        Example 1: Type code to print "Weekday" for the weekday names, "weekend day" for the weekend days
        Monday - Friday ==> Weekday       Saturday, sunday ==> Weekend day

         */
        //1.Step:
        Scanner input = new Scanner(System.in);

        //2.Step:
        System.out.println("Enter the day name");

        //3.Step: create appropriate container/variable to put the data (==) to check equality of the numbers==>primitive data types
        //Note: To compare Strings use "equals()" , do not use "=="
        String dayName= input.next();
        //1.way: That code works, but it has many repetitions and Java does many tasks
        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }


        //2.way: I will use if else statement.  ==> with or "||" this sign means "OR" operator in Java.
        // equalsIgnoreCase()==>java does not care about the upper or lower case

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday")
                || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday")
                || dayName.equalsIgnoreCase("Friday");

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday");

          if(isWeekDay){
              System.out.println("Weekday");

          }else if(isWeekendDay) {
              System.out.println("Weekend day");
          }else{

              System.out.println("Invalid day name");

        }

        /*
        Note: " OR" operator in java ==> ||
              "||" can be used just with booleans

        To get false from  "||" operator everything should be false.
        just a single "true" makes the result true.==>|| is optimistic
        To get "false" from || every condition should be false
        true || true ==> true
        true || false ==> true
        false || true ==> true
        false || false ==> false
         */


        /*
           Beauty of if-else-if-statement
           After finding true Java does not check the other conditions
         */




        }

    }
package demet01;

import java.util.Scanner;

public class SwitchQuestion {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter month name");
        String monthName="June";


        switch (monthName){
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case"september":
            case "november":
            case"october":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month name");
                break;



        }

    }
}

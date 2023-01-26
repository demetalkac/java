package questionBank;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {

          //      1) Type the code that finds out how many days Ali lived.
         //       Date of birth of Ali is 12th of May 2002

        LocalDate dobAli = LocalDate.now();
        System.out.println(dobAli); //2022-10-01

        LocalDate dobAliNext = LocalDate.of(2002, Month.MAY,12);
         long numOfDays = ChronoUnit.DAYS.between(dobAliNext,dobAli);
        System.out.println(numOfDays); //7447


        //2) Type the code that finds out how many months Ali lived.
        //   Date of birth of Ali is 4th of June 1997

        LocalDate  currentDate= LocalDate.now();
        System.out.println(currentDate); //2022-10-01
        LocalDate birhtDtAli = LocalDate.of(1997,Month.JUNE,4);
        long numberOfAliMonths = ChronoUnit.MONTHS.between(birhtDtAli,currentDate);
        System.out.println("The number of months Ali lived so far is " +numberOfAliMonths); //303


        //3) Date of birth of Ali is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
        //   and 12 days after Ali's birthdate.

        LocalDate bdoAli = LocalDate.of(1997,06,04).plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(bdoAli); //1999-09-16

       // LocalDate birthDateOfAli = LocalDate.of(1997, 06, 04);
       // LocalDate exactDate = birthDateOfAli.plusYears(2).plusMonths(3).plusDays(12);
        // System.out.println("Exact date is " + exactDate); //Exact date is 1999-09-16


        //4) Ali was born 45 years, 8 months and 5 days after 29 October 1923.
        //   Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //   Type code to calculate the exact date of birth of Ali and Veli
        //   Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate brOfAl = LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate brOfVl = LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(2);
        System.out.println("Date of births are same :" + brOfAl.equals(brOfVl)); //Date of births are same :false


        /*
            5) Veli was born 3 years and 11 days after Ali.
               Ali gave you his date of birth as 24th of November 2012
              Type code to calculate Veli’s date of birth.
         */


        LocalDate ali= LocalDate.parse("2012-11-24");
        System.out.println(ali); //2012-11-24
        LocalDate veli = ali.plusYears(3).plusDays(11);
        System.out.println("The date of birth of Veli is " +veli); //The date of birth of Veli is 2015-12-05


        //6) Create a Date Value for your birthdate and create Date Value for your kid's birthdate then
        //   calculate the difference in days.

        LocalDate myDob = LocalDate.of(1982,Month.MAY,5);
        LocalDate myKidsDob = LocalDate.of(2010,Month.SEPTEMBER,6);
        long difrence= ChronoUnit.DAYS.between(myDob,myKidsDob);
        System.out.println(difrence);//10351


        //7) Get the last 2 digits of the year in current date
        LocalDate current = LocalDate.of(2012,11,24);
        int lastTwoDigits = current.getYear()%100;
        System.out.println("Last two digit of the year:"+lastTwoDigits);


       LocalDate y = LocalDate.of(1998,5,12);
       LocalDate g = LocalDate.of(2007,6,13);
       long dif = ChronoUnit.DAYS.between(y,g);
        System.out.println(dif);














    }
}

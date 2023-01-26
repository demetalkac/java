package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        // How to get "current date" by typing Java code
        LocalDate currentDateb= LocalDate.now();
        System.out.println(currentDateb); //2022-09-28

        // How to get "current time"  by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime); //11:17:39.035613700

        // How to get "current date and time"  by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); //2022-09-28T11:27:38.808784500

        // How to get "current date" in another country by typing Java code
        LocalDate cuurentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(cuurentDateInJapan); //2022-09-28

        // How to get "current time" in Japan by typing Java code
        LocalTime cuurentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(cuurentTimeInJapan); //18:57:06.527359100


        // How to get "current date and time" in Japan by typing Java code
        LocalDateTime cuurentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(cuurentDateTimeInJapan); //2022-09-28T18:50:11.019368700

        // How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-28

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(cd1Next); //2025-06-28

        // How to go past in date

        LocalDate cd1Past =  cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        //Homework: Type code to learn how to go future and past in time

        // How to get a specific part of the time
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);

         int minute =ct1.getMinute();
        System.out.println(minute); //4

        // How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Uppercase M is for months,
                                                                           //lowercase m is for munites
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate); //28/09/2022


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");// MMM gives you the "first 3 characters" of the month name
                                                                        // yy gives you the "last 2 gigits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);// 27/Sep/2022


        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");// MMMM gives you full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);//28/September/2022


        // How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("HH:mm a"); //hh uses 12 hours system, HH uses 24 hours system
        LocalTime lt = LocalTime.now();                                 // "a" is for to display "AM" or"PM"
       String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime); // 14:05


        /*
            Enum is something like class normally in a class you have variables and methods. In Enums you may have variables and methods
            as well. but when we create enum we use it to store constant variables. Unchangeable variables. like months...
            Whenever you need Unchangeable variables use enum.
            For example, you are creating for Honda - Honda has some models like Civic HRV ...
            their names will not change anytime honda civic exists for many years.
            If you are sure they will remain same for long time.you are creating application for Honda you will use civic model many times in your application.
            You put them in enum when you need models you go to enum select it from there and use. you don't need to memorise model names.
            Go to enum and get the one you need. When you  create a value in enum you can add values?
            For example, you are working with states in the USA create a enum and put states in it. then you create method to get variables from that enum.
         */


        /*
       Example for Enum: (BU ,ORNEGİ BİR ARKADAS KOYMUSTU)
        enum (enumerators)
    public enum Seasons {
        WINTER, SUMMER, FALL, SPRING
    }
    public static void main(String[] args) {

        String browser = Seasons.WINTER.toString();
        Seasons brwsr = Seasons.WINTER;

        System.out.println(browser);

        switch(browser){
            case "WINTER":
                System.out.println("Snowboarding");
                break;
            case "SUMMER":
            case "SPRING":
                System.out.println("Fishing");
                break;
            case "FALL":
                System.out.println("Trekking");
                break;
            default:
                System.out.println("Undefined season");
        }
    */


        // How to specific dates
        LocalDate dob1 = LocalDate.of(2012,3,13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);


        // How to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //Otherwise(equality and first is after) you will get false
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore); //true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is); //false

       boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter); //true

























    }
}

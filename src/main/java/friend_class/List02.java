package friend_class;


import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

public class List02 {
    public static void main(String[] args) {
       // Find the multiplication of all odd list elements in an integer list

        List<Integer> arr = Arrays.asList(12, 32,57, 87,64);
        int num=1;
        for (Integer w: arr){
            if (w%2!=0){
                num = num*w;

            }else {

            }continue;
        }
        System.out.println(num);

        //Type the code that finds out how many days Ali lived. Date of birth of Ali is 12th of May 2002

        LocalDate dbAli= LocalDate.of(2002, Month.MAY,12);

        LocalDate currentDate= LocalDate.now();

        long numOfDays= ChronoUnit.DAYS.between(dbAli,currentDate);

        System.out.println(numOfDays);












    }



}

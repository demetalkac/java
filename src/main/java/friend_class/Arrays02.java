package friend_class;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        // 1. "Jim", "Tom", "Mary","Susan", "Mark" Put these names in an Array and  print them on the console.
        String names[] = {"Jim", "Tom", "Mary", "Susan", "Mark"};

        System.out.println(Arrays.toString(names));


        //2. Honda, Toyota, Suzuki, Ford, Mercedes, Bmw put these in an Array and print them on the console.


        String car[] = {"Honda", "Toyota", "Suzuki", "Ford", "Mercedes", "Bmw"};
        System.out.println(Arrays.toString(car));

        // 4. 58, 49, 34, 24, 28 , 14 put them in an Array and print only the first element on the console.

        int number[] = {58, 49, 34, 24, 28, 14};
        System.out.println((number[0]));

        //  5. Adam, Mary Kate, Berk, Hasan, Ali, Jon put them in Array and print the last element on the console.

        String name1[] = {"Adam", "Mary", "Kate", "Berk", "Hasan", "Ali", "Jon"};
        System.out.println(name1[name1.length - 1]);

        // 6. (12,14,24,33,38, 11, 15, 18 99) put them in an Array and  print the sum of the first and the last
        // elements on the console.

        int num[] = {12, 14, 24, 33, 38, 11, 15, 18, 99};
        System.out.println(num[0] + num[num.length - 1]);

        //6."2.1", "3.4", "5.8", "9.99", "19.99" put them in an Array and find the sum of all elements.
        double sum[] = {2.1, 3.4, 5.8, 9.99, 19.99};
        int sums = 0;
        for (int w : num) {
            sums = sums + w;
        }
        System.out.println(sums);


        //7.Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen print the elements in alphabetical order on the
        // console in different lines.

        String cars[] = {"Volvo", "Audi", "Volkswagen", "Renault", "Peugeot", "Citroen"};

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        //8: 289, 512, 11, 22, 0, 899, 99,345, 1, put them in an Array and print the elements as ascending order.

        int numbers[] = {289, 512, 11, 22, 0, 899, 99, 345, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        //9: Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen put them in an  array and print
        // the elements before Renault.

        String carOfName[] = {"Volvo", "Audi", "Volkswagen", "Renault", "Peugeot", "Citroen"};

        for (String w : carOfName) {
            if (w.equals(carOfName)) {
                break;
            }
            System.out.println(w);
        }


         /*
                     Basic Level Questions

          1. "Jim", "Tom", "Mary","Susan", "Mark" Put these names in an Array and  print them on the console.
          2. Honda, Toyota, Suzuki, Ford, Mercedes, Bmw put these in an Array and print them on the console.
          3. 2010, 2011, 2012, 2013, 2014, 2015, 2019, 2020, 2021, 2022 put them in an Array and print them on the console.
          4. 58, 49, 34, 24, 28 , 14 put them in an Array and print only the first element on the console.
          5. Adam, Mary Kate, Berk, Hasan, Ali, Jon put them in Array and print the last element on the console.
          6. (12,14,24,33,38, 11, 15, 18 99) put them in an Array and  print the sum of the first and the last elements on the console.
          7. Z, B, C, M, D, S, T, A put them in an Array and print the sum of the first and second character.
          8. "2.1", "3.4", "5.8", "9.99", "19.99" put them in an Array and find the sum of all elements
          9. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen print the elements in alphabetical order on the console in different lines.
          10. 289, 512, 11, 22, 0, 899, 99,345, 1, put them in an Array and print the elements as ascending order.
          11. Volvo, Audi, Volkswagen, Renault, Peugeot, Citroen put them in an  array and print the elements before Renault.
          12. "Alan", "Thompson", "Mark", "Jackson", "Tommy", "Martin" put them in an array and print the elements different from Tommy
             */




    }
}

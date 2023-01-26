package questionBank;

public class StringManipulations01 {
    public static void main(String[] args) {

        /*
            1) Create a String variable for city names which have just a single word.
               Print the city name with the initial is in uppercase and all the other characters
                are in lower cases on the console.
               Example: mIAMI should be printed as
               miami  should be printed as Miami
               MIAMI should be  as Miami
               mIaMi should be printed as Miami etc.
         */

         String cityName = "mIAMI";
         String updateCityName = cityName.trim().toLowerCase();
        updateCityName=updateCityName.substring(0,1).toUpperCase() + updateCityName.substring(1);
        System.out.println(updateCityName);


      //  2) Create 3 String variables for people's names. Print the sum of the number of characters in
      //  all the 3 names except space characters.
      //  Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String name1 = "Aisa Gul";
        String name2 = "Fatma Merve";
        String name3 = "Ali Veli";
       Integer c1= name1.replaceAll("\\s","").length();
        Integer c2= name2.replaceAll("\\s","").length();
        Integer c3= name3.replaceAll("\\s","").length();
        System.out.println("Total number of charecters diffrent from space:" + (c1+c2+c3));
                 //Total number of charecters diffrent from space:24


        // 3) Create a String variable, print the total number of alphabetical and numeric characters in
        //    the String on the console.
        //    Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console.

        String s = "Miami 33018!!!";
        int numOfCharacters= s.replaceAll("\\s","").replaceAll("a-zA-Z0-9","").length();
        System.out.println("Total number of alphabetical and numeric characters chars:"+ numOfCharacters);
                  //Total number of alphabetical and numeric characters chars:13


        //4) Create a String variable, print the number of non-digit characters in the String on the console.
        //Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.

        String st = "2a3B4?-!5";
        Integer numOfNonDigitChars =st.replaceAll("[0-9]", "").length();
        System.out.println("Total number of non-digit characters:"+ numOfNonDigitChars);
                          //Total number of non-digit characters:5



        //5) Create a String variable and print just the last non-space character on the console for any
        //String.
        //Example: For ‘Ali Can’ you should print n
        //For ‘Miami ’ you should print i etc.

        String str="Miami";
        int idxOfLastNonSpace =str.trim().length()-1;
        System.out.println(idxOfLastNonSpace); //4
        String lastNonSpaceChar =str.substring(idxOfLastNonSpace, idxOfLastNonSpace+1);
        System.out.println("The non-space last character:" + lastNonSpaceChar);
                                      // The non-space last character:i

        /*
         6) Create a String variable and find the sum of the ASCII values of the first and the last
            characters of the String.
            String s = "Miami";
         */

        String strn = "Miami";
       int indexOfLastChar= strn.length()-1;
       int firstChar=strn.charAt(0);
       int lastChar=strn.charAt(indexOfLastChar);
        System.out.println("Total ASCII values of first and last character:" + (firstChar+lastChar));


        //7) Create a String variable and print all characters except the first character on the console.
        //Example:If the String is ‘Java’ you should print ‘ava’ on the console.









    }
}

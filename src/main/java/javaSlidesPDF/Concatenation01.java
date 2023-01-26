package javaSlidesPDF;

public class Concatenation01 {
    public static void main(String[] args) {

        //page number:55,56
        String str1="Learn" + "Java";
        System.out.println(str1); //LearnJava

        System.out.println();

        String str2="Learn" + " " +"java";
        System.out.println(str2); //Learn java

        System.out.println();

        String str4="2"+"5";
        System.out.println(str4); //25

        String str5=2+3+"4";
        System.out.println(str5); //54

        String str6="2"+(5+1);
        System.out.println(str6); //26


        /*
          19) int numA = 2;
              int numB = 3;
              String str1 = “Study”
              String str2 = “Hard”
              Type a program to see the following outputs on the console
              by using “concatenation” operation.
             A) Study Hard B) 5 Study C) Hard23 D) Hard1
            Note: Be careful about the spaces between the variables
        */
           String a="Study"+ " "+ "Hard";
           System.out.println(a);

           String b="5"+" "+"Study";
           System.out.println(b);

        int numA = 2;
        int numB = 3;
        String st1 ="Study";
        String st2 ="Hard";
        System.out.println(st1 +" "+ st2);  //Study Hard
        System.out.println((numA+numB)+" "+st1); //5 Study
        System.out.println(st2+numA+numB);  //Hard23
        System.out.println(st2+(numB-numA));  //Hard1
        System.out.println(st2);

        /*
         20)int numA = 2;
           int numB = 3;
           String str1 = “Study”
           String str2 = “Hard”
       Type a program to see “61Study-1” as output on the console
       by using “concatenation” operation.
       Note: Use just variable names, do not use any number
         */
        int numC = 2;
        int numD = 3;
        String str7 ="Study";
        String str8 ="Hard";
        System.out.println((numD*numC)+""+(numD-numC)+""+str7+"-"+(numD-numC));  //61Study-1




    }
}

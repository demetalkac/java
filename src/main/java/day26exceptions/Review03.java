package day26exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Review03 {

    public static void main(String[] args) throws IOException {
     readTheText();

        System.out.println();
        System.out.println();

     readTheTextFromTheFile();

    }

    //Create a method to read a text from a text file.
    //If the path is wrong, if the file does not exist, if the text cannot be read stop execution
    public static void readTheText() throws IOException {
        FileInputStream fis =new FileInputStream("src/main/java/day26exceptions/File01.txt");

        int k=0;

        while ((k = fis.read()) != -1){
            System.out.print((char)k);

        }
    }

    //Create a method to read a text from a text file.
    //If the path is wrong, give a message to the user and do not stop execution
    //if the file does not exist, give a message to the user and do not stop execution
    //if the text cannot be read, give a message to the user and do not stop execution
    public static void readTheTextFromTheFile(){

        try {
            FileInputStream fis =new FileInputStream("src/main/java/day26exceptions/File01.txt");
            int k=0;
            while ((k = fis.read()) != -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an issue in path or in the file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("There is an issue in reading the text - " + e.getMessage());
        }
        System.out.println("Execution did not stop");
    }


}

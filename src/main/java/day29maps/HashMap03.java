package day29maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    public static void main(String[] args) {

        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like to move it, move it do you like it?"  => I=1, like=2, to=1, move=2, it=3, do=1, you=1
        String sentence = "I like you like like";

        //Remove punctuation marks
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        //Get the words from the sentence by using split() with space
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, you, like, like]

        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        //I, like, you, like, like
        for(String w : words){
            Integer numOfOccurrence = occurrenceMap.get(w);
            if(numOfOccurrence==null){
                occurrenceMap.put(w, 1);
            }else{
                occurrenceMap.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(occurrenceMap);

        //Example 2: Type code to print the number of occurrences of letters in a sentence

        String sentence2 = "I like to move it, move it do you like it";

        sentence2 =  sentence2.replaceAll("\\p{Punct}", "").replaceAll("\\s", "");
        System.out.println(sentence2);

        String [] letters = sentence2.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String, Integer> occurrenceLetters = new HashMap<>();

        for(String w : letters){

            Integer numOfOccurrenceOfLetters  = occurrenceLetters.get(w);

            if(numOfOccurrenceOfLetters== null){
                occurrenceLetters.put(w, 1);
            }else{
                occurrenceLetters.put(w, numOfOccurrenceOfLetters + 1);
            }
        }
        System.out.println(occurrenceLetters);//{t=4, d=1, e=4, u=1, v=2, I=1, i=5, y=1, k=2, l=2, m=2, o=5}

    }

}
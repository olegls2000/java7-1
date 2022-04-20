package bte;

import bte.model.simple.SimpleCircleInterface;
import bte.model.simple.SimpleRectangleInterface;
import bte.model.simple.WithArea;

import java.util.Scanner;

import static bte.util.StringUtils.*;

public class Lesson9 {
    public static void main(String[] args) {
        int y = WithArea.COUNT;
        String str = "AAA";
        SimpleCircleInterface circ1 = new SimpleCircleInterface(6);
        SimpleCircleInterface circ2 = new SimpleCircleInterface(6);
        boolean t = circ1.equals(circ2);
        SimpleRectangleInterface rec1 = new SimpleRectangleInterface(10, 2);
        SimpleRectangleInterface rec2 = new SimpleRectangleInterface(10, 2);
        System.out.println(rec1.equals(rec2));

        StringBuilder sb = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            sb.append("a, \n");
        }
        String str1 = sb.toString();
        long finish = System.currentTimeMillis();
        long duration = finish - start;
        System.out.println(str1);
        StringBuffer sbuf = new StringBuffer();
        String sentence = " Hello from Java!";
        for (String word : sentence.split(" ")) {
            System.out.println(word);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your sentence to parse...");
        String sentence2 = scanner.nextLine();
        printWordsStartFrom("a", sentence2);
        System.out.println(printShortestWord(sentence2));

        //     String[] words= findShortestAndLongestWords(sentence2);
        //     System.out.println("The shortest word is " +words[0]+", the longest word is " +words[1]);
        findShortestAndLongestWords(sentence2);
        printWordsStartAndEndWithTheSameLetter(sentence2);


        System.out.println(replaceSemicolonAndCount(sentence2));
        System.out.println(replaceColonBySemicolonAndCount(sentence2));
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Input your sentence to parse...");
        String sentence3 = scanner.nextLine();
        countWordsCaseInsensitive(sentence3);

    }

    public static void printWordsStartFrom(final String startLetter, final String sentence) {
        int count = 0;
        for (String word : sentence.split(" ")) {
            if (word.toLowerCase().startsWith(startLetter.toLowerCase())) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static String printShortestWord(final String sentence) {
if (sentence==null)
     return null;

        String st = sentence.replace("!", "")
                .replace(",", "")
                .replace(";", "")
                .replace(".", "")
                .replace("-", "")
                .replace(":", "")
                .trim();
        if ("".compareTo(st)==0)
            return st;

        int min = 0;
        String minWord = "";

        String[] words = st.split(" ");
        int indx=0;

        for (int i = 0; i < words.length; i++) {
            if ("".compareTo(words[i])!=0) {
               if (indx == 0) {
                   min = words[i].length();
                   minWord = words[i];
               } else {

                   if (words[i].length() < min) {
                       min = words[i].length();
                       minWord = words[i];
                   }
               }
               indx++;
           }
        }
        return minWord;
    }
}

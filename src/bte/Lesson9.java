package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

import java.util.Scanner;

import static bte.util.StringUtils.printWordCount;

public class Lesson9 {
    public static void main(String[] args) {
        WithArea shape = new SimpleCircle(5);
        shape.getArea();
        shape.newMethod();
        int y = shape.COUNT;
        int y1 = WithArea.COUNT;
        //WithArea.COUNT = 6;
        String str = "My String"; //POOL
        String str1 = "My String"; //POOL
        String str2 = new String("My String");
        String str3 = new String("My String");

        System.out.println(str == str1); //true
        System.out.println(str1 == str2); //false
        System.out.println(str3 == str2); //false
        System.out.println(str.equals(str1)); //true
        System.out.println(str1.equals(str2)); //true

        SimpleTriangle simpleTriangle = new SimpleTriangle(4, 4, 4);
        SimpleCircle circle1 = new SimpleCircle(6);
        SimpleCircle circle2 = new SimpleCircle(6);
        System.out.println(circle1 == circle2); //false
        System.out.println(circle1.equals(circle1)); //true
        System.out.println(circle1.equals(circle2)); //true
        System.out.println(circle1.equals(simpleTriangle)); //false

        String a = " aa    ";
        //String ab = a.concat("bb");
        a += "bb";
        a = a + "bb";
        String aTrimmed = a.trim();
        System.out.println(a);//aabb
        System.out.println(aTrimmed);//aa

        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2; i++) {
            //a += "a, ttt \n";
            System.out.println(i);
            stringBuilder.append("a, ttt \n");
        }
        String finalString = stringBuilder.toString();
        System.out.println(finalString);
        //System.out.println(a);
        long finish = System.currentTimeMillis();
        long duration = finish - start;
        System.out.println("Processing took: " + duration);
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("y");
        //Input a sentence from console. Calculate amount of words in the sentence;

        String sentence = "Hello from Java course! Aha, aha.";
        String[] words = sentence.split(" ");
        System.out.println("words count: " + words.length);
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Input your sentence to parse ...");
        //String sentenceFromConsole = scanner.nextLine();
        //- Print out words which start from "a"  .startWith(...)
        printWordsStartFrom("a", sentence);
        printShortestWord(sentence);
    }

    public static void printShortestWord(final String sentence) {
        String[] rawWords = sentence.split(" ");
        String[] words = new String[rawWords.length];
        for (int i = 0; i < rawWords.length; i++) {
            String word = rawWords[i]
                    .replace(",", " ")
                    .replace("!", " ")
                    .replace(".", " ")
                    .replace(":", " ")
                    .trim();
            words[i] = word;
        }

        String minSizeWord = words[0];
        for (String word : words) {
            if (word.length() < minSizeWord.length()) {
                minSizeWord = word;
            }
        }
        System.out.println("Shortest word: " + minSizeWord);

        printWordCount("Hello hello my friend!");
    }

    public static void printWordsStartFrom(final String startLetter,
                                           final String sentence) {
        for (String word : sentence.split(" ")) {
            if (word.toLowerCase().startsWith(startLetter.toLowerCase())) {
                System.out.println(word);
            }
        }
    }
}

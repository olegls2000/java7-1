package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

import java.util.Scanner;

import static bte.util.Print.print;

public class Lesson9 {
    public static void main(String[] args) {
        WithArea shape = new SimpleCircle(5);
        shape.getArea();
        shape.newMethod();
        int y = shape.COUNT;
        int y1 = WithArea.COUNT;
        //WithArea.COUNT = 6;
        String str = "My String";
        String str1 = "My String";
        String str2 = new String("My String");
        print(str == str1);// true
        print(str1 == str2);// false
        print(str.equals(str1));//true
        print(str.equals(str2));//true

        SimpleTriangle simpleTriangle = new SimpleTriangle(4,4,1);
        SimpleCircle circle1 = new SimpleCircle(6);
        SimpleCircle circle2 = new SimpleCircle(6);
        print(circle1 == circle2);//false
        print(circle1.equals(circle2));//false
        print(circle1.equals(simpleTriangle));//false

        SimpleRectangle rectangle1 = new SimpleRectangle(5,10);
        SimpleRectangle rectangle2 = new SimpleRectangle(5,15);
        print(rectangle1 == rectangle2);
        print(rectangle1.equals(rectangle2));
        print(rectangle1.equals(simpleTriangle));
        print(rectangle1.equals(circle1));


        String a = "aa";
        String ab = a.concat("bb");
        a += "bb";
        String aTrimmed = a.trim();
        print(a);
        print(aTrimmed);



        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for(int i = 0; i <100; i++){
            //a += "a, ttt\n";
            print(i);
            stringBuilder.append("a, ttt \n");
        }
        String finalString = stringBuilder.toString();
        print(finalString);
        //print(a);
        long finish = System.currentTimeMillis();
        long duration = finish - start;
        print("Process took: " + duration);

        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("y");


        String sentence = "Hello from Java Course!";
        sentence.split(" ");

        String[] words = sentence.split(" ");
        print("Words count: " + words.length);


        Scanner scan = new Scanner(System.in);
        print("Input your sentence to parse: ");
        String[] sentenceFromConsole = scan.nextLine().split(" ");
        for(int i =0;i<sentenceFromConsole.length; i++){
            if(sentenceFromConsole[i].contains("A") ||
                    sentenceFromConsole[i].contains("a")){
                print(sentenceFromConsole[i]);
            }

        }
        printShortestWord("fq fqlkwnf iubw qlwbf;k jkw;nf ui;blkjgw");

    }

    public static void printShortestWord(final String sentence){
        String[] rawWords = sentence.split(" ");
            for(int i =0; i < rawWords.length; i++){
                String word = rawWords[i];
            }
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

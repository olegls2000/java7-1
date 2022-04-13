import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

import java.util.Scanner;


public class Lesson9 {
    //private static String word;

    public static void main(String[] args) {
        WithArea shape = new SimpleCircle(5);
        shape.getArea();
        shape.newMethod();
        int y = shape.COUNT;
        int y1 = WithArea.COUNT;
        String str = "My string"; //POOL
        String str1 = "My string"; //POOL
        String str2 = new String("My string");
        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));
        System.out.println("___________");

        SimpleTriangle simpleTriangle = new SimpleTriangle(4, 4, 4);
        SimpleTriangle simpleTriangle1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle simpleTriangle2 = new SimpleTriangle(2, 4, 4);
        SimpleTriangle simpleTriangle3 = new SimpleTriangle(4, 4, 4);

        System.out.println(simpleTriangle == simpleTriangle1);
        System.out.println(simpleTriangle.equals(simpleTriangle1));
        System.out.println(simpleTriangle.equals(simpleTriangle2));
        System.out.println(simpleTriangle2.equals(simpleTriangle3));
        System.out.println("___________");

        SimpleCircle simpleCircle = new SimpleCircle(5);
        SimpleCircle simpleCircle1 = new SimpleCircle(5);
        SimpleCircle simpleCircle2 = new SimpleCircle(6);
        SimpleCircle simpleCircle3 = new SimpleCircle(5);

        System.out.println(simpleCircle == simpleCircle1);
        System.out.println(simpleCircle.equals(simpleCircle1));
        System.out.println(simpleCircle.equals(simpleCircle2));
        System.out.println(simpleCircle2.equals(simpleCircle3));
        System.out.println("___________");

        SimpleRectangle simpleRectangle = new SimpleRectangle(2, 4);
        SimpleRectangle simpleRectangle1 = new SimpleRectangle(2, 4);
        SimpleRectangle simpleRectangle2 = new SimpleRectangle(3, 4);
        SimpleRectangle simpleRectangle3 = new SimpleRectangle(2, 4);

        System.out.println(simpleRectangle == simpleRectangle1);
        System.out.println(simpleRectangle.equals(simpleRectangle1));
        System.out.println(simpleRectangle.equals(simpleRectangle2));
        System.out.println(simpleRectangle2.equals(simpleRectangle3));

        String a =" aa  ";
        a += "bb";
        String ab = a.concat("bb");
        String aTrimmed = a.trim();
        System.out.println(ab);
        System.out.println(aTrimmed);

        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 2; i++){
            //a += "a, ttt \n";
            stringBuilder.append("a, ttt \n");
            String finalString = stringBuilder.toString();
            System.out.println(finalString);
           //System.out.println(a);
            long finish = System.currentTimeMillis();
            long duration = finish - start;
            System.out.println("Procces time" + duration);
        }
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("y");

        String sentence = "Hello from Java course!";
        String[] words = sentence.split(" ");
        System.out.println("words count: " + words.length);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your ...");
        String sentenceFromConsole = scanner.nextLine();
        printWordsStartFrom("a", sentenceFromConsole);
        printShortestWord(sentenceFromConsole);
    }

    public static void printShortestWord(final String sentence){
        String[] rawWord = sentence.split(" ");
        String[] words = new String[rawWord.length];
        for (int i = 0; i < rawWord.length; i++){
          String word = rawWord[i]
                  .replace("!", " ")
                  .replace(".", " ")
                  .replace(",", " ")
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
    }


    public static void printWordsStartFrom(final String startLetter, final String sentence){
       for (String word : sentence.split(" ")){
            if (word.toLowerCase().startsWith(startLetter.toLowerCase())){
                System.out.println(word);
            }
        }
    }
}

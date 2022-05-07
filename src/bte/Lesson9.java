package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

public class Lesson9 {
    public static void main(String[] args) {
        WithArea shape = new SimpleCircle(5);
        shape.getArea();
        shape.newMethod();
        int y = shape.COUNT;
        int y1 = WithArea.COUNT;
        // WithArea.COUNT = 6;
        String str = "My String";
        String str1 = "My String";
        String str2 = new String("My String");
        System.out.println(str == str1);
        System.out.println(str1 == str2);
        System.out.println(str.equals(str1));
        System.out.println(str1.equals(str2));

        SimpleCircle circle1 = new SimpleCircle(6);
        SimpleCircle circle2 = new SimpleCircle(7);
        SimpleTriangle triangle1 = new SimpleTriangle(3, 3, 3);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 3, 3);
        SimpleRectangle rectangle1 = new SimpleRectangle(8, 6);
        SimpleRectangle rectangle2 = new SimpleRectangle(8, 6);
        System.out.println(rectangle2.equals(rectangle1));

        String a = " aa   ";
        String ab = a.concat("bb");
        a += "bb";
        String aTrimmed = a.trim();
        System.out.println(a + " " + ab);

        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1; i++) {
            stringBuilder.append("a, ttt \n");
            //  a += "bb ttt \n";
        }
        String finalString = stringBuilder.toString();
        System.out.println(finalString);
        System.out.println(a);
        long finish = System.currentTimeMillis();
        long duration = finish - start;
        System.out.println("Processing took: " + duration);
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("y");
        System.out.println(strBuffer);

        String sentence = "Hello from Java course! Aha, aha";
        //  String[] words = sentence.split(" ");
        //   System.out.println("words count: " + words.length);
        //Scanner scanner = new Scanner(System.in);
        //  System.out.println("Input tour sentence to parse ...");
        //    String sentenceFromConsole = scanner.nextLine();
        printWordsStartFrom("a", sentence);
        printShortestWord(sentence);

    }

    public static void printWordsStartFrom(final String startLetter, final String sentence) {
        for (String word : sentence.split(" ")) {
            if (word
                    .toLowerCase().startsWith(startLetter.toLowerCase())) {
                System.out.println(word);
            }
        }
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
    }
}

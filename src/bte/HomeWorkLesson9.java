package bte;

import static bte.utils.StringUtils.*;

public class HomeWorkLesson9 {
    public static void main(String[] args) {
        String sentence = "Assumec: that we have sentence," +
                " create a method that finds and prints the " +
                "longest and shortest: words. Place the method" +
                " into StringUtils class (need to be created).";
        printShortestWord(sentence);
        startAndEndWithSameLetter(sentence);
        replaces(sentence);
        repeatedWords(sentence);
    }
}

package bte.util;

import java.util.Objects;

public class StringUtils {

    public static String[] sentenceRefactor(final String sentence) {
        String[] rawWord = sentence.split(" ");
        String[] words = new String[rawWord.length];
        for (int i = 0; i < rawWord.length; i++) {
            String word = rawWord[i]
                    .replace("!", " ")
                    .replace("?", " ")
                    .replace(".", " ")
                    .replace(",", " ")
                    .replace(":", " ")
                    .replace(";", " ")
                    .replace("-", " ")
                    .replace("_", " ")
                    .replace("(", " ")
                    .replace(")", " ")
                    .trim();
            words[i] = word;
        }
        return words;
    }

    public static void printLongestWord(final String sentence){
        String[] words = sentenceRefactor(sentence);
        String maxSizeWord = words[0];
        for (String word : words) {
            if (word.length() < maxSizeWord.length()) {
                maxSizeWord = word;
            }
        }
        System.out.println("Longest word: " + maxSizeWord);
    }

    public static void printShortestWord(final String sentence) {
        String[] words = sentenceRefactor(sentence);
        String minSizeWord = words[0];
        for (String word : words) {
            if (word.length() > minSizeWord.length()) {
                minSizeWord = word;
            }
        }
        System.out.println("Shortest word: " + minSizeWord);
    }

    public static void startEndSameLetter(final String sentence) {
        String[] words = sentenceRefactor(sentence.trim());
        System.out.print("Words that start and end from the same letter is: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue;
            }
            if (words[i].charAt(0) == words[i].charAt(words[i].length() - 1)) {
                System.out.print(words[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void printReplace(final String sentence) {
        String[] words = sentence.trim().split("");
        String[] newString = new String[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i].replace(":", ";");
            newString[i] = word;
            if (!Objects.equals(words[i], newString[i])) {
                count++;
            }
        }
        System.out.println("Quantity of replacements: " + count);
    }

    public static void eachWord(final String sentence) {
        final var words = getWordsFromText(sentence);
        final var counter = new int[words.length];

        for (int i = 0; i < words.length; i++){
            String word = words[i];
            int wordCount = 0;
            for (int j = 0; j < words.length; j++){
                if (word.equalsIgnoreCase(words[j])){
                    wordCount++;
                }
            }
            counter[i] = wordCount;
        }
        for (int i = 0; i < words.length; i++){
            System.out.println(words[i] + " occurs: " + counter[i] + " times ");
        }
    }

    private static String[] getWordsFromText(String sentence){
        final var words = sentenceRefactor(sentence.trim());
        int[] counter = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordCount = 0;
            for (int j = 0; j < words.length; j++) {
                if (word.equalsIgnoreCase(words[j])) {
                    wordCount++;
                }
            }
            counter[i] = wordCount;
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " " + counter[i] + ", ");
        }
        return words;
    }
}

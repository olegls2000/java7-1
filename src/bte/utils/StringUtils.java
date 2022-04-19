package bte.utils;

import java.util.Objects;

public class StringUtils {

    private static String[] sentenceRefactor(final String sentence) {
        String[] rawWords = sentence.trim().split(" ");
        String[] words = new String[rawWords.length];
        for (int i = 0; i < rawWords.length; i++) {
            String word = rawWords[i]
                    .trim()
                    .replace(",", "")
                    .replace(".", "")
                    .replace("!", "")
                    .replace(":", "")
                    .replace(";", "")
                    .toLowerCase();
            words[i] = word;
        }
        return words;
    }

    public static void printShortestWord(final String sentence) {

        String[] words = sentenceRefactor(sentence);
        String minSizeWord = words[0];
        for (String word : words) {
            if (word.length() < minSizeWord.length()) {
                minSizeWord = word;
            }
        }
        String maxSizeWord = words[0];
        for (String word : words) {
            if (word.length() > maxSizeWord.length()) {
                maxSizeWord = word;
            }
        }
        System.out.println("Shortest word is: " + minSizeWord);
        System.out.println("Longest word is: " + maxSizeWord);
    }

    public static void startAndEndWithSameLetter(final String sentence) {
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

    public static void replaces(final String sentence) {
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

    public static void repeatedWords(final String sentence) {
        String[] words = sentenceRefactor(sentence);
        for (String word : words) {
            int count = 0;
            for (String s : words) {
                if (word.equals(s)) {
                    count++;
                    System.out.print(s + " " + count + ", ");
                    //  if (count > 1) {
                }
            }
        }
        System.out.println();
    }

    public static void printWordCount(String sentence) {
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
            System.out.print(words[i] + " " + counter[i] + ", ");
        }
    }
}


package bte.util;

public class StringUtils {

    public static void printLongestWord(final String sentence) {
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
        String minSizeWord = words[0];
        for (String word : words) {
            if (word.length() < minSizeWord.length()) {
                minSizeWord = word;
            }
        }
        System.out.println("Shortest word: " + minSizeWord);
    }

    public static void printShortestWord(final String sentence) {
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
        String maxSizeWord = words[0];
        for (String word : words) {
            if (word.length() > maxSizeWord.length()) {
                maxSizeWord = word;
            }
        }
        System.out.println("Longest word: " + maxSizeWord);
    }

    public static void startEndSameLetter(final String sentence) {
        for (String word : sentence.split(" ")) {
            if (word.startsWith(word) == word.endsWith(word)) {
                System.out.println(word);
            }
        }
    }

    public static void printReplace(final String sentence) {
        String[] rawWord = sentence.split(" ");
        String[] words = new String[rawWord.length];
        for (int i = 0; i < rawWord.length; i++) {
            String word = rawWord[i]
                    .replace(":", ";");
            words[i] = word;
        }
        String minSizeWord = words[0];
        for (String word : words) {
                minSizeWord = word;
        }
        System.out.println("Shortest word: " + minSizeWord);
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
            System.out.println(words[i] + "occurs: " + counter[i] + "times");
        }
    }

    private static String[] getWordsFromText(String text){
        String[] rawWord = text.split(" ");
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
        return null;
    }
}

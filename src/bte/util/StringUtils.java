package bte.util;

public class StringUtils {
    public static void printWordCount(String sentence) {
        final var words = getWordsFromText(sentence);
        final var counter = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            counter[i] = getRepeatCount(words[i], words);
        }
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + "occurs: " + counter[i] + " times");
        }
    }

    private static int getRepeatCount(String word, String[] text) {
        int result = 0;
        for (int i = 0; i < text.length; i++) {
            if (word.equalsIgnoreCase(text[i])) {
                result++;
            }
        }
        return result;
    }


    private static String[] getWordsFromText(String text) {
        String[] rawWords = text.split(" ");
        String[] result = new String[rawWords.length];
        for (int i = 0; i < rawWords.length; i++) {
            String word = rawWords[i]
                    .replace(",", "")
                    .replace("!", "")
                    .replace(".", "")
                    .replace(":", "");
            result[i] = word;
        }
        return result;
    }
}

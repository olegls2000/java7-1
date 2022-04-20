package bte.util;

public class StringUtils {

    public static String[] replaceSigns(final String sentence) {
        String st = sentence
                .replace("!", "")
                .replace(",", "")
                .replace(";", "")
                .replace(".", "")
                .replace("-", "")
                .replace(":", "")
                .replaceAll("^ +| +$|( )+", "$1");
        return st.split(" ");
    }

    //   public static String[] findShortestAndLongestWords(final String sentence) {
    public static void findShortestAndLongestWords(final String sentence) {
        if (sentence == null || "".compareTo(sentence) == 0)
            return;

        String[] words = replaceSigns(sentence);

        int min = 0, max = 0;
        String minWord = "";
        String maxWord = "";
        if (words.length == 1 && "".compareTo(words[0]) == 0)
            return;

        for (int i = 0; i < words.length; i++) {
            if (i == 0) {
                max = min = words[i].length();
                maxWord = minWord = words[i];

            } else {
                if (words[i].length() > max) {
                    max = words[i].length();
                    maxWord = words[i];
                }
                if (words[i].length() < min) {
                    min = words[i].length();
                    minWord = words[i];
                }
            }
        }
        System.out.println("The shortest word is " + minWord + ", the longest word is " + maxWord);
        //   return new String[]{minWord, maxWord};
    }

    public static void printWordsStartAndEndWithTheSameLetter(final String sentence) {
        if (sentence == null || "".compareTo(sentence) == 0)
            return;
        String[] words = replaceSigns(sentence);

        if (words.length == 1 && "".compareTo(words[0]) == 0)
            return;

        int indx = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.charAt(0) == word.charAt(words[i].length() - 1)) {
                if (indx != 0) {
                    System.out.print(", ");
                }
                System.out.print(word);
                indx++;
            }
        }
        System.out.println();
    }

    public static int replaceSemicolonAndCount(final String sentence) {
        //removes and counts ;
        if (sentence == null || "".compareTo(sentence) == 0)
            return 0;

        StringBuilder strBuilder = new StringBuilder(sentence);
        int count = 0;

        for (int i = 0; i < strBuilder.length(); ) {
            int indx = strBuilder.indexOf(";", i);
            if (indx != -1) {
                strBuilder.replace(indx, indx + 1, "");
                count++;
                i = indx;
            } else break;

        }
        System.out.println("String without leading and trailing whitespaces and semicolons: " +
                (strBuilder.toString().trim()));
        return count;
    }


    public static int replaceColonBySemicolonAndCount(final String sentence) {
        //replaces : by ; and counts ;
        if (sentence == null || sentence.isEmpty())
            return 0;

        StringBuilder strBuilder = new StringBuilder(sentence);
        int count = 0;
        for (int i = 0; i < strBuilder.length(); ) {
            int indx = strBuilder.indexOf(":", i);
            if (indx != -1) {
                strBuilder.replace(indx, indx + 1, ";");
                count++;
                i = indx + 1;
            } else break;

        }
        System.out.println("String without leading and trailing whitespaces and colons are replaced by semicolons: " +
                (strBuilder.toString().trim()));
        return count;
    }


    public static void countWordsCaseInsensitive(final String sentence) {
        if (sentence == null || "".compareTo(sentence) == 0)
            return;
        String[] words = replaceSigns(sentence);
        if (words.length == 1 && "".compareTo(words[0]) == 0)
            return;

        flag:
        for (int i = 0; i < words.length; i++) {
            int count = 1;

            for (int k = i - 1; k >= 0; k--) {
                if (words[i].compareToIgnoreCase(words[k]) == 0)
                    continue flag;
            }

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) == 0) {
                    count++;
                }
            }
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(words[i] + "-" + count);
        }
        System.out.println();
    }
}

package bte.util;

public class StringUtils {

    public static String getMaxLengthWord(String[] s) {
    for (int i = 0; i < s.length; i++) {
        s[i] = s[i].toLowerCase();
    }
    int len = 0;
    String longest = "";
    for (String string : s) {
        if (string.length() > len) {
            len = string.length();
            longest = string;
        }
    }
    return longest;
}
}

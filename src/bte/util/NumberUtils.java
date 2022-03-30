package bte.util;

public class NumberUtils {
    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }
}

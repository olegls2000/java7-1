package bte.utils;

import static java.lang.Math.random;

public class NumberUtils {
    public static int getRandom(int a, int b) {
        return (int) (random() * (b - a)) + a;
    }
}

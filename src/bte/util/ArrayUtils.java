package bte.util;

public final class ArrayUtils {
    private ArrayUtils() {
        throw new RuntimeException("Instance impossible");
    }

    public static <T> void printOutArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }

            System.out.println("] ");
        }
        System.out.println();
    }

    public static <T> T printAndReturnFigureWithPerimeter(T figure) {
        System.out.println(figure);
        return figure;
    }
}

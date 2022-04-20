package bte.util;

import bte.model.simple.WithPerimeter;

public final class ArrayUtils {
    private ArrayUtils() {
        throw new RuntimeException("Instance impossible");
    }

    public static void printOutArray2D(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("] ");
        }
        System.out.println("");
    }

    public static <T> void printOutArray(T[] array) {
        int i = 0;
        System.out.print("[");
        while ((i < array.length)) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
            i++;
        }
        System.out.println("]");
        System.out.println();
    }
    public static <T extends WithPerimeter> T printAndReturnFigureWithPerimeter(T figure){
        System.out.println(figure.getPerimeter());
        return figure;
    }
}

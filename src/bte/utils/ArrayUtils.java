package bte.utils;

public final class ArrayUtils {
    private ArrayUtils(){
        throw new RuntimeException("Instance impossible");
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

    public static <T> T printAndReturnFigureWithPerimeter(T figure){
        System.out.println(figure);
        return figure;
    }
}

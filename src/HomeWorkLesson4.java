public class HomeWorkLesson4 {
    public static void main(String[] args) {
        int[] arrayAverage = {7, 9, 17, 4, 50};
        int[][] array2D = {{1, 50, 9800, 12}, {55000, 300, 45, 70, 2000, 7}};
        int[][] arraySwapped = swapMaxAndMin(array2D);
        getAverage(arrayAverage);
        average2D(array2D);
        minOf2DArray(array2D);
        maxOf2DArray(array2D);
        printOutArray(arraySwapped);
    }

    public static double getAverage(int[] array) {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        double average = summ / array.length;
        System.out.println("Average of array is: " + average);
        return average;
    }

    public static double average2D(int[][] array) {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
            }
        }
        double result = summ / (array[0].length + array[1].length);
        System.out.println("Average of 2D array is: " + result);
        return summ;
    }

    public static int minOf2DArray(int[][] array) {
        int result = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < result) {
                    result = array[i][j];
                }
            }
        }
        System.out.println("Minimum number of 2D array is: " + result);
        return result;
    }

    public static int maxOf2DArray(int[][] array) {
        int result = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        System.out.println("Maximum number of 2D array is: " + result);
        return result;
    }

    public static int[][] swapMaxAndMin(int[][] array) {
        int iMax = 0;
        int jMax = 0;
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }
            }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[iMin][jMin]) {
                    iMin = i;
                    jMin = j;
                }
            }
        }
        int tmp = array[iMax][jMax];
        array[iMax][jMax] = array[iMin][jMin];
        array[iMin][jMin] = tmp;
        System.out.println(array[iMax][jMax] + " " + array[iMin][jMin]);
        return array;
    }

    public static void printOutArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.print("] ");
        }
    }
}

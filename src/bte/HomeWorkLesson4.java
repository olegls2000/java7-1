package bte;

public class HomeWorkLesson4 {
    public static void main(String[] args) {
        int[] arrayAverage = {7, 9, 17, 4, 50};
        int[][] array2D = {{100, 50, 98000, 12}, {55000, 300, 45, 70, 2000, 7}};
        int[][] array2Dref = {{50, 10, 56, 60}, {10, 45, 5, 99}};
        int[][] reformat2D = reformatArray(array2Dref);
        int[][] arraySwapped = swapMaxAndMin(array2D);
        getAverage(arrayAverage);
        average2D(array2D);
        minOf2DArray(array2D);
        maxOf2DArray(array2D);
        printOutArray(arraySwapped);
        printOutArray(reformat2D);
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
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                summ += array[i][j];
                count++;
            }
        }
        System.out.println("Average of 2D array is: " +  summ / count);
        return summ / count;
    }

    public static int minOf2DArray(int[][] array) {
        int result = array[0][0];
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
        int result = array[0][0];
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

    public static int[][] reformatArray(int[][] array) {
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[iMin][jMin]) {
                    iMin = i;
                    jMin = j;
                }
            }
        }
        int tmp = array[iMin][jMin];
        array[iMin][jMin] = array[0][0];
        array[0][0] = tmp;
        return array;
    }

    public static void printOutArray(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println("] ");
        }
        System.out.println("");
    }
}

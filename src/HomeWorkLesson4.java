public class HomeWorkLesson4 {
    public static void main(String[] args) {
        int[] arrayAverage = {7, 9, 17, 4, 50};
        int[][] array2D = {{10, 5, 98, 12}, {55, 3, 45, 77, 2, 17}};
        getAverage(arrayAverage);
        average2D(array2D);
        minOf2DArray(array2D);
        maxOf2DArray(array2D);
        swapMaxAndMin(array2D);
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
        int iMax = getIndexOfMaxElement(array);
        int iMin = getIndexOfMinElement(array);
        int[] temp = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = temp;
        return array;
    }

    public static int getIndexOfMaxElement(int[][] array) {
        int iMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax]) {
                    iMax = array[i][j];
                }
            }
        }
        System.out.println("Max element index: " + iMax + ", value = " + array[iMax]);
        return iMax;
    }

    public static int getIndexOfMinElement(int[][] array) {
        int iMin = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[iMin]) {
                    iMin = array[i][j];
                }
            }
        }
         System.out.println("Min element index: " + iMin + ", value = " + array[iMin]);
        return iMin;
    }


}

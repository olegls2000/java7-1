public class HomeWorkLesson4 {
    public static void main(String[] args) {
        double[] arrayAverage = {7, 9, 17, 4, 50};
        double[][] array2D = {{1, 5, 98, 12}, {55, 3, 45, 77, 2, 17}};
        getAverage(arrayAverage);
        average2D(array2D);
        minOf2DArray(array2D);
        maxOf2DArray(array2D);
    }

    public static double getAverage(double[] array) {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        double average = summ / array.length;
        System.out.println("Average of array is: " + average);
        return average;
    }

    public static double average2D(double[][] array) {
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

    public static double minOf2DArray(double[][] array) {
        double result = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < result) {
                    result = array[i][j];
                }
            }
        }
        System.out.println("Minimum number of 2D array is: " + (int) result);
        return result;
    }

    public static double maxOf2DArray(double[][] array) {
        double result = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        System.out.println("Maximum number of 2D array is: " +  (int) result);
        return result;
    }
}

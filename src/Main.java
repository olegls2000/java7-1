public class Main {
    public static void main(String[] args) {
        int[] arr = getArrayTill30(30);
        printArray(arr);
        printInverseArray(arr);
        System.out.println("Sum = " + getSumOfElements(arr));
        int[] arr1 = {2, 9, 10, 1};
        System.out.println("Max = " + findMaxElement(arr1));
        System.out.println("Min = " + findMinElement(arr1));

        int[][] matrix = {
                {1, 4, 7, 9},
                {2, 7, 11, 8},
                {6, 10, 0, 3}
        };

        int[] arrayForSwap = {1, 2, 3, 4, 7, 9};
        swapMinAndMax(arrayForSwap);
        printArray(arrayForSwap);

        System.out.println("Avarage in 1D: " + findAverage1D(arr1));
        System.out.println("Avarage in 2D: " + findAverage2D(matrix));
        System.out.println("Minimum in 2D: " + findMin2D(matrix));
        System.out.println("Maximum in 2D: " + findMax2D(matrix));
        printMatrix(matrix, "Before MinAndMax swapping:");
        swapMinAndMaxInMatrix(matrix);
        printMatrix(matrix, "After MinAndMax swapping:");

        putMinFirst2D(matrix);
        printMatrix(matrix, "After MinElFirst modification:");

        int[][] matrix1 = {
                {5, 4, 3, 9},
                {2, 1, 11, 8},
                {6, 10, 4, 3}
        };
        printMatrix(matrix1, "Before MinElFirst(s) modification:");
        putMinFirst2Dsimple(matrix1);
        printMatrix(matrix1, "After MinElFirst(s) modification:");
    }

    public static void swapMinAndMax(int[] arr) {
        int imin = 0;
        int imax = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[imin]) {
                imin = i;
            }
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        System.out.println("Max: array[" + imax + "] = " + arr[imax]);
        System.out.println("Min: array[" + imin + "] = " + arr[imin]);
        int tmp = arr[imin];
        arr[imin] = arr[imax];
        arr[imax] = tmp;
    }

    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getSumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] getArrayTill30(int count) {
        int[] arr = new int[15];
        oddNumbers(arr, count);
        return arr;
    }

    public static void oddNumbers(int[] arr, int count) {

        for (int i = 0, k = 0; i <= count; ++i) {
            if (i % 2 == 1) {
                arr[k] = i;
                k++;
            }
        }
    }


    public static void printInverseArray(int[] arr) {
        int i = arr.length - 1;
        boolean s = false;
        System.out.print("[ ");
        while (i >= 0) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }
            System.out.print(arr[i]);
            i--;
        }
        System.out.println(" ]");
    }

    public static void printArray(int[] arr) {
        boolean s = false;
        System.out.print("[ ");
        for (int i = 0; i < arr.length; ++i) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }
            System.out.print(arr[i]);
        }
        System.out.println(" ]");
    }

    public static void printInverseArrayFor(int[] arr) {
        boolean s = false;
        System.out.print("[ ");
        for (int i = arr.length - 1; i >= 0; --i) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }
        }
        System.out.println(" ]");
    }

    public static int[] findMinAndMaxInMatrix(int[][] matrix) {
        int imax = 0, jmax = 0;
        int imin = 0, jmin = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!(i == 0 && j == 0)) {
                    if (matrix[i][j] < matrix[imin][jmin]) {
                        imin = i;
                        jmin = j;
                    }
                    if (matrix[i][j] > matrix[imax][jmax]) {
                        imax = i;
                        jmax = j;
                    }
                }
            }

        }
        return new int[]{imin, jmin, imax, jmax};
    }

    public static void swapMinAndMaxInMatrix(int[][] matrix) {
        int[] minmaxIndexes = findMinAndMaxInMatrix(matrix);

        int imin = minmaxIndexes[0];
        int jmin = minmaxIndexes[1];
        int imax = minmaxIndexes[2];
        int jmax = minmaxIndexes[3];

        int temp = matrix[imin][jmin];
        matrix[imin][jmin] = matrix[imax][jmax];
        matrix[imax][jmax] = temp;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        System.out.print("[ ");
        for (int i = 0; i < matrix.length; i++) {
            boolean s = false;
            if (i > 0)
                System.out.print("  ");
            System.out.print("[ ");

            for (int j = 0; j < matrix[i].length; j++) {
                if (s) {
                    System.out.print(", ");
                } else {
                    s = true;
                }
                System.out.print(matrix[i][j]);
            }
            System.out.print(" ]");
            if (i != matrix.length - 1) {
                System.out.println();
            }
        }
        System.out.println(" ]");
    }

    public static double findAverage1D(int[] array) {
        double avg = 0.0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        return avg / array.length;
    }

    public static double findAverage2D(int[][] matrix) {
        double avg = 0.0;
        int elCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                avg += matrix[i][j];
            }
            elCount += matrix[i].length;
        }
        return avg / elCount;
    }

    public static int findMin2D(int[][] matrix) {
        int min = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    min = matrix[0][0];
                } else if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static int findMax2D(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 && j == 0) {
                    max = matrix[0][0];
                } else if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void putMinFirst2Dsimple(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int jmin = 0;
            for (int j = 0; j < matrix[i].length; ++j) {
                if (j != 0) {
                    if (matrix[i][j] < matrix[i][jmin]) {
                        jmin = j;
                    }
                }
            }
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][jmin];
            matrix[i][jmin] = temp;
        }
    }

    public static int findMinIndex(int[] array) {
        int imin = 0;
        for (int i = 0; i < array.length; ++i) {
            if (i != 0) {
                if (array[i] < array[imin]) {
                    imin = i;
                }
            }
        }
        return imin;
    }

    public static void putMinFirst2D(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int imin = findMinIndex(matrix[i]);
            int temp = matrix[i][0];
            matrix[i][0] = matrix[i][imin];
            matrix[i][imin] = temp;
        }
    }
}



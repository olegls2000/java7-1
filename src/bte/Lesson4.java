package bte;

public class Lesson4 {
    public static void main(String[] args) {
        getArrayTill30();
        int[] getArrayTill30 = getArrayTill30();
        int summ = getSumOfElements(getArrayTill30);
        System.out.println(summ);
        int[] array = {3, 6, 9, 8, 1, 66, 4};
        int max = findMaxElement(array);
        int min = findMinElement(array);
        int[][] matrix = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};

        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("]");
        }
        System.out.println("]");

        int[] arrayForSwap = {1, 2, 3, 4, 79};

        int[] arraySwapped = swapMaxAndMin(arrayForSwap);
    }

    public static int[] getArrayTill30() {
        int[] result = new int[15];
        int counter = 0;
        int i = 0;
        while (counter <= 30) {
            if (counter % 2 == 1) {
                result[i] = counter;
                i++;
            }
            counter++;
        }
        for (int a = result.length - 1; a >= 0; a--) {

            System.out.print(result[a] + ", ");
        }
        System.out.println();
        return result;
    }

    public static int getSumOfElements(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array.length;
        }
        return summ;
    }

    public static int findMaxElement(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Max element is: " + max);
        return max;
    }

    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        return min;
    }

    public static int[] swapMaxAndMin(int[] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        System.out.println("Max element index: " + iMax + ", value =" + array[iMax]);
        int iMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Min element index: " + iMin + ", value =" + array[iMin]);
        int tmp = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = tmp;
        return array;
    }

    public static int getIndexOfMaxElement(int[] array) {
        return 0;
    }
}

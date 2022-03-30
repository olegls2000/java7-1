package bte;

public class Lesson4 {
    public static void main(String[] args) {
//Создайте метод, возвращающий массив из всех
// нечетных чисел от 0 до 30, и который
// выведит его на печать в прямом и обратном порядке.
        printWord(8, "!");
        printWord(9, ".");
        int t = 9;
        t = mutation(t);
        System.out.println("After mutation: " + t);

        int[] arrayTill30 = getArrayTill30();
        int sum = getSumOfElements(getArrayTill30());
        System.out.println("Sum = " + sum);

        int[] array = {3, 66, 9, 8, 4};
        int max = findMaxElement(array);
        int min = findMinElement(array);
        int[][] matrix = {
                {10, 11, 12, 13},
                {20, 21, 22},
                {30, 31, 32, 33, 34}
        };
        System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("]");
        }
        System.out.println("]");

        int[] arrayForSwap = {1, 2, 3, 9, 4};

        int[] arraySwapped = swapMaxAndMin(arrayForSwap);
    }

    //    1, 2, 3, 9, 4
    public static int[] swapMaxAndMin(int[] array) {
        int iMax = getIndexOfMaxElement(array);
        int iMin = getIndexOfMinElement(array);
        int temp = array[iMax];    //9
        array[iMax] = array[iMin]; //    1, 2, 3, 1, 4
        array[iMin] = temp;        //    9, 2, 3, 1, 4
        return array;
    }

    public static int getIndexOfMaxElement(int[] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        System.out.println("Max element index: " + iMax + ", value = " + array[iMax]);
        return iMax;
    }

    public static int getIndexOfMinElement(int[] array) {
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[iMin]) {
                iMin = i;
            }
        }
        System.out.println("Min element index: " + iMin + ", value = " + array[iMin]);
        return iMin;
    }

    public static int findMinElement(int[] array) {
        //TODO ....
        return 0;
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

    public static int mutation(int a) {
        a = a + 1;
        return a;
    }

    public static void printWord(int n, String suffix) {
        System.out.println(" pRINT FROM mETHOD " + n + suffix);
    }


    public static int getSumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //  0  1  2  3  4  5   30
//     1     3     5
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
        for (int j = result.length - 1; j >= 0; j--) {
            System.out.print(result[j] + ", ");
        }
        System.out.println();
        return result;
    }


}

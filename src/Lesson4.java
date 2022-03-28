public class Lesson4 {
    public static void main(String[] args) {
        int[] arrayTill30 = getArrayTill30();
        int summ = getSummOfElems(arrayTill30);
        System.out.println("sum =" + summ);


        int[] array = {6, 9, 8, 15, 99, 22};
        int max = findMaxElem(array);
        int min = findMinElems(array);


        int[][] matrix = {
                {10, 11, 12},
                {20, 21, 22},
                {30, 31, 32}
        };
        //System.out.println("[");
        for (int i = 0; i < matrix.length; i++) {
            //System.out.print("[");
            for (int j = 0; j < matrix.length; j++) {
                //System.out.print(matrix[i][j] + ", ");

            }
            //System.out.println("]");

        }
        //System.out.println("]");
        int[] arrayForSwap = {244, 55, 16, 55};
        int[] arraySwapped = swapMaxAndMin(arrayForSwap);
    }

    public static int[] swapMaxAndMin(int[] array) {
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[iMax]) {
                iMax = i;
            }
        }
        System.out.println("Max element index: " + iMax + ", Value = " + array[iMax]);
        int iMin = 0;
        for (int i = 1; i < array.length; i++) {

            if (array[i] < array[iMin]) {
                iMin = i;

            }
        }
        System.out.println("Min element index: " + iMin + ", Value = " + array[iMin]);
        int temp = array[iMax];
        array[iMax] = array[iMin];//1,2,3,1,4
        array[iMin] = temp;// 9,2,3,1,4

        return array;
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
        for (int j = result.length - 1; j >= 0; j--) {
            System.out.print(result[j] + ",");
        }
        System.out.println();
        return result;
    }

    public static int getSummOfElems(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int findMaxElem(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println("Max element is: " + max);
        return max;
    }

    public static int findMinElems(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Minimum is: " + min);
        return min;
    }
}
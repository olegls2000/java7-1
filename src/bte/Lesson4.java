package bte;

public class Lesson4 {
    public static void main(String[] args) {
    int [] arrayTill30= getArrayTill30();
    int sum = getSumOfElements(arrayTill30);
        System.out.println(sum + ",");
        int[] array = {3,6,9,8,4};
        //int[] max =
                findMaxElement(array);
        //int[] min =
                findMinElement(array);
        int[][] matrix = {
                          {10, 11, 12, 13},
                          {20, 21, 22},
                          {30, 31, 32, 33, 34}
        };
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++){
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + ",");
        }
            System.out.println("]");
        }
        System.out.println();

        int [] arrayForSwap = {1, 2, 3, 9, 4};
        int [] arraySwapped = swapMaxAndMin(arrayForSwap);
    }
    public static int[] swapMaxAndMin(int[] array){
        int iMax = getIndexOfMaxElement(array);
        int iMin = getIndexOfMinElement(array);

        int temp = array[iMax];
        array[iMax] = array[iMin];
        array[iMin] = temp;
        return array;
    }
    public static int getIndexOfMaxElement(int[] array){
        int iMax = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] > array[iMax]){
                iMax = i;
            }
        }
        System.out.println("Max element index: " + iMax + ", value = " + array[iMax]);
        return iMax;
    }
    public static int getIndexOfMinElement(int[] array){
        int iMin = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] < array[iMin]){
                iMin = i;
            }
        }
        System.out.println("Min element index: " + iMin + ", value = " + array[iMin]);
        return iMin;
    }
    public static int[] findMaxElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
            max = array[i];
            }
        }
        System.out.println(max + " - max");
        return array;
    }
    public static int[] findMinElement(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min + " - min");
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
            System.out.print(result[j] + ", ");
        }
        System.out.println();
        return result;
    }
    public static int getSumOfElements(int[] array){
     int sum = 0;
     for (int i = 0; i < array.length; i++){
         sum += array[i];
     }
     return sum;
    }
}

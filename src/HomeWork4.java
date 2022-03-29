import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] averageArray = {2, 7, 23, 17, 32};
        averageArray1(averageArray);
        int[][] array2D = {{25, 37, 2}, {10, 40, 3, 11, 12}};
        average2DArray(array2D);
        maxArray2D(array2D);
        minArray2D(array2D);
        System.out.println("");
        int[][] array2DSwap = array2D;
        System.out.print("Array 2D :       " );
        array2DPrint(array2D);
        System.out.println("");
        swapMaxAndMin(array2DSwap);
        System.out.println();
        System.out.print("Array 2D Swap :  ");
        arrayPrint(array2DSwap);
        int [][] array1Minij = array2DSwap;
        array1Min(array1Minij);
        System.out.println();
        System.out.print("Array 2D 1 min : ");
        array1MinPrint(array1Minij);
    }

    public static void averageArray1(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        System.out.println(average + " average");
    }

    public static void average2DArray(int[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }

        double average = sum / (array[0].length + array[1].length);
        System.out.println(average + " average2D");
    }

    public static int maxArray2D(int[][] array) {
        int max = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max + " - max2DInt");
        return max;
    }

    public static int minArray2D(int[][] array) {
        int min = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        System.out.println(min + " - min2DInt");
        return min;
    }

    public static int[][] swapMaxAndMin(int[][] array) {
        int iMax = 0;
        int jMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax][jMax]) {
                    iMax = i;
                    jMax = j;
                }/*else{
                    if (iMax > jMax){
                        max = iMax;
                    }else{
                        max = jMax;
                    }
                }*/
            }
        }
        System.out.println("Max element index: " + iMax + ", " + jMax);
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < array[iMin][jMin]) {
                    iMin = i;
                    jMin = j;
                }/*else{
                    if (iMin < jMin){
                        min = iMin;
                    }else{
                        min = jMin;
                    }
                }*/
            }
        }
        System.out.println("Min element index: " + iMin + ", " + jMin);
        int temp = array[iMax][jMax];
        array[iMax][jMax] = array[iMin][jMin];
        array[iMin][jMin] = temp;
        return array;

    }

    public static int [][] array2DPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
        }
        return array;
    }

    public static int [][] arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
        }
        return array;
    }

    public static int[][] array1Min(int[][] array) {
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

    public static int [][] array1MinPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                System.out.print(", ");
            }
        }
        return array;
    }
}

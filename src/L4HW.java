//public class L4HW {
//    public static void main(String[] args) {
//
//    }
//
//    public static double getAverage(int[][] array) {
//        int summ = 0;
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j; j < array[i].length; j++) {
//                summ += array[i][j];
//                count++;
//            }
//        }
//        return summ / count;
//    }
//
//
//    public static int[][] swapIn2D(int[][] array) {
//        int iMax = 0;
//        int jMax = 0;
//
//        int iMin = 0;
//        int jMin = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j] > array[iMax][jMax]) {
//                    iMax = i;
//                    jMax = j;
//                }
//                if (array[i][j] < array[iMin][iMax]) {
//                    iMin = i;
//                    jMin = j;
//                }
//            }
//        }
//        int temp = array[iMax][jMax];
//        array[iMax][jMax] = array[iMin][jMin];
//        array[iMin][jMin] = temp;
//        return array;
//    }
//}

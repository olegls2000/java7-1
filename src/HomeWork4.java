public class HomeWork4 {
    public static void main(String[] args){
        int [] averageArray = {2, 7, 23, 17, 32};
        int [][] array2D = {{25, 37, 2}, {87, 45, 3, 60, 12}};
        // minArray2D(array2D);
        // maxArray2D(array2D);
        int [] max = maxArray2D(array2D);
        int [] min = minArray2D(array2D);
        int [] array2DSwap = array2D;
        int [] swappedArray2D = swapMaxAndMin(array2DSwap);
        int [] array2DMinRow = array2D;
    }
    public static double[] averageArray(double[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.println(sum + ",");
        }

        return sum;
    }
}

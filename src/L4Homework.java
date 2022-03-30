public class L4Homework {
    public static void main(String[] args) {
        //TODO: Create method witch finds average in 1D array;
        // Create method witch finds average in 2D array;
        // Create method witch finds max/min volume in 2D array;
        // Create methods witch finds min and max volume in 2D array and swap it;
        // Create method witch reformat 2D array
        // of numbers int in that way that first element in row is always minimal element from the row

        int[] num = {1, 56, 235, 23, 1, 2, 5};
        double average = 0;
        if (num.length > 0) {
            double sum = 0;
            for (int j = 0; j < num.length; j++) {
                sum += num[j];
            }
            average = sum / num.length;
            System.out.println(average);
        }



        int[][] arrayTwo = {{5,2,3},{6,7,1}};
        double averageTwo = 0;
        double sumTwo = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int x = 0; x < arrayTwo[i].length; x++) {
                System.out.print(arrayTwo[i][x] + "\t");
            sumTwo += arrayTwo[i][x];
            }
            System.out.println();
        }
        System.out.println(sumTwo);

    }
}





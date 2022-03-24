public class HomeWorkLesson4 {
    public static void main(String[] args) {
        double[] arrayAverage = {7, 9, 17, 4, 50};
        getAverage(arrayAverage);
    }

    public static double getAverage(double[] array) {
        double summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        double average = summ / array.length;
        System.out.println(average);
        return average;
    }
}

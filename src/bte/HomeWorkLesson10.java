package bte;

public class HomeWorkLesson10 {
    public static void main(String[] args) {
        System.out.println(getFactorial(12));
    }

    public static long getFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * getFactorial(number - 1);
        }
    }
}

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
    }

    public static int mutation(int a) {
        a = a + 1;
        return a;
    }

    public static void printWord(int n, String suffix) {
        System.out.println(" pRINT FROM mETHOD " + n + suffix);
    }
//  0  1  2  3  4  5   30
//     1     3     5
    public static int[] getArrayTill30() {
        int[] result = new int[16];
        int counter = 0;
        int i = 0;
        while (counter <= 30) {
            if (counter % 2 == 1) {
                result[i] = counter;
                i++;
            }
            counter++;
        }
        //TODO print array in reverse order
        return result;
    }

}

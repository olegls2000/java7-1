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
        int sum = getSumOfElements(arrayTill30);
        System.out.println("Sum = " + sum);
    }

    public static int mutation(int a) {
        a = a + 1;
        return a;
    }

    public static void printWord(int n, String suffix) {
        System.out.println(" pRINT FROM mETHOD " + n + suffix);
    }

    public static int getSumOfElements(int[] array) {
        //TODO ... +=

        return 0;
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

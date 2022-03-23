public class Lesson4 {
    public static void main(String[] args) {
        getArrayTill30();
        getArrayTill0();
    }

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
        return result;
    }

    public static int[] getArrayTill0() {
        int[] result = new int[31];
        int counter = 30;
        int i = 30;
        while (counter >= 0) {
            if (counter % 2 == 1) {
                result[i] = counter;
                i--;
            }
            counter--;
        }
        return result;


    }

}

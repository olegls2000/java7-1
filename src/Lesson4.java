public class Lesson4 {
    public static void main(String[] args) {
    int [] arrayTill30= getArrayTill30();
    int sum = getSumOfElements(arrayTill30);
        System.out.print(sum + ",");
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

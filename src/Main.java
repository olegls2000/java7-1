public class Main {
    public static void main(String[] args) {
//printOutArray(getArrayTill30());

        int[] array = getArrayTill30();
        int sum = getSumOfElements(array);
        System.out.println(sum);
        int [] array1 = {3,5,9,8,66};
        System.out.println(findMaxElement(array1));
        System.out.println(findMinElement(array1));

    }

    public static int[] getArrayTill30() {
        int[] result = new int[15];
        int count = 0;
        int i = 0;
        while (count <= 30) {
            if (count % 2 == 1) {
                result[i] = count;
                i++;
            }
            count++;
        }
        for (int j = result.length - 1; j >= 0; j--) {
            System.out.print(result[j] + " ");
        }
        System.out.println();
        return result;
    }


    public static int getSumOfElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int findMaxElement(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
            max = array[i];
        }
        return max;
    }

    public static int findMinElement(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min)
                min = array[i];
        }
        return min;
    }
}

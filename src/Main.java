public class Main {
    public static void main(String[] args) {
        int[] arr = getArrayTill30(30);
        printArray(arr);
        printInverseArray(arr);
        System.out.println("Sum = " + getSumOfElements(arr));
        int[] arr1 = {2, 9, 10, 1};
        System.out.println("Max = " + findMaxElement(arr1));
        System.out.println("Mi n = " + findMinElement(arr1));
    }
    public static int findMinElement(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int getSumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    public static int[] getArrayTill30(int count) {
        int[] arr = new int[15];
        arr = oddNumbers(arr, count);

        return arr;
    }

    public static int[] oddNumbers(int[] arr, int count) {

        for (int i = 0, k = 0; i <= count; ++i) {
            if (i % 2 == 1) {
                arr[k] = i;
                k++;
            }
        }
        return arr;
    }


    public static void printInverseArray(int[] arr) {
        int i = arr.length - 1;
        boolean s = false;
        System.out.print("[ ");
        while (i >= 0) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }
            System.out.print(arr[i]);
            i--;
        }
        System.out.println(" ]");
    }

    public static void printArray(int[] arr) {
        boolean s = false;
        System.out.print("[ ");
        for (int i = 0; i < arr.length; ++i) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }
            System.out.print(arr[i]);
        }
        System.out.println(" ]");
    }

    public static void printInverseArrayFor(int[] arr) {
        boolean s = false;
        System.out.print("[ ");
        for (int i = arr.length - 1; i >= 0; --i) {
            if (s) {
                System.out.print(", ");
            } else {
                s = true;
            }

        }
        System.out.println(" ]");
    }
}

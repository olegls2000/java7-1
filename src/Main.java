public class Main {
    public static void main(String[] args) {
        int[] arr=getArrayTill30(30);
        printArray(arr);
        printInverseArray(arr);
    }
    public static int[] getArrayTill30(int count) {
        int[] arr=new int[15];
        arr=oddNumbers(arr,count);

        return arr;
    }
    public static int[] oddNumbers(int[] arr,int count) {

        for (int i = 0, k = 0; i <= count; ++i) {
            if (i % 2 ==1) {
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

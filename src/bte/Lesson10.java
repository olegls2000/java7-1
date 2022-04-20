package bte;

import bte.pattern.builder.*;
import bte.pattern.singletone.Singleton;

import static bte.util.Print.print;
import static bte.util.Print.printnb;

public class Lesson10 {
    public static void main(String[] args) {
//        printTillZero(6);
//        printTillZeroRecursively(6);
//        print();
//        printFromZeroTillN(7);
//        print();
//        long fibo = getFiboNumber(8);
//        print(fibo);
        AutoBuilder autoBuilder = new AutoBuilder();
        autoBuilder.engine(new Engine());
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        Wheel[] wheels = {wheel1,wheel2,wheel3,wheel4};
        autoBuilder
                .wheels(wheels)
                .body(new Body());
        print("afegrg");

        Auto auto = autoBuilder.build();

        Singleton singletonObject = Singleton.getInstance();
        Singleton newSingleton = Singleton.getInstance();
        print("Some logic... ");



    }

    private static void printTillZero(int from) {
        print("Iteratively: ");
        while (from >= 0) {
            printnb(from + " ");
            from--;

        }
        print();
    }

    private static void printTillZeroRecursively(int from) {
        printnb(from + " ");
        if (from == 0) {
            return;
        }
        var fromDecremented = --from;
        printTillZeroRecursively(fromDecremented);

    }

    //from 0,1,2,3...n
    public static void printFromZeroTillN(int n) {
        if (n < 0) {
            return;
        }
        int m = n - 1;
        printFromZeroTillN(m);
        printnb(n + " ");
    }
    //0,1,1,2,3,5,8....

    public static long getFiboNumber(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return getFiboNumber(n - 1) + getFiboNumber(n - 2);
    }

}


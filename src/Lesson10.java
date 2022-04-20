import bte.pattern.builder.*;
import bte.pattern.singleton.Singleton;
import bte.service.AutoSalon;

public class Lesson10 {
    public static void main(String[] args) {
        printTillZero(5);
        System.out.println("");
        printTillZeroRecursively(6);
        System.out.println("");
        printFromZeroRecursively(7);
        System.out.println("");
        long fiboNumber = getFiboNumber(5);
        System.out.println(fiboNumber);
        AutoBuilder autoBuilder = new AutoBuilder();
        autoBuilder.engine(new Engine());
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};
        autoBuilder
                .wheels(wheels)
                .body(new Body());
        Auto auto = autoBuilder.build();
        AutoSalon autoSalon = new AutoSalon();
        Singleton singletonObject = Singleton.getInstance();
        Singleton newSingleton = Singleton.getInstance();
    }

    private static void someMeth(AutoBuilder autoBuilder){
       Auto auto = autoBuilder.build();
    }

    private static void printTillZero(int from) {
        System.out.print("Iteratively: ");
        while (from >= 0) {
            System.out.print(from + " ");
            from--;
        }
    }

    private static void printTillZeroRecursively(int from) {
        System.out.print(from + " ");
        if (from == 0) {
            return;
        }
        printTillZeroRecursively(--from);
    }

    private static void printFromZeroRecursively(int n) {
        if (n < 0){
            return;
        }
        int m = n - 1;
        printFromZeroRecursively(m);
        System.out.print(n + " ");
    }

    //0, 1, 1, 2, 3, 5, 8, ....
    //1, 2, 3, 4, 5,
    public static long getFiboNumber(int number){
        if (number == 1){
            return 0;
        }
        if (number == 2){
            return 1;
        }
        return getFiboNumber(number - 1) + getFiboNumber(number - 2);
    }
}

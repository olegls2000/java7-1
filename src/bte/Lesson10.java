package bte;

import bte.pattern.builder.*;
import bte.pattern.pubsub.*;
import bte.pattern.sinlgeton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {
        printTillZero(6);
        printTillZeroRecursively(6);
        System.out.println();
        printFromZeroTillN(7);
        System.out.println();
        long fibo = getFiboNumbers(8);
        System.out.println(fibo);

        AutoBuilder autoBuilder = new AutoBuilder();
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();
        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};
        autoBuilder.engine(new Engine());
        autoBuilder
                .body(new Body())
                .wheels(wheels);
        Auto auto = autoBuilder.build();
        Singleton singletonObject = Singleton.getInstance();
        Singleton newSingleton = Singleton.getInstance();
        System.out.println("Some logic ...");

        List<NewsSubscriber> subscriberList = new ArrayList<>();
        subscriberList.add(new CnnNewsSubscriber());
        subscriberList.add(new ErrNewsSubscriber());
        NewsSourceAgency newsSourceAgency = new NewsSourceAgency(subscriberList);
        newsSourceAgency.publish(new News("News1","New one content"));
        newsSourceAgency.publish(new News("News2","News two content"));
        subscriberList.add(new DelfiNewsSubscriber());
        newsSourceAgency.publish(new News("News3","News three content"));
        newsSourceAgency.removeSubscriber(1);
        newsSourceAgency.publish(new News("News4","News four content"));
    }

    private static void printTillZero(int from) {
        System.out.print("Interactively: ");
        while (from >= 0) {
            System.out.print(from + " ");
            from--;
        }
        System.out.println();
    }

    private static void printTillZeroRecursively(int from) {
        System.out.print(from + " ");
        if (from == 0) {
            return;
        }
        printTillZeroRecursively(--from);
    }

    private static void printFromZeroTillN(int n) {
        if (n < 0) {
            return;
        }
        int m = n - 1;
        printFromZeroTillN(m);
        System.out.print(n + " ");
    }

    public static long getFiboNumbers(int number) {
        if (number == 1) {
            return 0;
        }
        if (number ==2){
            return 1;
        }
            return getFiboNumbers(number - 1) + getFiboNumbers(number - 2);
    }
}

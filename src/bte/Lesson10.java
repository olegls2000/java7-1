package bte;

import bte.pattern.builder.*;
import bte.pattern.pubsub.*;
import bte.pattern.singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Lesson10 {

    public static void main(String[] args) {
        printTillZero(6);
        printTillZeroRecursively(3);
        System.out.println();
        printFromZeroTillN(7);
        System.out.println("Fibo: ");
        long fibo = getFiboNumber(8);
        System.out.println(fibo);
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
        //Auto auto = autoBuilder.build();
        //AutoSalon veho = new AutoSalon();
        //AutoSalon amserv = new AutoSalon();
        //veho = amserv;
        //veho = new AutoSalon();
        Singleton singletonObject = Singleton.getInstance();
        Singleton newSingleton = Singleton.getInstance();
        System.out.println("Some logic ..");
        List<NewsSubscriber> subscriberList = new ArrayList<>();
        subscriberList.add(new CnnNewsSubscriber());
        subscriberList.add(new ErrNewsSubscriber());
        NewsSourceAgency newsSourceAgency = new NewsSourceAgency(subscriberList);
        newsSourceAgency.publish(new News("News1", "News One content"));
        newsSourceAgency.publish(new News("News2", "News Two content"));
        newsSourceAgency.addNewSubscriber(new DelfiNewsSubscriber());
        newsSourceAgency.publish(new News("News3", "News Three content"));
        newsSourceAgency.removeSubscriber(1);
        newsSourceAgency.publish(new News("News4", "News Four content"));


    }

    private static void someMeth(AutoBuilder autoBuilder) {
        Auto auto = autoBuilder.build();
    }

    // from, from-1, from-2, ... 0 ;
    private static void printTillZero(int from) {
        System.out.print("Iteratively: ");
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

    //0, 1, 2, ... n ;
    public static void printFromZeroTillN(int n) {
        if (n < 0) {
            return;
        }
        int m = n - 1;
        printFromZeroTillN(m);
        System.out.print(n + " ");
    }

    //0, 1, 1, 2, 3, 5, 8, 13.
    //1, 2, 3 ,4, 5, 6, 7, 8
    public static long getFiboNumber(int number) {
        if (number == 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        return getFiboNumber(number - 1) + getFiboNumber(number - 2);
    }
}

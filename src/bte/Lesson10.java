package bte;

import pattern.builder.Auto;
import pattern.builder.Body;
import pattern.builder.Engine;
import pattern.builder.Wheel;
import pattern.builder.builder.AutoBuilder;
import pattern.pubsub.*;
import pattern.singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Lesson10 {
    public static void main(String[] args) {
        printTillZero(10);
        printTillZeroRecursion(10);
        printFromNRecursion(0, 10);

        printFrom0NRecursion(10);
        System.out.println();
        System.out.println(getFibonacciNumber(3));

        AutoBuilder autoBuilder = new AutoBuilder();
        autoBuilder
                .body(new Body())
                .engine(new Engine())
                .wheels(new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()});
        Auto auto = autoBuilder.build();

        Singleton singleton = Singleton.getInstance();


        List<NewsSubscriber> sub = new ArrayList<>();
        sub.add(new CnnNewsSubscriber());
        sub.add(new DelfiNewsSubscriber());

        NewSourceAgency newsAgency = new NewSourceAgency(sub);
        newsAgency.publish(new News("News1", "Content1"));
        newsAgency.addNewSubscriber(new ErrNewsSubscriber());
        newsAgency.publish(new News("News2", "Content2"));


        calculateFactorial(5);
        System.out.println();
        System.out.println(calculateFactorial1(5) + "!");

        calculateFactorial3(5);

    }

    public static Auto buildAuto(AutoBuilder auto) {
        return auto.build();
    }

    private static void printTillZero(int from) {
        while (from >= 0) {
            System.out.print(from + " ");
            from--;
        }
        System.out.println();
    }

    private static void printTillZeroRecursion(int from) {
        if (from < 0) {
            System.out.println();
            return;
        }
        System.out.print(from + " ");
        printTillZeroRecursion(from - 1);
    }

    private static void printFromNRecursion(int i, int to) {
        if (i > to) {
            System.out.println();
            return;
        }
        System.out.print(i + " ");
        printFromNRecursion(i + 1, to);
    }

    private static void printFrom0NRecursion(int to) {
        if (to < 0) {
            System.out.println();
            return;
        }
        printFrom0NRecursion(to - 1);

        System.out.print(to + " ");

    }

    private static long calculateFactorial(long number) {
        if (number <= 1) {
            System.out.print(number + " ");
            return 1;
        }
        number *= calculateFactorial(number - 1);

        System.out.print(number + " ");
        return number;
    }

    private static long calculateFactorial1(long number) {

        if (number <= 1) {
            System.out.print(number + " = ");
            return 1;
        }
        System.out.print(number + " * ");

        number *= calculateFactorial1(number - 1);

        return number;
    }

    private static long calculateFactorial3(long number) {
        return calculateFactorial2(number, 0);
    }

    private static long calculateFactorial2(long number, int level) {
        long result=1;
        if (number <= 1) {
            System.out.print(number + " = ");
            return result;
        }
        System.out.print(number + " * ");

        result = number * calculateFactorial2(number - 1, level + 1);
        if (level == 0)
            System.out.println(result + "!");


        return result;
    }

    public static int getFibonacciNumber(int number) {
        if (number == 0 || number == 1)
            return 1;
        return getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2);
    }


}

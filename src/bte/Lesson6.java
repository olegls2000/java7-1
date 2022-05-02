package bte;

import bte.model.Point;
import bte.model.Triangle;
import bte.util.WeekDay;

import java.util.Scanner;

import static bte.util.NumberUtils.getRandom;


public class Lesson6 {

    public static void main(String[] args) {
        System.out.println(Math.PI);
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double perimeter = triangle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        final int ARRAY_INDEX = 5;

        final Point POINT = new Point(4, 4);
        POINT.x = 9;
        POINT.y = 9;
        // POINT = new bte.model.Point(7,7);
        int arrayIndex = 5;
        mutatePrimitive(arrayIndex);
        System.out.println(arrayIndex);
        mutateObject(POINT);
        System.out.println(POINT);

        WeekDay friday = WeekDay.SUNDAY;
        boolean isHoliday = friday.isHoliday;
        String dayName = friday.name;
        int order = friday.ordinal();
        System.out.println(dayName + order);
        WeekDay[] weekDays = WeekDay.values();
        WeekDay randomDay = weekDays[getRandom(0, weekDays.length)];
        System.out.println(randomDay.name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your free-style line...");
        String input = scanner.nextLine();
        System.out.println("You input: " + input);
        int intInput = scanner.nextInt();
        System.out.println("You input: " + intInput);
    }

    /**
     *
     * Склад-магазин вместимостью до 6 автомобилей, который может
     * хранить и продавать автомобили, а так же накапливать деньги в кассе.
     * 1. Реализовать класс автомобиль у которго есть:
     * цвет (может быть - Красный, белый, черный, применить константы
     * (подумать какого типа они должны быть) ),
     * вес (от 1200 до 2500 кг) и
     * цена (от 80 000 до 400 000).
     * Реализуйте в классе конструктор в котором все
     * параметы автомобиля должны вводиться из консоли.
     *
     * ves automatom
      */

    public static void mutatePrimitive(int a) {
        a = 8;
    }

    public static void mutateObject(Point p) {
        p.x = 8;
        p = new Point(5, 5);
    }
}

package bte;

import bte.model.Circle;
import bte.model.Point;
import bte.model.Triangle;
import bte.utils.NumberUtils;
import bte.utils.WeekDay;

import java.util.Scanner;

import static bte.utils.NumberUtils.getRandom;
import static java.lang.Math.PI;

public class Lesson6 {
    public static void main(String[] args) {
        System.out.println(PI);
      // Circle circle = new Circle(5), center;

        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double perimeter = triangle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);

        final int ARRAY_INDEX = 5; // константы с Большой буквы
        int arrayIndex = 5;

        final Point POINT = new Point(4, 4);
        POINT.setY(9);

        mutatePrimitive(arrayIndex);
        System.out.println(arrayIndex);
        muteteObject(POINT);
        System.out.println(POINT);

        WeekDay friday = WeekDay.FRIDAY;
        boolean isHoliday = friday.isHoliday;
        String dayName = friday.getName();
        int order = friday.ordinal();
        System.out.println(dayName + order);
        WeekDay[] weekDay = WeekDay.values();
        WeekDay radomDay = weekDay[getRandom(0, weekDay.length)];
        System.out.println(radomDay.getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas input your free-style line ...");
        String input = scanner.nextLine();
        System.out.println("You input: " + input);
    }

    public static void mutatePrimitive(int a) {
        a = 8;
    }

    public static void muteteObject(Point p) {
        p = new Point(5, 5);
    }


}

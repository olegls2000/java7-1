package bte;

import bte.model.Circle;
import bte.model.Point;
import bte.model.Triangle;
import bte.util.NumberUtils;
import bte.util.WeekDay;

import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circlex = new Circle(5);

        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        double perimetr = triangle.getPerimeter();
        System.out.println("Perimetr: " + perimetr);

        int arrayIndex = 5;
        final int ARRAY_INDEX = 5;

        final Point POINT = new Point(4, 4);
        POINT.x = 9;
        POINT.y = 9;
        mutatePrimitive(arrayIndex);
        System.out.println(arrayIndex);
        mutateObject(POINT);
        System.out.println(POINT);

        WeekDay friday = WeekDay.FRIDAY;
        boolean isWorking = friday.isHoliday;
        String dayName = friday.name();
        int order = friday.ordinal();
        System.out.println(dayName + order);
        WeekDay[] weekDays = WeekDay.values();
        WeekDay randomDay = weekDays[NumberUtils.getRandom(0, weekDays.length)];
        System.out.println(randomDay.name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your free-style line...");
        String input = scanner.nextLine();
        System.out.println("You input: " + input);
        int intInput = scanner.nextInt();
        System.out.println("You input: " + input);
    }

    public static void mutatePrimitive(int a) {
        a = a + 8;
    }

    public static void mutateObject(Point p) {
        p.x = 8;
        p = new Point(5, 5);
    }
}

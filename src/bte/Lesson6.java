package bte;

import bte.model.Point;
import bte.model.Triangle;
import bte.util.WeekDay;

import java.util.Scanner;

import static bte.util.NumberUtils.getRandom;
import static bte.util.Print.print;

public class Lesson6 {
    public static void main(String[] args) {
        //System.out.println();
        //Circle circle = new Circle(5);

        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);

        Triangle triangle = new Triangle(a, b, c);
        double perimeter = triangle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);



        final int ARRAY_INDEX = 5;

        final Point POINT = new Point(4, 4);
//        POINT.x = 9;
//        POINT.y = 9;
        //POINT = new Point(7,7);
        int arrayIndex = 5;
        mutaterPrimitive(arrayIndex);
        System.out.println(arrayIndex);
        mutatedObject(POINT);
        System.out.println(POINT);

        WeekDay friday = WeekDay.FRIDAY;
        boolean isHoliday = friday.isHoliday();
        String dayName = friday.getName();
        int order = friday.ordinal();
        System.out.println(dayName + order);
        WeekDay[] weekDays = WeekDay.values();
        WeekDay randomDay = weekDays[getRandom(0, weekDays.length)];
        System.out.println(randomDay.getName());

        Scanner scanner = new Scanner(System.in);
        print("Please input your freestyle line ");
        String input = scanner.nextLine();
        print("Your input: " + input);
    }


    public static void mutaterPrimitive(int a) {
        a = 8;

    }

    public static void mutatedObject(Point p) {
        p = new Point(5, 5);

    }
}

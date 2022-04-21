package bte;

import bte.Interface.SomeInterface;
import bte.Interface.SomeInterfaceImlp;
import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.pattern.iterator.Iterator;
import bte.pattern.iterator.IteratorContainer;
import bte.utils.ArrayUtils;

import java.lang.reflect.Array;
import java.time.*;
import java.util.Arrays;

import static bte.utils.ArrayUtils.printAndReturnFigureWithPerimeter;

public class Lesson11 {
    public static void main(String[] args) {
        //  SomeInterface instance = new SomeInterfaceImlp();
        SomeInterface instanceAnonymous = new SomeInterface() {
            @Override
            public void myMethod() {
                System.out.println("3");
            }

            @Override
            public void myMethodX() {
                System.out.println("3");
            }
        };

        var result = new SomeInterfaceImlp.Result(100, null);
        instanceAnonymous.myMethod();
        instanceAnonymous.myMethodX();

        SomeInterfaceImlp instance = new SomeInterfaceImlp(result);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDate localDateCustom = LocalDate.of(2000, 1, 20);
        System.out.println(localDateCustom);
        localDateCustom = localDateCustom.minusMonths(2);
        System.out.println(localDateCustom);
        LocalTime localTime = LocalTime.now();
        System.out.println("Time: " + localTime);
        LocalTime localTimeCustom = LocalTime.of(6, 40, 50, 500);
        System.out.println("Time: " + localTimeCustom);
        localTimeCustom = localTimeCustom.plusSeconds(700);
        System.out.println("Time after adding: " + localTimeCustom);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and Time:" + localDateTime);
        //  ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("SST"));
        System.out.println("From begin: " + System.currentTimeMillis());

        Point[] points = new Point[3];
        points[0] = new Point(1, 1);
        points[1] = new Point(2, 2);
        points[2] = new Point(3, 3);

        IteratorContainer<Point> iterator = new IteratorContainer(points);
        while (iterator.hasNext()) {

            Point item = iterator.next();
            System.out.println(item);
        }

        Integer[] integers = {1, 2, 3, 4};
        Iterator<Integer> iteratorInt = new IteratorContainer<>(integers);
        while (iteratorInt.hasNext()) {

            Integer item = iteratorInt.next();
            System.out.println(item);
        }

        ArrayUtils.printOutArray(points);
        ArrayUtils.printOutArray(integers);

        SimpleCircle circle = new SimpleCircle(5);
        var c = printAndReturnFigureWithPerimeter(circle);
        printAndReturnFigureWithPerimeter(circle);
        printAndReturnFigureWithPerimeter(points);
        printAndReturnFigureWithPerimeter(points[0]);
        c.getArea();
        int i = 0;
        Integer ii = 0;

        if (1 != 1) {
            Error someError = new Error("Epic fail");
            throw someError;

        }

        if (1 != 1) {
            RuntimeException re = new RuntimeException();
            throw re;

        }
    }
}

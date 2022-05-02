package bte;


import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;

import bte.pattern.iterator.IterableContainer;
import bte.pattern.iterator.Iterator;
import bte.util.ArrayUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static bte.util.ArrayUtils.printAndReturnFigureWithPerimeter;

public class Lesson11 {
    public static void main(String[] args) throws Exception {
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

        instanceAnonymous.myMethod();
        instanceAnonymous.myMethodX();
        SomeInterface instanceAnonymous4 = new SomeInterface() {
            @Override
            public void myMethod() {
                System.out.println("4");
            }

            @Override
            public void myMethodX() {
                System.out.println("4");
            }
        };
        var result = new SomeInterfaceImpl.Result(100, null);
        instanceAnonymous4.myMethod();
        instanceAnonymous4.myMethodX();

        SomeInterfaceImpl instance = new SomeInterfaceImpl(result);

        //LocalDate localDate = LocalDate.now();
        LocalDate localDateCustom = LocalDate.of(2000, 1, 20);
        System.out.println(localDateCustom);
        localDateCustom = localDateCustom.minusMonths(3);
        System.out.println(localDateCustom);
        LocalTime localTime = LocalTime.now();
        System.out.println("Time: " + localTime);
        LocalTime localTimeCustom = LocalTime.of(6, 40, 50, 500);
        System.out.println("Time custom: " + localTimeCustom);
        localTimeCustom = localTimeCustom.plusSeconds(700);
        System.out.println("Time custom after adding: " + localTimeCustom);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Date and Time: " + localDateTime);
        //ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("SST"));
        System.out.println("From begin: " + System.currentTimeMillis());
        System.out.println("From begin: " + System.currentTimeMillis());

        Point[] points = new Point[3];
        points[0] = new Point(1, 1);
        points[1] = new Point(2, 2);
        points[2] = new Point(3, 3);

        Iterator<Point> iterator = new IterableContainer(points);
        while (iterator.hasNext()) {
            Point item = iterator.next();
            System.out.println(item);
        }
        Integer[] integers = {1, 2, 3, 4};
        Iterator<Integer> iteratorInt = new IterableContainer<>(integers);
        while (iteratorInt.hasNext()) {
            Integer item = iteratorInt.next();
            System.out.println(item);
        }

        ArrayUtils.printOutArray(points);

        SimpleCircle circle = new SimpleCircle(5);
        var c = printAndReturnFigureWithPerimeter(circle);
        var c1 = printAndReturnFigureWithPerimeter(new SimpleTriangle(9, 9, 9));
        var c2 = printAndReturnFigureWithPerimeter(new SimpleRectangle(5, 5));
        int i = 0;
        Integer ii = 0;
        // i = null;
        ii = null;

        int[] iii = {Integer.valueOf(6), 6};
        Integer fromString = Integer.valueOf("6767");
        System.out.println(fromString);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        BigDecimal big = new BigDecimal("1111111111111111111111111111111111.111");
        BigDecimal big1 = new BigDecimal("22222222222222222222222222222222.222");

        if (1 != 1) {
            final Error someError = new Error("Epic fail");
            throw someError;
        }

        if (1 != 1) {
            RuntimeException re = new RuntimeException();
            throw re;
        }


        try {

        } catch (Exception e) {
            System.out.println("Exception " + e + "handled!");
        }


        big = big.add(big1);
        System.out.println(big);
        someMeth();

    }

    private static void someMeth() throws Exception {

        throw new Exception();

    }
}

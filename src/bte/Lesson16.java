package bte;

import bte.model.Circle;
import bte.model.simple.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static bte.HomeWorkLesson5.getRandom;
import static bte.utils.CircleUtils.getCircleMap;

public class Lesson16 {
    public static void main(String[] args) {
        SimpleTriangleSideAComparator comparator = new SimpleTriangleSideAComparator();
        Comparator<SimpleTriangle> sideBComparator = new Comparator<SimpleTriangle>() {
            @Override
            public int compare(SimpleTriangle o1, SimpleTriangle o2) {
                return o1.getB() - o2.getB();
            }
        };
        //Lambda
        Set<SimpleTriangle> treeTriangleSet = new TreeSet<>((a1, a2) -> a1.getB() - a2.getB());
        // Set<SimpleTriangle> treeTriangleSet2 = new TreeSet<>(sideBComparator);
        BtaFunction btaFunction = new BtaFunction() {
            @Override
            public void print(SimpleCircle circle) {
                System.out.println(circle);
            }
        };
        btaFunction.print(new SimpleCircle());
        BtaFunction btaFunctionLambda = c -> System.out.println(c);
        btaFunctionLambda.print((new SimpleCircle()));
        BtaLambdaComplex lambdaComplex = (Integer i, Double d) -> {
            System.out.println("Starting complex lambda ...");
            return (int) (i + d);
        };

        Consumer<SimpleCircle> simpleCircleConsumer = c -> System.out.println("Circle has a perimeter = " + c.getPerimeter());
        System.out.println("AAA");
        simpleCircleConsumer.accept(new SimpleCircle());
        SimpleCircle simpleCircle = new SimpleCircle();
        makeSimpleCircleConsumption(c -> System.out.println("Circle has a perimeter = " + c.getPerimeter()), simpleCircle);
        makeSimpleCircleConsumption(c -> System.out.println("Circle has a perimeter = " + c.getArea()), simpleCircle);

        supplySimpleTriangle(() -> new SimpleTriangle(1, 1, 1));
        supplySimpleTriangle(() -> new SimpleTriangle(5, 5, 5));
        supplySimpleTriangle(() -> new SimpleTriangle(5, 5, 5));
        supplySimpleTriangle(() -> {
            int a = getRandom(2, 3);
            int b = getRandom(2, 3);
            int c = getRandom(2, 3);
            return new SimpleTriangle(a, b, c);
        });
        Double perimeter = makeSomeCalculation(c -> c.getPerimeter(), simpleCircle);
        Double area = makeSomeCalculation(c -> c.getArea(), simpleCircle);
        final Map<Integer, Circle> circleMap = getCircleMap(50);
        Collection<Circle> circles = circleMap.values();
        for (Circle circle : circles) {
            if (circle.getRadius() < 50) {
                System.out.println(circle);
            }
        }

        circleMap.values().stream()
                .filter(c -> c.getRadius() < 50)
                .peek(c -> System.out.println(c.getArea()))
                .filter(c -> c.getRadius() > 40)
                .peek(c -> System.out.println(c.getRadius()))
                .forEach(Lesson16::myPrint);
        // Stream can be used only one time!!!
        //final long count = stream.count();
        final Predicate<Integer> predicateOne = item -> item > 0;
        final Predicate<Integer> predicateEven = item -> item % 2 == 0;
        long elementsCount = Stream.generate(() -> getRandom(-100, 100))
                .limit(100)
                .filter(predicateOne.and(predicateEven))
                .count();

        System.out.println("Positive even elements count = " + elementsCount);


        long circleCount = Stream.generate(() -> new SimpleCircle(getRandom(100, 500)))
                .limit(50)
                .filter(circle -> circle.getRadius() % 5 == 0)
                .count();
        System.out.println("Circle that multiply by 5 count is: " + circleCount);
    }

    private static void myPrint(Circle circle) {
        System.out.println("My printer");
        System.out.println("Circle: " + circle);
    }

    private static Double makeSomeCalculation(Function<SimpleCircle, Double> function, SimpleCircle object) {
        return function.apply(object);
    }

    private static <T> T supplySimpleTriangle(Supplier<T> supplier) {
        return supplier.get();
    }

    private static void makeSimpleCircleConsumption(Consumer<SimpleCircle> consumer, SimpleCircle circle) {
        consumer.accept(circle);
    }

    private static void printPerimeter(SimpleCircle circle) {
        System.out.println("Circle has a perimeter = " + circle.getPerimeter());
    }

    private static void printArea(SimpleCircle circle) {
        System.out.println("Circle has a area = " + circle.getArea());
    }
}

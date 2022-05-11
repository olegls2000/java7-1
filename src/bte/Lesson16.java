package bte;

import bte.model.Circle;
import bte.model.simple.*;
import bte.util.NumberUtils;
import bte.util.Print;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static bte.util.CircleUtils.getCircles;
import static bte.util.Print.print;

public class Lesson16 {
    public static void main(String[] args) {
        SimpleTriangleSideAComparator comparator = new SimpleTriangleSideAComparator();
        //YAGNI
        Comparator<SimpleTriangle> sideBComparator = new Comparator<SimpleTriangle>() {
            @Override
            public int compare(SimpleTriangle o1, SimpleTriangle o2) {
                return o1.getB() - o2.getB();
            }
        };
        //Lambda
        Set<SimpleTriangle> treeTriangleSet = new TreeSet<>((o1, o2) -> o1.getB() - o2.getB());


        BtaFunction btaFunction = new BtaFunction() {
            @Override
            public void print(SimpleCircle circle) {
                //print(circle);
            }
        };


        btaFunction.print(new SimpleCircle());
        //BtaFunction btaFunctionLambda = (SimpleCircle circle) -> {print(circle);};
        BtaFunction btaFunctionLambda = c -> print(c);
        btaFunctionLambda.print(new SimpleCircle());

        BtaLambdaComplex lambdaComplex = (i, d) -> {
            print("Starting complex lambda");
            return (int) (i + d);
        };

        Consumer<SimpleCircle> simpleCircleConsumer =
                c -> print("Circle has a perimeter = " + c.getPerimeter());
        simpleCircleConsumer.accept(new SimpleCircle());
        print("AÀ");
        SimpleCircle simpleCircle = new SimpleCircle();
        // В make передаём поведение
        makeSimpleCircleConsumption(
                (SimpleCircle c) -> print("Circle has a perimeter: " + c.getPerimeter()),
                simpleCircle);
        makeSimpleCircleConsumption(
                (SimpleCircle c) -> print("Circle has an area: " + c.getArea()),
                simpleCircle);
        SimpleTriangle tr = supplySimpleTriangle(() -> new SimpleTriangle(1, 1, 1));
        tr = supplySimpleTriangle(() -> new SimpleTriangle(5, 5, 5));
        tr = supplySimpleTriangle(() -> {
            int a = NumberUtils.getRandom(2, 3);
            int b = NumberUtils.getRandom(2, 3);
            int c = NumberUtils.getRandom(2, 3);
            return new SimpleTriangle(a, b, c);
        });

        Double perimeter = makeSomeCalculation(c -> c.getPerimeter(), simpleCircle);
        Double area = makeSomeCalculation(c -> c.getArea(), simpleCircle);

        final Map<Integer, Circle> circlesMap = getCircles(50);
        Collection<Circle> circles = circlesMap.values();

        for (Circle circle : circles) {
            if (circle.getRadius() < 50) {
                print(circle);
            }
        }

        circlesMap.values().stream().filter(
                        c -> c.getRadius() < 50)
                .peek(c -> print(c.getArea()))
                .filter(c -> c.getRadius() > 40)
                .peek(c -> print(c.getRadius()))
                // .forEach(c->print(c));
                .forEach(Print::print);
        //Если создали стрим и вызвали терминальную операцию, то вторую вызвать невозможно.
        final Predicate<Integer> predicateOne = item -> item > 0;
        final Predicate<Integer> predicateEven = item -> item % 2 == 0;

        Stream.generate(() -> new SimpleCircle(NumberUtils.getRandom(100, 500)))
                .limit(50)
                .filter(circle -> circle.getRadius() % 5 == 0).peek(q -> print(q))
                .count();


        print(Stream.generate(() -> NumberUtils.getRandom(-100, 100))
                .limit(100)
                //.filter(item -> (item & 1) != 0)
                .filter(predicateOne.and(predicateEven))
                .peek(item -> print(item))
                .count());

        //50 circles


    }

    private static Double makeSomeCalculation(Function<SimpleCircle, Double> function, SimpleCircle object) {
        return function.apply(object);
    }

    private static SimpleTriangle supplySimpleTriangle(Supplier<SimpleTriangle> supplier) {
        return supplier.get();
    }


    //Акцептит данные
    private static void makeSimpleCircleConsumption(
            Consumer<SimpleCircle> consumer, SimpleCircle circle) {
        consumer.accept(circle);
    }


    private static void printPerimeter(SimpleCircle circle) {
        print("Circle has a perimeter: " + circle.getPerimeter());

    }

    private static void printAre(SimpleCircle circle) {
        print("Circle has an are: " + circle.getArea());
    }
}

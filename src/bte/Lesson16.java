package bte;

import bte.model.Circle;
import bte.model.simple.*;
import bte.util.CircleUtils;
import bte.util.NumberUtils;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Lesson16 {
    public static void main(String[] args) {
        SimpleTriangleSideAComparator comparator = new SimpleTriangleSideAComparator();
        //YAGNI
   /*     Comparator<SimpleTriangle> sideBComparator= new Comparator<>() {
            @Override
            public int compare(SimpleTriangle o1, SimpleTriangle o2) {
                return o1.getB()-o2.getB();
            }
        };

    */
        Comparator<SimpleTriangle> sideBComparator = (o1, o2) -> o1.getB() - o2.getB();
        Set<SimpleTriangle> treeTriangleSet = new TreeSet<>();

        Set<SimpleTriangle> treeTriangleSet2 = new TreeSet<>(sideBComparator);
        Set<SimpleTriangle> treeTriangleSet23 = new TreeSet<>((o1, o2) -> o1.getB() - o2.getB());
        BtaFunction btaFunction = new BtaFunction() {
            @Override
            public void print(SimpleCircle circle) {
                System.out.println(circle);
            }
        };
        btaFunction.print(new SimpleCircle());

        BtaFunction btaFunctionLambda = circle -> System.out.println(circle);
        btaFunctionLambda.print(new SimpleCircle());
        BtaLambdaComplex lambdaComplex0 = (a, b) -> a;
        BtaLambdaComplex lambdaComplex = (a, b) -> (int) (a + b);

        Consumer<SimpleCircle> simpleCircleConsumer = c ->
                System.out.println("Circle has a perimeter = " + c.getPerimeter());
        simpleCircleConsumer.accept(new SimpleCircle());
        SimpleCircle simpleCircle = new SimpleCircle();
        makeSimpleCircleConsumption(
                c -> System.out.println("Circle has a perimeter = " + c.getPerimeter()),
                simpleCircle);
        makeSimpleCircleConsumption(
                c -> System.out.println("Circle has a area = " + c.getSquare()),
                simpleCircle);


        //  Supplier<SimpleTriangle> triangleSupplier =()-> new SimpleTriangle(1,1,1);

        final SimpleTriangle simpleTriangle = supplySimpleTriangle(() -> new SimpleTriangle(1, 1, 1));

/*        final SimpleTriangle tr = supplySimpleTriangle(() -> {
            final int a = NumberUtils.getRandomValue(2, 3);
            return new SimpleTriangle(a, 1, 1);
        });

 */
        Double perimeter = makeSomeCalculation(c -> c.getPerimeter(), simpleCircle);
        Double area = makeSomeCalculation(c -> c.getSquare(), simpleCircle);

        final Map<Integer, Circle> circlesMap = CircleUtils.getCircles2(1000);
        final Collection<Circle> circles = circlesMap.values();
        for (Circle circle : circles) {
            if (circle.getRadius() < 50) {
                System.out.println(circle);
            }
        }

        circlesMap.values()
                .stream()
                .filter(c -> c.getRadius() > 50)
                .peek(c -> System.out.println(c.getArea()))
                .filter(c -> c.getRadius() > 40)
                .peek(c -> System.out.println(c.getCenter()))
                .forEach(System.out::println);
        Predicate<Integer> predicate1 = c -> c > 0;
        Predicate<Integer> predicate2 = c -> c % 2 == 0;
        Stream.generate(() -> NumberUtils.getRandomValue(-100, 100))
                .limit(100)
                //          .filter(c-> c > 0 && c%2 ==0)
                .filter(predicate1.and(predicate2))
                //          .forEach(item -> System.out.println(item));
                .peek(System.out::println)
                .count();

        System.out.println("Positive even numbers " + Stream.generate(() -> NumberUtils.getRandomValue(-100, 100))
                .limit(100)
                //          .filter(c-> c > 0 && c%2 ==0)
                .filter(predicate1.and(predicate2))
                //          .forEach(item -> System.out.println(item));
                .peek(System.out::println)
                .count());
        System.out.println();
        final long count = Stream.generate(() -> new SimpleCircle(NumberUtils.getRandomValue(100, 500)))
                .limit(50)
                //         .peek(System.out::println)
                .filter(c -> c.getRadius() % 5 == 0)
                .peek(System.out::println)
                .count();

        System.out.println("Circle count " + count);


    }

    private static Double makeSomeCalculation(Function<SimpleCircle, Double> function, SimpleCircle object) {
        return function.apply(object);
    }

    private static <T> T supply(Supplier<T> supplier) {
        return supplier.get();
    }

    private static SimpleTriangle supplySimpleTriangle(Supplier<SimpleTriangle> supplier) {
        return supplier.get();
    }


    private static void makeSimpleCircleConsumption(Consumer<SimpleCircle> consumer, SimpleCircle circle) {
        consumer.accept(circle);
    }

    private static void printPerimeter(@NotNull SimpleCircle circle) {
        System.out.println("Circle has a perimeter = " + circle.getPerimeter());
    }

    private static void printArea(@NotNull SimpleCircle circle) {
        System.out.println("Circle has a area = " + circle.getSquare());
    }
}


import bte.model.Circle;
import bte.model.simple.*;
import bte.util.NumberUtils;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import static bte.util.CircleUtils.getCircles;

public class Lesson16 {
    public static void main(String[] args) {
        SimpleTriangleSideAComparator comparator = new SimpleTriangleSideAComparator();
        //YAGNI

/*        Comparator<SimpleTriangle> sideBComparator = new Comparator<SimpleTriangle>() {
            @Override
            public int compare(SimpleTriangle o1, SimpleTriangle o2) {
                return o1.getB() - o2.getB();
            }
        };*/
        //Lambda
        Set<SimpleTriangle> treeTriangleSet = new TreeSet<>((o1, o2) -> o1.getB() - o2.getB());
        //Set<SimpleTriangle> treeTriangleSet2 = new TreeSet<>(sideBComparator);
        BtaFunction btaFunction = new BtaFunction() {
            @Override
            public void print(SimpleCircle circle) {
                System.out.println(circle);
                System.out.println(circle);
                System.out.println(circle);
            }
        };

        btaFunction.print(new SimpleCircle());
        BtaFunction btaFunctionLambda = c -> System.out.println(c);
        btaFunctionLambda.print(new SimpleCircle());
        BtaLambdaComplex lambdaComplex = (i, d) -> {
            System.out.println("Starting complex lambda ...");
            return (int) (i + d);
        };
        Consumer<SimpleCircle> simpleCircleConsumer =
                c -> System.out.println("Circle has a perimeter = " + c.getPerimeter());
        System.out.println("AAA");
        simpleCircleConsumer.accept(new SimpleCircle());
        SimpleCircle simpleCircle = new SimpleCircle();
        makeSimpleCircleConsumption(
                c -> System.out.println("Circle has a perimeter = " + c.getPerimeter()),
                simpleCircle);
        makeSimpleCircleConsumption(
                c -> System.out.println("Circle has an area = " + c.getArea()),
                simpleCircle);
        SimpleTriangle tr = supplySimpleTriangle(() -> new SimpleTriangle(1, 1, 1));
        tr = supplySimpleTriangle(() -> new SimpleTriangle(5, 5, 5));
        tr = supplySimpleTriangle(() -> {
            final int a = NumberUtils.getRandom(2, 3);
            final int b = NumberUtils.getRandom(2, 3);
            final int c = NumberUtils.getRandom(2, 3);
            return new SimpleTriangle(a, b, c);
        });
        Double perimeter = makeSomeCalculation(c -> c.getPerimeter(), simpleCircle);
        Double area = makeSomeCalculation(c -> c.getArea(), simpleCircle);

        final Map<Integer, Circle> circlesMap = getCircles(10);
        Collection<Circle> circles = circlesMap.values();
        for (Circle circle : circles) {
            if (circle.getRadius() < 50) {
                System.out.println(circle);
            }
        }

        circlesMap.values().stream()
                .filter(c -> c.getRadius() < 50)
                .peek(c -> System.out.println(c.getArea()))
                .filter(c -> c.getRadius() > 40)
                .peek(c -> System.out.println(c.getRadius()))
                //.forEach(c-> System.out.println(c));
                .forEach(Lesson16::myPrint);
        //Stream can be used only one time!!!
        //final long count = stream.count();
        final Predicate<Integer> predicateOne = t -> t > 0;
        final Predicate<Integer> predicateEven = item -> item % 2 == 0;
        System.out.println("Positive even elements count = " +
                Stream.generate(() -> NumberUtils.getRandom(-100, 100))
                        .limit(100)
                        .filter(predicateOne.and(predicateEven))
                        .peek(item -> System.out.println(item))
                        .count());
//generate Stream 50 SimpleCircles, where radius (100 .. 500),
// count for circles with Radius multiply 5
        long circleCount = Stream.generate(() -> new SimpleCircle(
                        NumberUtils.getRandom(100, 500)))
                .limit(50)
                .filter(c -> c.getRadius() % 5 == 0)
                .peek(q -> System.out.println(q))
                .count();


        System.out.println("Circle count: " + circleCount);
    }

    private static void myPrint(Circle circle) {
        System.out.println("My printer");
        System.out.println("Circle: " + circle);
    }

    private static Double makeSomeCalculation(Function<SimpleCircle, Double> function,
                                              SimpleCircle object) {
        return function.apply(object);
    }

    private static <T> T supplySimpleTriangle(Supplier<T> supplier) {
        return supplier.get();
    }

    private static void makeSimpleCircleConsumption(
            Consumer<SimpleCircle> consumer, SimpleCircle circle) {
        consumer.accept(circle);
    }

    private static void printPerimeter(SimpleCircle circle) {
        System.out.println("Circle has a perimeter = " + circle.getPerimeter());
    }

    private static void printArea(SimpleCircle circle) {
        System.out.println("Circle has an area = " + circle.getArea());
    }
}
package bte;

import bte.model.Circle;
import bte.model.Point;
import bte.util.CircleUtils;

import java.util.Optional;
import java.util.stream.Stream;

public class Lesson17 {
    public static void main(String[] args) {
        //calculate  sum of circles radius where perimeter  < 50;
        double summ = Stream.generate(CircleUtils::getCircle).limit(10)
                .filter(circle -> circle.getLength() < 50)
                .mapToDouble(Circle::getRadius)
                .sum();

        /* Optional<Integer> summViaReduce = */
        Stream.generate(CircleUtils::getCircle).limit(100)
                .filter(circle -> circle.getLength() < -50)
                .map(circle -> circle.getRadius())
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(value -> System.out.println("Summ is : " + value));

        //Circle circle = CircleUtils.getCircle();
        Circle circle = null;
        double length = 0;
        if (circle != null) {
            length = circle.getLength();
        }
        System.out.println("Circle length:" + length);

        Optional<Circle> circleOptional = Optional.ofNullable(circle);
        //dangerous!!!!
        //final Circle fromOptional = circleOptional.get();

        //safe
        circleOptional.ifPresent(value -> System.out.println("Value in optional is: " + value.getArea()));
        Circle circleWithDefault = circleOptional
                .orElse(new Circle(7, new Point(3, 3)));

        Circle circleWithSupplier = circleOptional
                .orElseGet(() -> new Circle(7, new Point(3, 3)));

        circleOptional.orElseThrow(() -> new RuntimeException("Optional doesn't contain Circle!!"));


               /* .ifPresentOrElse(v -> System.out.println("Circle length:" + v.getLength()),
                        () -> System.out.println("Optional is empty!"));*/




/*
calculate a count / (sum of areas)*  of circles that placed in the 2nd
quarter of coordinate system.


        -+ 2  |   ++ 1
        ------------
        -- 3  |   +- 4

*/
        Stream.generate(CircleUtils::getCircle).limit(100)
                .filter(c -> c.getCenter().getX() < 0 && c.getCenter().getY() > 0)
                .map(Circle::getArea)
                .reduce(Double::sum)
                .ifPresent(
                        value -> System.out.println("Total area in 2d quarter = " + value));

        //if in stream a circle from 4 th quarter?
        boolean isSmthIn4Quarter = Stream.generate(CircleUtils::getCircle)
                .limit(3)
                .anyMatch(c -> c.getCenter().getX() > 0 && c.getCenter().getY() < 0);
        //if in stream all circle from 4 th quarter?
        boolean isAllIn4Quarter = Stream.generate(CircleUtils::getCircle)
                .limit(3)
                .allMatch(c -> c.getCenter().getX() > 0 && c.getCenter().getY() < 0);

    }
}

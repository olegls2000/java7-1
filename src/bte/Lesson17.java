package bte;

import bte.model.Circle;
import bte.model.Point;
import bte.util.CircleUtils;

import java.util.Optional;
import java.util.stream.Stream;

public class Lesson17 {
    public static void main(String[] args) {
        double sum = Stream
                .generate(CircleUtils::getCircle).limit(10)
                .filter(circle -> circle.getLength() < 50)
                .mapToDouble(Circle::getRadius)
                .sum();


        /*Optional<Integer> sumViaReduce =*/ Stream
                .generate(CircleUtils::getCircle).limit(100)
                .filter(circle -> circle.getLength() < 50)
                .map(Circle::getRadius)
                //Reduce сужает до определенного значения.
                // Принимает бинарный оператор
                // Функция берет 2 типа объекта и принимает третий
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(value -> System.out.println("Summ is: " + value));


        Stream
                .generate(CircleUtils::getCircle).limit(100)
                .filter(c -> c.getCenter().getX()<0 && c.getCenter().getY()>0 )
                .map(Circle::getArea)
                .reduce(Double::sum)
                .ifPresent(value -> System.out.println("Total area in 2d quarter = " + value));



        Circle circle = null;
        double length = 0;
        if (circle != null) {
            length = circle.getLength();
        }
        System.out.println("Circle length " + length);


        Optional<Circle>circleOptional = Optional.ofNullable(circle);
        //final Circle fromOptional = circleOptional.get();//DANGEROUS!!
        circleOptional.ifPresent(value -> System.out.println("Value in optional is: " + value.getArea()));
        Circle circleWithDefault = circleOptional
                .orElse(new Circle(7,new Point(3,3)));
        Circle circleWithSupplier = circleOptional
                .orElseGet(()->new Circle(7,new Point(3,3)));

        circleOptional.orElseThrow(() -> new RuntimeException("Optional doesn't contain Circle!!"));


//        .ofNullable(CircleUtils.getCircle())
//                .ifPresentOrElse(v -> System.out.println
//                        ("Circle length: " + v.getLength()),
//                        () -> System.out.println("optional is empty"));
    }
}

package bte.util;

import bte.model.Circle;
import bte.model.Point;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static bte.util.NumberUtils.getRandom;

public class CircleUtils {
    public static final float PI = 3.14f;

    public Circle getDistance(Circle[] circles) {
        Circle closest = circles[0];
        final Point zero = new Point(0, 0);

        for (Circle circle : circles) {
            final double distance = PointUtils.getDistance(circle.getCenter(), zero);
            double minDistance = PointUtils.getDistance(closest.getCenter(), zero);
            if (distance < minDistance) {
                closest = circle;
            }

        }

        return closest;
    }

    public static Map<Integer, Circle> getCircles(int count) {
        Map<Integer, Circle> result = new ConcurrentHashMap<>();
        for (int i = 0; i < count; i++) {

            final Circle circle = getCircle();
            result.put(circle.getRadius(), circle);
        }
        return result;

    }

    public static Circle getCircle() {
        final Point center = new Point(getRandom(2, 100), getRandom(2, 100));
        final int radius = getRandom(3, 70);
        return new Circle(radius, center);


    }
    public static Map<Integer, Circle> getCircleStreamBased ( int count){
        return Stream.generate(CircleUtils::getCircle).limit(count)
                .collect(Collectors.toMap(c -> c.getRadius(), Function.identity()));
    }

    public static Circle getCircleWithMaxRadius(List<Circle> circles) {
        Circle result = circles.get(0);
        for (Circle circle : circles) {
            if (circle.getArea() > result.getArea()) {
                result = circle;

            }

        }
        return result;
    }
}

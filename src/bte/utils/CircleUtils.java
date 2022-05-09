package bte.utils;

import bte.model.Circle;
import bte.model.Point;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static bte.utils.NumberUtils.getRandom;
import static bte.utils.PointUtils.getDistance;

public class CircleUtils {

    public static final float PI = 3.14f;

    public static Circle[] getCircle(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            Point point = new Point(getRandom(0, 10), getRandom(0, 10));
            result[i] = new Circle(getRandom(3, 70), point);
        }
        return result;
    }

    public static Circle getCircleWithMaxArea(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle : circles) {
            if (circle.getArea() > result.getArea()) {
                result = circle;
            }
        }
        return result;
    }

    public static double distance(Point a, Point b) {
        return getDistance(a, b);
    }

    public static Circle closerToCenter(Circle[] circles) {
        Circle closest = circles[0];
        final Point zero = new Point(0, 0);
        for (Circle circle : circles) {
            final double distance = getDistance(circle.getCenter(), zero);
            double minDistance = getDistance(closest.getCenter(), zero);
            if (distance < minDistance) {
                closest = circle;
            }
        }
        return closest;
    }

    public static Map<Integer, Circle> getCircleMap(int count) {
        Map<Integer, Circle> result = new HashMap<>();
        for (int i = 0; i < count; i++) {
            final int radius = getRandom(3, 70);
            Point point = new Point(getRandom(0, 10), getRandom(0, 10));
            Circle circle = new Circle(radius, point);
            result.put(radius, circle);
        }
        return result;
    }

    private static Circle getCircle() {
        final int radius = getRandom(3, 70);
        Point point = new Point(getRandom(0, 10), getRandom(0, 10));
        return new Circle(radius, point);
    }

    public static Map<Integer, Circle> getCircleMapStreamBased(int count) {
        return Stream.generate(CircleUtils::getCircle)
                .limit(count)
                .collect(Collectors.toMap(c -> c.getRadius(), Function.identity()));
    }
}

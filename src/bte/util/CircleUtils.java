package bte.util;

import bte.model.Circle;
import bte.model.Point;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
            final Point center = new Point(getRandom(2, 100), getRandom(2, 100));
            final int radius = getRandom(3, 70);
            final Circle circle = new Circle(radius, center);
            result.put(radius, circle);
        }
        return result;

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

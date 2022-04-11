package bte.util;

import bte.model.Circle;
import bte.model.Point;

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

    public static Circle[] getCircles(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            Point center = new Point(getRandom(2, 100), getRandom(2, 100));
            result[i] = new Circle(getRandom(1, 100), center);

        }
        return result;

    }

    public static Circle getCircleWithMaxRadius(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle : circles) {
            if (circle.getArea() > result.getArea()) {
                result = circle;

            }

        }
        return result;
    }
}

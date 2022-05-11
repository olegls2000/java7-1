package bte.util;

import bte.model.Circle;
import bte.model.Point;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static bte.util.NumberUtils.getRandomValue;
import static bte.util.PointUtils.getDistance;

public class CircleUtils {
    public static Circle[] getCircles(int count, int from, int to) {
        Circle[] circles = new Circle[count];
        for (int i = 0; i < circles.length; i++) {
            Point center=new Point(getRandomValue(1, 20), getRandomValue(1, 20));
            circles[i] = new Circle(getRandomValue(from, to),center);
        }
        return circles;
    }

    public static double getDistanceBetweenCenters(Circle circle1, Circle circle2) {
        return getDistance(circle1.getCenter(), circle2.getCenter());
    }

    public static Circle closerToCenter(Circle[] circles) {
        final Point coordinateCenter = new Point(0, 0);
        int iMin = 0;
        double min = 0, current;
        for (int i = 0; i < circles.length; i++) {

            current = getDistance(circles[i].getCenter(), coordinateCenter);
            if (i == 0 || current < min) {
                min = current;
                iMin = i;
            }
        }
        return circles[iMin];
    }


    public static Circle[] getCircles(int count) {
        Circle[] circles = new Circle[count];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(getRandomValue(40, 80));
        }
        return circles;
    }

    public static Map<Integer, Circle> getCircles2(int count) {

        final Map<Integer, Circle> result = new ConcurrentHashMap<Integer, Circle>();
        for (int i = 0; i < count; i++) {

            final Circle circle = getCircle();
            result.put(circle.getRadius(), circle);
        }
        return result;
    }

    private static Circle getCircle() {
        final var center = new Point(getRandomValue(-100, 100),
                getRandomValue(-100, 100));
        final var radius = getRandomValue(3, 70);
       return new Circle(radius, center);
    }
    public static Map<Integer, Circle> getCirclesStreamBased(int count) {
       return  Stream.generate(CircleUtils::getCircle)
                .limit(count)
                .collect(Collectors.toMap(c->c.getRadius(), Function.identity()));
    }

        public static Circle getCircleWithMaxArea(Circle[] circles) {
        Circle crlMax = circles[0];
        for (Circle c : circles) {
            if (c.getArea() > crlMax.getArea()) {
                crlMax = c;
            }

        }
        return crlMax;
    }

    public static Circle getCircleWithMinLength(Circle[] circles) {
        Circle crlMinLen = circles[0];
        for (Circle c : circles) {
            if (c.getLength() < crlMinLen.getLength()) {
                crlMinLen = c;
            }

        }
        return crlMinLen;
    }
}

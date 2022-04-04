package bte.util;

import bte.model.Circle;
import bte.model.Point;

import static bte.util.PointUtils.getDistance;

public class CircleUtils {
    public static Circle[] getCircles(int count, int from, int to) {
        Circle[] circles = new Circle[count];
        for (int i = 0; i < circles.length; i++) {
            Point center=new Point(NumberUtils.getRandomValue(1, 20),NumberUtils.getRandomValue(1, 20));
            circles[i] = new Circle(NumberUtils.getRandomValue(from, to),center);
        }
        return circles;
    }

    public static double getDistanceBetweenCenters(Circle circle1, Circle circle2) {
        return getDistance(circle1.center, circle2.center);
    }

    public static Circle closerToCenter(Circle[] circles) {
        Point coordinateCenter = new Point(0, 0);
        int iMin = 0;
        double min = 0, current;
        for (int i = 0; i < circles.length; i++) {

            current = getDistance(circles[i].center, coordinateCenter);
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
            circles[i] = new Circle(NumberUtils.getRandomValue(40, 80));
        }
        return circles;
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

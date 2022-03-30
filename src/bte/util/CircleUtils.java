package bte.util;

import bte.model.Circle;

public class CircleUtils {

    public static final float PI = 3.14f;

    public static Circle[] getCircles(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            result[i] = new Circle(NumberUtils.getRandom(3, 70));
        }
        return result;
    }

    public static Circle getCirceWithMaxArea(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle : circles) {
            if (circle.getArea() > result.getArea()) {
                result = circle;
            }
        }
        return result;
    }
}

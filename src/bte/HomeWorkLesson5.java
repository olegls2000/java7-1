package bte;

import bte.model.Circle;
import bte.model.Point;

public class HomeWorkLesson5 {
    public static void main(String[] args) {
        Circle[] circles = generateCircles(30);
        Circle minLength = getCircleWithMinLength(circles);
        System.out.println(minLength.getLength() + " " + minLength.getRadius());
    }


    public static Circle getCircleWithMinLength(Circle[] circles) {
        Circle result = circles[0];
        for (Circle circle : circles) {
            if (circle.getLength() < result.getLength())
                result = circle;
        }

        return result;
    }

    public static Circle[] generateCircles(int count) {
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++) {
            Point center = new Point(getRandom(0,10), getRandom(0,10));
            result[i] = new Circle(getRandom(2, 600), center);
        }
        return result;
    }

    public static int getRandom(int a, int b) {
        return (int) (Math.random() * (b - a)) + a;
    }
}

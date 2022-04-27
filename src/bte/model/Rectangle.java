package bte.model;

import static bte.utils.PointUtils.getDistance;

public class Rectangle {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double calculatePerimeter() {
        return getDistance(a, b) +
                getDistance(b, c) +
                getDistance(c, d) +
                getDistance(d, a);
    }

    public double calculateArea() {
        return getDistance(a, b) * getDistance(b, c);
    }
}

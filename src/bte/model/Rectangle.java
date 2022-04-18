package bte.model;

import static bte.util.PointUtils.getDistance;

public class Rectangle {
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double calculatePerimeter() {
        return 2 * getDistance(b, a) + 2 * getDistance(b, c);
    }

    public double calculateArea() {
        return getDistance(b, a) * getDistance(b, c);
    }
}

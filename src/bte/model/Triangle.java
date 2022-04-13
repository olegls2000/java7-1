package bte.model;

import static bte.utils.PointUtils.getDistance;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return getDistance(a, b) +
                getDistance(b, c) +
                getDistance(a, c);
    }
}

package bte.model;

import bte.util.PointUtils;

import static bte.util.PointUtils.getDistance;

public class Triangle {

    public final static int TRIANGLE_CONSTANT = 5;

    public Point a;
    public Point b;
    public Point c;

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

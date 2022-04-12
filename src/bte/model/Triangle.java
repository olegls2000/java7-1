package bte.model;

import bte.util.PointUtils;

public class Triangle {
    public final int TRIANGLE_CONSTANT = 5;

    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter(){

        return PointUtils.getDistance(a, b) +
                PointUtils.getDistance(b, c) +
                PointUtils.getDistance(a, c);
    }
}

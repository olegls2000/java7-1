package bte.model;


import static bte.util.PointUtils.getDistance;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter(Point a, Point b, Point c) {
       return  getDistance(b,a) +
               getDistance(b,c) +
               getDistance(c,a);

    }

}

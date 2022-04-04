package bte.model;


import static bte.util.PointUtils.getDistance;

public class Triangle {
    public Point a;
    public Point b;
    public Point c;

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

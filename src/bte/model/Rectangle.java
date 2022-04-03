package bte.model;

import static bte.util.PointUtils.getDistance;

//Crete a class Rectangle that consists of 4 Points.
// Implement in Rectangle two methods: calculatePerimeter() and calculateArea().
// Create 100 Rectangle
// Objects and find a rectangle with the smallest area and perimeter.
public class Rectangle {
    public Point a;
    public Point b;
    public Point c;
    public Point d;

    public Rectangle(Point a, Point b) {//Point c, Point d)
        this.a = a;
        this.b = b;
//        this.c = c;
//        this.d = d;

    }

    public double getPerimeter() {
//        return getDistance(a, b)
//                + getDistance(b, c)
//                + getDistance(c, d)
//                + getDistance(d, a);
        return 2 * (getDistance(a, b) + getDistance(b, c));
    }

    public double getArea() {
        return getDistance(a, b) * getDistance(b, c);

    }

}

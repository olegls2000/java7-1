package bte.model;

import static bte.util.CircleUtils.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

//40 .. 100 -> 4 obj. find with max area
// "bte.Circle with the biggest area: XXX with radius: XXX"
public class Circle {
    private int radius;
    private Point center;

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void move(int xDelta, int yDelta) {
 /*       this.center.x = this.center.x + xDelta;
        this.center.y = this.center.y + yDelta;*/
    }


    {
        out.println("Instance initialisation block");
    }

    public Circle(int radius, Point point) {
        out.println("Constructor initialisation block");
        this.radius = radius;
        this.center = point;
    }

    public double getArea() {
        return PI * pow(radius, 2);
    }

    public double getLength() {
        return 2* PI * radius;
    }
    static {
        out.println("Static initialisation block");
    }

}

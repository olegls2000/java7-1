package bte.model;

import static bte.utils.CircleUtils.PI;
import static bte.utils.CircleUtils.distance;
import static bte.utils.NumberUtils.getRandom;
import static java.lang.Math.pow;

public class Circle {
    private int radius;
    private Point center;
    public Point newCenter;

    public int getRadius(){
        return  this.radius;
    }

    public void setRadius(int newRadius){
        this.radius=newRadius;
    }

    public Point getCenter(){
        return this.center=center;
    }

    public void setCenter(Point newPoint){
        this.center=newPoint;
    }

    public double getArea() {
        return PI * pow(radius, 2);
    }

    public Circle(int radius, Point point) {
        this.radius = radius;
        this.center = point;
    }


    public double getLength() {
        return 2 * PI * radius;
    }

    public void move(int xDelta, int yDelta) {
        newCenter = new Point(
                (xDelta + this.center.x),
                (yDelta + this.center.y));
        System.out.println(
                "Original center is xDelta:" + this.center.x +
                        " yDelta:" + this.center.y);
        System.out.println(
                "New center is xDelta:" + this.newCenter.x +
                        " yDelta:" + this.newCenter.y);
        System.out.println("Distance = " + distance(center, newCenter));
    }

    public Circle(Point center) {
        this.center = center;
        center = new Point(getRandom(0, 10), getRandom(0, 10));
    }

}

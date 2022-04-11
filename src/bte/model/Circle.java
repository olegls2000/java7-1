package bte.model;

import static bte.util.CircleUtils.PI;
import static java.lang.Math.pow;

// 40....100 -> 4 obj find with max area
//Add to the class Circle method: double getLength(){...}
// that calculates circles length. Generate 30 circles with radius
// from  range (2 .. 600) and find the circle with minimal length.
public class Circle {
    private int radius;
    private Point center;

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int newRadius){
        this.radius = newRadius;
    }
    public Point getCenter(){
        return this.center;
    }

    public void setCenter(Point newCenter) {
        this.center = newCenter;
    }
    public void move(int xDelta,int yDelta){
        this.center.x = this.center.x + xDelta;
        this.center.y = this.center.y + yDelta;
    }

//    {
//        System.out.println("Instance initialisation block");
//    }

    public Circle(int radius,Point point) {
        //System.out.println("Constructor initialisation block");
        this.radius = radius;
        this.center = point;
    }

    public double getArea() {
        return PI * pow(radius, 2);

    }


//    public double moveCircle(){
//
//    }
//static{
//    System.out.println("Static initialisation block");
//}

}

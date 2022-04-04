package bte.model;

public class Circle {
    {
        System.out.println("In initialization block");
    }

    static {
        System.out.println("In static initialization block");
    }

    public int radius;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Point center= new Point(0,0);

    public Circle(int radius) {
        System.out.println("In constructor");
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public void move(int lenX, int lenY) {
        System.out.println("Old center coordinates: " + "x = " + this.center.x + "y = " + this.center.y);
        this.center.x += lenX;
        this.center.y += lenY;
        System.out.println("New center coordinates: " + "x = " + this.center.x + "y = " + this.center.y);
    }

}

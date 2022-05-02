package bte.model;

public class Circle {
    {
        System.out.println("In initialization block");
    }

    static {
        System.out.println("In static initialization block");
    }

    final private int radius;
    private Point center= new Point(0,0);

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }
    public Point getCenter() {
        return center;
    }

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
        System.out.println("Old center coordinates: " + "x = " + this.center.getX() + "y = " + this.center.getY());
        this.center.setX(this.center.getX()+lenX);// this.center.x += lenX;
        this.center.setY(this.center.getY()+lenY);// // this.center.y += lenY;
        System.out.println("New center coordinates: " + "x = " + this.center.getX() + "y = " + this.center.getY());
    }

}

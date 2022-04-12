package bte.model;

public class Triangle2D {
    private Point a;
    private Point b;
    private Point c;

    public Triangle2D(Point a, Point b, Point c) {
        checkTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static void checkTriangle(Point a, Point b, Point c) {
        if((c.y - a.y) * (b.x - a.x) == (c.x - a.x) * (b.y - a.y)) {
            System.out.println("Triangle is impossible");
        }else{
            System.out.println("Triangle is possible");
        }

    }
    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }
}

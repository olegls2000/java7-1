package bte.model;

import static bte.utils.NumberUtils.getRandom;

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

    private void checkTriangle(Point a, Point b, Point c) {
        boolean impossible = 1 / 2 * ((getA().x - getC().x) * (getB().y - getC().y) - (getB().x - getC().x) * (getA().y - getC().y)) == 0;
        if (impossible) {
            System.out.println("Triangle is impossible");
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

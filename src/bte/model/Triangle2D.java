package bte.model;

public class Triangle2D {
    private Point a;
    private Point b;
    private Point c;

    public Triangle2D(Point a, Point b, Point c) {
        checkIsTriangleValid(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static void checkIsTriangleValid(Point p1, Point p2, Point p3) {
    //https://completerepair.ru/kak-opredelit-lezhat-li-tochki-na-odnoj-pryamoj
        if((p3.y-p1.y)*(p2.x-p1.x)  == (p3.x-p1.x)*(p2.y-p1.y) ) {
            throw new RuntimeException("Triangle is invalid");
        }
    }

    public Point getA() {
                     return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }
}

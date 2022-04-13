package bte.model.simple;

public class SimpleRectangle implements WithPerimeter, WithArea {
    private int a;
    private int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "Simple Rectangle with radius = " + this.a + ", " + this.b;
    }
}

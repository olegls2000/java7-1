package bte.model.simple;

public class SimpleCircle implements WithPerimeter, WithArea {
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Simple Circle with radius = " + this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

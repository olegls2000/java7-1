package bte.model.simple;

public class SimpleCircle extends AbstractShape {
    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    private int radius;

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }
}

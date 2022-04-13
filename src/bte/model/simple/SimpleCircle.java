package bte.model.simple;

import static bte.utils.CircleUtils.PI;
import static java.lang.Math.pow;

public class SimpleCircle extends AbstractShape {
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
    @Override
    public double getArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Simple Circle with radius = " + this.radius;
    }
}

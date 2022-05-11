package bte.model.simple;

import bte.util.NumberUtils;

public class SimpleCircle extends AbstractShape {


    private final int radius;
    public int getRadius() {
        return radius;
    }
    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public SimpleCircle () {
        this.radius= NumberUtils.getRandomValue(100,500);
    }
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

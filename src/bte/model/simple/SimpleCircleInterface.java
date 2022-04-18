package bte.model.simple;

import bte.service.TwoInterfaces;

import java.util.Objects;

public class SimpleCircleInterface implements TwoInterfaces {
    public SimpleCircleInterface(int radius) {
        this.radius = radius;
    }

    private int radius;

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "SimpleCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public boolean equals(Object o) {
        /*
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCircleInterface that = (SimpleCircleInterface) o;
        return radius == that.radius;
         */
        if (this == o) return true;
        if (o instanceof SimpleCircleInterface) {
            SimpleCircleInterface that = (SimpleCircleInterface) o;
        return radius == that.radius;
    }
    return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

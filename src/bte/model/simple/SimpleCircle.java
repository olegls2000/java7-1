package bte.model.simple;

import bte.model.simple.WithArea;
import bte.model.simple.WithPerimeter;

import static bte.util.NumberUtils.getRandom;

public class SimpleCircle implements WithPerimeter, WithArea {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public SimpleCircle() {
        this.radius = getRandom(40, 200);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleCircle)) return false;

        SimpleCircle circle = (SimpleCircle) o;

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }
}
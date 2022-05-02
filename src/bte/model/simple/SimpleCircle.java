package bte.model.simple;

import java.util.Objects;

import static bte.utils.CircleUtils.PI;
import static bte.utils.NumberUtils.getRandom;
import static java.lang.Math.pow;

public class SimpleCircle implements WithArea, WithPerimeter {
    private final int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    public SimpleCircle(){
        this.radius=getRandom(40,200);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCircle circle = (SimpleCircle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}

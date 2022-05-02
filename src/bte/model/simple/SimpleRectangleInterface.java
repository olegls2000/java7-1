package bte.model.simple;

import bte.service.TwoInterfaces;

public class SimpleRectangleInterface implements TwoInterfaces {
    private final int a;
    private final int b;

    public SimpleRectangleInterface(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
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
        if (o instanceof SimpleRectangleInterface) {
            SimpleRectangleInterface that = (SimpleRectangleInterface) o;
            return a == that.a && b == that.b;
        }
        return false;
    }
}

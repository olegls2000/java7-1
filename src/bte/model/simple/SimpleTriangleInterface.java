package bte.model.simple;

import bte.service.TwoInterfaces;

public class SimpleTriangleInterface implements TwoInterfaces {
    int a;
    int b;
    int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        checkTriangle(a, this.b, this.c);
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        checkTriangle(this.a, b, this.c);
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        checkTriangle(this.a, this.b, c);
        this.c = c;
    }

    public SimpleTriangleInterface(int a, int b, int c) {
        checkTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public int calculatePerimeter() {
        return a + b + c;
    }

    public void checkTriangle(int a, int b, int c) {
        boolean isImpossible = a + b <= c || a + c <= b || b + c <= a;
        if (isImpossible) {
            throw new RuntimeException("Triangle with sides" + a + ", " + b + ", " + c + "is impossible ");
        }
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public double getArea() {
        return (a*b)/2.0;
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
        if (o instanceof SimpleTriangleInterface) {
            SimpleTriangleInterface that = (SimpleTriangleInterface) o;
        return a == that.a && b == that.b && c == that.c;
    }
        return false;
    }
}

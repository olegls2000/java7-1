package bte.model.simple;

import java.util.Objects;

public class SimpleTriangle implements WithArea, WithPerimeter, Comparable<SimpleTriangle> {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        checkTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "Simple Triangle with radius = " + this.a + ", " + this.b + ", " + this.c;
    }

    public int calculatePerimeter() {
        return a + b + c;
    }

    private void checkTriangle(int a, int b, int c) {
        boolean impossible = a + b <= c || b + c <= a || a + c <= b;
        if (impossible) {
            throw new RuntimeException("Triangle with combination of sides: "
                    + a + "," + b + "," + c + " is impossible");
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof SimpleTriangle) {
            SimpleTriangle simpleTriangle = (SimpleTriangle) object;
            return simpleTriangle.a == this.a
                    && simpleTriangle.b == this.b
                    && simpleTriangle.c == this.c;
        }
        return false;
    }

    public void setA(int a) {
        checkTriangle(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) {
        checkTriangle(b, this.a, this.c);
        this.b = b;
    }

    public void setC(int c) {
        checkTriangle(c, this.a, this.b);
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public int compareTo(SimpleTriangle o) {
        return (int) (getPerimeter() - o.getPerimeter());
    }

    private void mySecretMethod(){
        System.out.println("Hello from secret method");
        System.out.println(this);
    }
}

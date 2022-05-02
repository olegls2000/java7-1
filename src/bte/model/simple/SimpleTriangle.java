package bte.model.simple;

import java.util.Objects;

public class SimpleTriangle implements WithPerimeter,Comparable <SimpleTriangle>{
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
    public String toString() {
        return "Simple Triangle with sides: " + this.a + ", " + this.b + ", " + this.c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        checkTriangle(a, this.b, this.c);
        this.a = a;
    }

    public void setB(int b) {
        checkTriangle(this.a, b, this.c);
        this.b = b;
    }

    public void setC(int c) {
        checkTriangle(this.a, this.b, c);
        this.c = c;
    }

    public int calculatePerimeter() {
        return a + b + c;
    }

    private void checkTriangle(int a, int b, int c) {
        boolean impossible = a + b <= c || b + c <= a || a + c <= b;
        if (impossible) {
            throw new RuntimeException("Triangle with combination of sides: " + a
                    + "," + b + "," + c + " is impossible");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleTriangle)) return false;
        SimpleTriangle triangle = (SimpleTriangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c);
    }



    @Override
    public int compareTo(SimpleTriangle o) {
        return (int) (getPerimeter()-o.getPerimeter());
    }
}

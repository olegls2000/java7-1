package bte.simple;

public class SimpleTriangle {
    private int a;
    private int b;
    private int c;

    public SimpleTriangle(int a, int b, int c) {
        checkTriangle(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        checkTriangle(a, this.b, this.c);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        checkTriangle(this.a, b, this.c);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
        checkTriangle(this.a, this.b, c);
    }

    public int calculatePerimeter() {
        return a + b + c;
    }

    private void checkTriangle(int a, int b, int c) {
        boolean impossible = a + b <= c || b + c <= a || a + c <= b;
        if (!impossible) {
            throw new RuntimeException("Triangle with combination of sides: " +
                    a + "," + b + "," + c +
                    "is impossible");
        }
    }
}

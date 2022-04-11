package bte.model;

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


}

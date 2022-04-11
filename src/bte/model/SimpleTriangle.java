package bte.model;

public class SimpleTriangle {
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

    public SimpleTriangle(int a, int b, int c) {
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
}

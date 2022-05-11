package bte.model.simple;

import static bte.util.Print.print;

public class SimpleTriangle implements WithPerimeter {
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof SimpleTriangle) {
            SimpleTriangle simpleTriangle = (SimpleTriangle) object;
            return simpleTriangle.a == this.a && simpleTriangle.c == this.c &&
                    simpleTriangle.b == this.b;
        }
        return false;
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
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    public int getB() {
        return b;
    }

    private void mySecretMethod(){
        print("Hello from secret method");
        print(this);
    }
}
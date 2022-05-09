package bte.model.simple;

public class SimpleTriangle implements
        WithPerimeter, Comparable<SimpleTriangle> {
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

        SimpleTriangle that = (SimpleTriangle) o;

        if (getA() != that.getA()) return false;
        if (b != that.b) return false;
        return c == that.c;
    }

    @Override
    public int hashCode() {
        int result = getA();
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }

    @Override
    public int compareTo(SimpleTriangle o) {
        return (int) (getPerimeter() - o.getPerimeter());
    }

    private void mySecretMethod() {
        System.out.println("Hello from secret Method!!!");
        System.out.println(this);
    }

    public int getB() {
        return b;
    }
}

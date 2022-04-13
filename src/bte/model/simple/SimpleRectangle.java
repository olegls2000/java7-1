package bte.model.simple;

public class SimpleRectangle implements WithPerimeter {
    private int a;
    private int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof SimpleRectangle) {
            SimpleRectangle simpleRectangle = (SimpleRectangle) object;
            return simpleRectangle.a == this.a && simpleRectangle.b == this.b;
        }
        return false;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}
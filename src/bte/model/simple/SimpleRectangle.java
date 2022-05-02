package bte.model.simple;

public class SimpleRectangle extends AbstractShape {
    private final int a;
    private final int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getSquare() {
        return a*b;
    }
}

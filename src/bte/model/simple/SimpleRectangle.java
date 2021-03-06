package bte.model.simple;

public class SimpleRectangle implements WithPerimeter {
    private int a;
    private int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }
}

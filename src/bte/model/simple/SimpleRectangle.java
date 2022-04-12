package bte.model.simple;

public class SimpleRectangle extends AbstractShape {
    private int a;
    private int b;

    public SimpleRectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
@Override
    public double getPerimetr(){
        return 2 * (a + b);
    }
}

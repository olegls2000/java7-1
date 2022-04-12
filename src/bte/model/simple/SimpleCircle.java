package bte.model.simple;

public class SimpleCircle extends AbstractShape {
    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    private int radius;

@Override
    public double getPerimetr() {
        return Math.PI * 2 * radius;
    }
@Override
    public String toString(){
    return "Simple Circle with radius = " + this.radius;
    }
}

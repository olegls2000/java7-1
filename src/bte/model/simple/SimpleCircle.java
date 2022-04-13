package bte.model.simple;

public class SimpleCircle implements WithPerimeter, WithArea {
    private int radius;

    public SimpleCircle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Simple Circle with radius = " + this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
/*         if (object.getClass() == SimpleCircle.class) {

        }*/

        if (object instanceof SimpleCircle) {
            SimpleCircle simpleCircle = (SimpleCircle) object;
            return simpleCircle.radius == this.radius;
        }
        return false;
    }
}

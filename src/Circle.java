
//40 .. 100 -> 4 obj. find max area
//"Circle with the biggest area: XXX with radius: XXX"
public class Circle {
    public int radius;

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    double getLength() {
        return 2 * Math.PI * radius;
    }
}

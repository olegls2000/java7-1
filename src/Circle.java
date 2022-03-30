public class Circle {
    public int radius;
    public Circle (int radius) {
        this.radius=radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getLength() {
        return 2*Math.PI * radius;
    }
}

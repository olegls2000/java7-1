package bte.model;

import static bte.util.CircleUtils.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

//40 .. 100 -> 4 obj. find with max area
// "bte.Circle with the biggest area: XXX with radius: XXX"
public class Circle {
    public int radius;

    {
        out.println("Instance initialisation block");
    }

    public Circle(int radius) {
        out.println("Constructor initialisation block");
        this.radius = radius;
    }

    public double getArea() {
        return PI * pow(radius, 2);
    }

    static {
        out.println("Static initialisation block");
    }

}

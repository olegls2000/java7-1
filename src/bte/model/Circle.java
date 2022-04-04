package bte.model;

import static bte.util.CircleUtils.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

//40 .. 100 -> 4 obj. find with max area
// "bte.Circle with the biggest area: XXX with radius: XXX"
public class Circle {
    public int radius;
    public Point center;

    public void move(int xDelta, int yDelta) {
        this.center.x = this.center.x + xDelta;
        this.center.y = this.center.y + yDelta;
    }


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

package bte;

public class CircleTwo {

    //Add to the class Circle method: double getLength(){...}
// that calculates circles length. Generate 30 circles with radius
// from  range (2 .. 600) and find the circle with minimal length.

    double radius;

    public CircleTwo(int radius) {
        this.radius = radius;
    }
    public  double getLenght() {
        return 2 * Math.PI * radius;
    }


}

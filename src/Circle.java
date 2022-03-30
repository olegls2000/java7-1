// 40....100 -> 4 obj find with max area
//Add to the class Circle method: double getLength(){...}
// that calculates circles length. Generate 30 circles with radius
// from  range (2 .. 600) and find the circle with minimal length.
public class Circle {
    public int radius;
    public Circle(int radius){this.radius = radius;}
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);



    }
}

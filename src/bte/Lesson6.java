package bte;
import bte.model.Circle;
import bte.model.Point;
import bte.model.Triangle;

public class Lesson6 {
    public static void main(String[] args) {
        //System.out.println();
        //Circle circle = new Circle(5);

        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);

        Triangle triangle = new Triangle(a, b, c);
        double perimeter = triangle.getPerimeter();
        System.out.println("Perimeter: " + perimeter);


        final int ARRAY_INDEX = 5;

        final Point POINT = new Point(4, 4);
        POINT.x = 9;
        POINT.y = 9;
        //POINT = new Point(7,7);
        int arrayIndex = 5;
        mutaterPrimitive(arrayIndex);
        System.out.println(arrayIndex);
        mutatedObject(POINT);
        System.out.println(POINT);
    }

    public static void mutaterPrimitive(int a) {
        a = 8;

    }

    public static void mutatedObject(Point p) {
        p = new Point(5, 5);

    }
}

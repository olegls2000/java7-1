package bte;

import bte.model.Car;
import bte.model.Point;
import bte.model.simple.SimpleTriangle;
import bte.model.Triangle2D;
import bte.service.AutoSalon;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleTriangle triangle =
                new SimpleTriangle(1, 2, 2);

        System.out.println("Perimeter: " +
                triangle.calculatePerimeter());

        final var autoSalon = new AutoSalon();
        Car car = new Car();
        autoSalon.buyCar(car);
        autoSalon.report();
        autoSalon.sellCar(autoSalon.parkingPlace());
        autoSalon.report();

        Point a = new Point(0,0);
        Point b = new Point(5,0);
        Point c = new Point(3,15);
        Triangle2D triangle2D = new Triangle2D(a,b,c);
    }
}

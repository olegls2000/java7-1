package bte.util;

import bte.model.Car;
import bte.model.Point;
import bte.model.simple.SimpleTriangle;
import bte.model.Triangle2D;
import bte.service.AutoSalon;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleTriangle triangle = new SimpleTriangle(2, 2, 2);
        triangle.setA(2);
        triangle.setB(2);
        triangle.setC(2);
        System.out.println("Perimetr:" + triangle.calculatePerimeter());
    }
    final AutoSalon autoSalon = new AutoSalon();
    Car car = new Car();
    //autoSalon.buyCar(car);
    //autoSalon.report();
    //autoSalon.sellCar(0)
    //autoSalon.report();

    Point a = new Point(2,2);
    Point b = new Point(4,1);
    Point c = new Point(2,2);
    Triangle2D triangle2D = new Triangle2D(a, b, c);
}

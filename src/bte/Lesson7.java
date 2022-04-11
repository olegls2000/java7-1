package bte;

import bte.model.Car;
import Simple.SimpleTriangle;
import bte.servise.AutoSalon;

import static bte.util.Print.print;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleTriangle triangle = new SimpleTriangle(1, 2, 5);
        triangle.setA(10);
        triangle.setB(5);
        triangle.setC(3);
        print("Perimeter: " + triangle.calculatePerimeter());


        final var autoSalon = new AutoSalon();
        Car car = new Car();
        autoSalon.buyCar(car);
        autoSalon.report();
        autoSalon.sellCar(0);
        autoSalon.report();

    }
}

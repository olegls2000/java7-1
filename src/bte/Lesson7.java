package bte;

import bte.service.AutoSalon;
import bte.model.Car;
import bte.model.Point;
import bte.model.SimpleTriangle;
import bte.model.Triangle2D;

public class Lesson7 {
    public static void main(String[] args) {
        SimpleTriangle st = new SimpleTriangle(4, 2, 3);
        Triangle2D tr = new Triangle2D(new Point(1, 1), new Point(2, 2), new Point(3, 1));

        final var autoSalon = new AutoSalon();
        Car car1 = new Car();
        autoSalon.buyCar(car1);
        Car car2 = new Car();
        autoSalon.buyCar(car2);
        autoSalon.report();

        autoSalon.sellCar(0);
        autoSalon.report();
        Car car3 = new Car();
        autoSalon.buyCar(car3);
        autoSalon.report();

       // Triangle2D tr2 = new Triangle2D(new Point(1, 1), new Point(2, 2), new Point(4, 4));
        Triangle2D tr2 = new Triangle2D(new Point(1, 1), new Point(2, 1), new Point(4, 4));
    }
}

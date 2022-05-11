package bte;

import bte.model.Car;
import bte.model.Circle;
import bte.model.Color;

import java.util.*;

import static bte.util.CircleUtils.getCircles2;

public class Lesson14 {
    public static void main(String[] args) {
        Map<Color, Car> carMap = new HashMap<>(4);
        Car car1 = new Car("Toyota", 30_000, 1400, Color.BLACK);
        Car car2 = new Car("Toyota", 30_001, 1401, Color.BLACK);
        carMap.put(car1.getColor(), car1);
        carMap.put(car2.getColor(), car2);
        final Car carByColor = carMap.get(Color.RED);

        final Set<Map.Entry<Color, Car>> entries = carMap.entrySet();
        for (Map.Entry<Color, Car> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        final Collection<Car> values = carMap.values();
        System.out.println(values);

        final Map<Integer, Circle> circles2 = getCircles2(70);

        for (Circle circle : circles2.values()) {
            if (circle.getRadius() == 55) {
                System.out.println("Circle with radius 55 is present!");
                break;
            }
        }
        if (circles2.get(55) != null) {
            System.out.println("Circle with radius 55 is present!");
        }
        if (circles2.keySet().contains(55)) {
            System.out.println("Circle with radius 55 is present!");
        }
        if (circles2.containsKey(55)) {
            System.out.println("Circle with radius 55 is present!");
        }
        final Set<Integer> keys = circles2.keySet();

        //   Map<Integer,Circle> copyMap = new HashMap<>(circles2);
        // for (Integer key : copyMap.keySet()) {

        for (Integer key : circles2.keySet()) {
            if (key < 45) {
                circles2.remove(key);
            }
        }


    }
}

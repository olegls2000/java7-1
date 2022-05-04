package bte;

import bte.model.Car;
import bte.model.Circle;
import bte.model.Color;
import bte.utils.CircleUtils;

import java.util.*;

public class Lesson14 {
    public static void main(String[] args) {
        Map<Color, Car> carMap = new HashMap<>(4);
        Car car = new Car(30000, 1400, Color.BLACK);
        carMap.put(car.getColor(), car);
        Car car2 = new Car(30001, 1401, Color.BLACK);
        carMap.put(car2.getColor(), car2);
        final Car carByColor = carMap.get(Color.BLACK);
        final Car carBlack = carMap.get(Color.WHITE);

        Set<Map.Entry<Color, Car>> entrySet = carMap.entrySet();
        for (Map.Entry<Color, Car> entry : entrySet) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        final Collection<Car> values = carMap.values();
        System.out.println(values);
        Set<Color> keySet = carMap.keySet();
        System.out.println(keySet);

        Map<Integer, Circle> radiusVsCircleMap = CircleUtils.getCircleMap(70);
        if (radiusVsCircleMap.keySet().contains(55)) {
            System.out.println();
        }
        if (radiusVsCircleMap.get(55) != null) {
            System.out.println();
        }

        if (radiusVsCircleMap.containsKey(55)) {
            System.out.println();
        }

        Map<Integer,Circle> copyMap = new HashMap<>(radiusVsCircleMap);
        Set<Integer> keys = copyMap.keySet();
        for (Integer key : keys) {
            if (key < 45) {
                radiusVsCircleMap.remove(key);
            }
        }
    }
}

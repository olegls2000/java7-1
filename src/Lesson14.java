import bte.model.Car;
import bte.model.Circle;
import bte.model.Color;
import bte.util.CircleUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson14 {
    public static void main(String[] args) {
        Map<Color, Car> carMap = new HashMap(4);
        Car car = new Car(30_000, 1400, Color.BLACK);
        carMap.put(car.getColor(), car);
        Car car2 = new Car(30_001, 1401, Color.BLACK);
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

        //is in map with 70 circles present circle with radius 55?

        Map<Integer, Circle> radiusVsCircleMap = CircleUtils.getCircles(70);
        if (radiusVsCircleMap.keySet().contains(55)) {
            System.out.println("Circle with Radius = 55 is present");
        }
        if (radiusVsCircleMap.get(55) != null) {
            System.out.println("Circle with Radius = 55 is present");
        }

        if (radiusVsCircleMap.containsKey(55)) {
            System.out.println("Circle with Radius = 55 is present");
        }

        Map<Integer, Circle> copyMap = new HashMap<>(radiusVsCircleMap);

        //remove from map all entries where radius <45
        final Set<Integer> keys = copyMap.keySet();
        for (Integer key : keys) {
            if (key < 45) {
                radiusVsCircleMap.remove(keys);
            }
        }
    }



}
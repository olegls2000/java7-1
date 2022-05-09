package bte;

import bte.model.Car;
import bte.model.Circle;
import bte.util.CircleUtils;
import bte.util.Color;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static bte.util.Print.print;

public class Lesson14 {
    public static void main(String[] args) {
        Map<Color, Car> carMap = new HashMap(4);
        Car car = new Car(30_000, 1400, Color.BLACK);
        carMap.put(car.getColor(), car);
        Car car2 = new Car(30_000, 1400, Color.RED);
        carMap.put(car2.getColor(), car2);

        final Car carByColor = carMap.get(Color.RED);
        final Car carBlack = carMap.get(Color.WHITE);

        Set<Map.Entry<Color, Car>> entrySet = carMap.entrySet();
        for (Map.Entry<Color, Car> entry :
                entrySet) {
            print(entry.getKey());
            print(entry.getValue());
        }
        final Collection<Car> values = carMap.values();
        print(values);
        Set<Color> keySet = carMap.keySet();
        print(carMap);


        Map<Integer, Circle> radiusVsCircleMap = CircleUtils.getCircles(70);
        if (radiusVsCircleMap.keySet().contains(55)) {
            print("Circle with Radius = 55 is present ");
        }
        if (radiusVsCircleMap.get(55) != null) {
            print("Circle with Radius = 55 is present ");
        }
        if (radiusVsCircleMap.containsKey(55)) {
            print("Circle with Radius = 55 is present ");
        }


        //remove from map all circles where radius <45
        //radiusVsCircleMap.keySet().removeIf(key -> key <= 45);
        final Set<Integer> keys = radiusVsCircleMap.keySet();
        for (Integer key:
             keys) {
            if(key<45){
                radiusVsCircleMap.remove(keys);
            }
        }
        print(radiusVsCircleMap);
    }


}

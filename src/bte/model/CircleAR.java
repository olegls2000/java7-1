package bte.model;

import bte.util.CircleUtils;
import bte.util.NumberUtils;

import java.util.ArrayList;
import java.util.Map;

public class CircleAR {
    private static Point center;

    public static void main(String[] args){
        Map<Integer, Circle> circles = CircleUtils.getCircles(6);
        Circle maxAreaCircle = CircleUtils.getCirceWithMaxArea(
                new ArrayList<>(circles.values())
        );
        System.out.println("bte.Circle with the biggest area: "
                + maxAreaCircle.getArea() + " with radius: "
                + maxAreaCircle.getRadius());
        Circle[] cir = getCLength(30);
        Circle minCirLength = getCircleWithMinLength(cir);
        System.out.println("Circle with the min length: "
                + minCirLength.getLength() + " with radius: "
                + minCirLength.getRadius);
    }

    public static Circle[] getCLength(int count){
        Circle[] result = new Circle[count];
        for (int i = 0; i < count; i++){
            result[i] = new Circle(NumberUtils.getRandom(2, 600), center);
        }
        return result;
    }

    public static Circle getCircleWithMinLength(Circle[] cir){
        Circle result = cir[0];
        for (Circle circle : cir){
            if (circle.getLength() < result.getLength()){
                result = circle;
            }
        }
        return result;
    }

}

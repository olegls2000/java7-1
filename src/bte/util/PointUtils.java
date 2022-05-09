package bte.util;

import bte.model.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointUtils {
    public static double getDistance(Point one, Point two) {
        return sqrt(pow(one.getY() - two.getY(), 2) + pow(one.getX() - two.getX(), 2)

        );

    }

}

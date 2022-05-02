package bte.util;

import bte.model.Point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PointUtils {
    public static double getDistance(Point one, Point two) {
        return sqrt(pow(one.y - two.y, 2) + pow(one.x - two.x, 2));
    }
}

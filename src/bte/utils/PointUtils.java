package bte.utils;

import bte.model.Point;

import static java.lang.Math.*;

public class PointUtils {
    public static double getDistance(Point one, Point two) {
        return sqrt(pow(one.y - two.y, 2) + pow(one.x - two.x, 2));
    }
}

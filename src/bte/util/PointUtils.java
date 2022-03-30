package bte.util;

import bte.model.Point;

public class PointUtils {
    public static double getDistance(Point one, Point two) {
        return Math.sqrt(
                Math.pow(one.y - two.y, 2)
                        + Math.pow(one.x - two.x, 2)
        );
    }

}

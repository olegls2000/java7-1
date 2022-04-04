package bte.util;
import bte.model.Point;

public class PointUtils {
    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow( a.y - b.y, 2) +
                Math.pow(a.x - b.x, 2));
    }
}

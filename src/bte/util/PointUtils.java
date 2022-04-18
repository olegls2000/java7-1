package bte.util;
import bte.model.Point;

public class PointUtils {
    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow( a.getY() - b.getY(), 2) +
                Math.pow(a.getX() - b.getX(), 2));
    }
}

package bte.utils;

import bte.model.Point;
import bte.model.Rectangle;
import static bte.utils.NumberUtils.getRandom;

public class RectangleUtils {
    public static Rectangle[] generateRectangles(int count) {
        Rectangle[] result = new Rectangle[count];
        Point a = new Point(getRandom(1, 10), getRandom(1, 10));
        Point b = new Point(a.getX(), getRandom(1, 10));
        Point c = new Point(getRandom(1, 10), b.getY());
        Point d = new Point(c.getX(), a.getY());
        for (int i = 0; i < count; i++) {
            result[i] = new Rectangle(a, b, c, d);
        }
        return result;
    }

    public static Rectangle getSmallestArea(Rectangle[] rectangles) {
        Rectangle result = rectangles[0];
        for (Rectangle rectangle : rectangles) {
            if (rectangle.calculateArea() < result.calculateArea()) {
                result = rectangle;
            }
        }
        return result;
    }

    public static Rectangle getSmallestPerimeter(Rectangle[] rectangles) {
        Rectangle result = rectangles[0];
        for (Rectangle rectangle : rectangles) {
            if (rectangle.calculatePerimeter() < result.calculatePerimeter()) {
                result = rectangle;
            }
        }
        return result;
    }
}

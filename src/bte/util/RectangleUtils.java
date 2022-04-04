package bte.util;

import bte.model.Point;
import bte.model.Rectangle;

public class RectangleUtils {

    public static Rectangle[] getRectangles(int count, int from, int to) {
        Rectangle[] rectangles = new Rectangle[count];
        for (int i = 0; i < rectangles.length; i++) {
            Point point1 = new Point(NumberUtils.getRandomValue(from, to), NumberUtils.getRandomValue(from, to));
            Point point2 = new Point(NumberUtils.getRandomValue(from, to), NumberUtils.getRandomValue(from, to));
            if (point1.x < point2.x) {
                if (point1.y > point2.y) {
                    rectangles[i] =
                            new Rectangle(point1, new Point(point2.x, point1.y), point2, new Point(point1.x, point2.y));
                } else {
                    if (point1.y == point2.y) {
                        int num = NumberUtils.getRandomValue(from, to);
                        rectangles[i] =
                                new Rectangle(point1, point2, new Point(point2.x, num), new Point(point1.x, num));
                    } else {
                        rectangles[i] = new Rectangle(new Point(point1.x, point2.y), point2,
                                new Point(point2.x, point1.y), point1);
                    }
                }
            } else {
                if (point1.x == point2.x) {
                    int num = NumberUtils.getRandomValue(from, to);
                    if (point1.y > point2.y) {
                        rectangles[i] =
                                new Rectangle(point1, new Point(num, point1.y), new Point(num, point2.y), point2);
                    } else {
                        if (point1.y == point2.y) {
                            int num1 = NumberUtils.getRandomValue(from, to);
                            rectangles[i] = new Rectangle(point1, new Point(num, point1.y),
                                    new Point(num, num1), new Point(point1.x, num1));
                        } else {
                            rectangles[i] = new Rectangle(point2, new Point(num, point2.y),
                                    new Point(num, point2.y), point1);
                        }
                    }
                } else {
                    if (point1.y > point2.y) {
                        rectangles[i] =
                                new Rectangle(new Point(point2.x, point1.y), point1, new Point(point1.x, point2.y), point2);
                    } else {
                        if (point1.y == point2.y) {
                            int num = NumberUtils.getRandomValue(from, to);
                            rectangles[i] = new Rectangle(point2, point1, new Point(point1.x, num),
                                    new Point(point2.x, num));
                        } else {
                            rectangles[i] = new Rectangle(point2, new Point(point1.x, point2.y), point1,
                                    new Point(point2.x, point1.y));
                        }
                    }
                }
            }


        }
        return rectangles;
    }

    public static Rectangle getCircleWithMinAreaAndPerimeter(Rectangle[] rectangles) {
        Rectangle recMin = rectangles[0];
        for (Rectangle r : rectangles) {
            if (r.calculateArea() < recMin.calculateArea() && r.calculatePerimeter()<recMin.calculatePerimeter()) {
                recMin = r;
            }

        }
        return recMin;
    }
}

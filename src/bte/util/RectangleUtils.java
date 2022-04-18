package bte.util;

import bte.model.Point;
import bte.model.Rectangle;

public class RectangleUtils {

    public static Rectangle[] getRectangles(int count, int from, int to) {
        Rectangle[] rectangles = new Rectangle[count];
        for (int i = 0; i < rectangles.length; i++) {
            Point point1 = new Point(NumberUtils.getRandomValue(from, to), NumberUtils.getRandomValue(from, to));
            Point point2 = new Point(NumberUtils.getRandomValue(from, to), NumberUtils.getRandomValue(from, to));
            if (point1.getX() < point2.getX()) {
                if (point1.getY() > point2.getY()) {
                    rectangles[i] =
                            new Rectangle(point1, new Point(point2.getX(), point1.getY()), point2, new Point(point1.getX(), point2.getY()));
                } else {
                    if (point1.getY() == point2.getY()) {
                        int num = NumberUtils.getRandomValue(from, to);
                        rectangles[i] =
                                new Rectangle(point1, point2, new Point(point2.getX(), num), new Point(point1.getX(), num));
                    } else {
                        rectangles[i] = new Rectangle(new Point(point1.getX(), point2.getY()), point2,
                                new Point(point2.getX(), point1.getY()), point1);
                    }
                }
            } else {
                if (point1.getX() == point2.getX()) {
                    int num = NumberUtils.getRandomValue(from, to);
                    if (point1.getY() > point2.getY()) {
                        rectangles[i] =
                                new Rectangle(point1, new Point(num, point1.getY()), new Point(num, point2.getY()), point2);
                    } else {
                        if (point1.getY() == point2.getY()) {
                            int num1 = NumberUtils.getRandomValue(from, to);
                            rectangles[i] = new Rectangle(point1, new Point(num, point1.getY()),
                                    new Point(num, num1), new Point(point1.getX(), num1));
                        } else {
                            rectangles[i] = new Rectangle(point2, new Point(num, point2.getY()),
                                    new Point(num, point2.getY()), point1);
                        }
                    }
                } else {
                    if (point1.getY() > point2.getY()) {
                        rectangles[i] =
                                new Rectangle(new Point(point2.getX(), point1.getY()), point1, new Point(point1.getX(), point2.getY()), point2);
                    } else {
                        if (point1.getY() == point2.getY()) {
                            int num = NumberUtils.getRandomValue(from, to);
                            rectangles[i] = new Rectangle(point2, point1, new Point(point1.getX(), num),
                                    new Point(point2.getX(), num));
                        } else {
                            rectangles[i] = new Rectangle(point2, new Point(point1.getX(), point2.getY()), point1,
                                    new Point(point2.getX(), point1.getY()));
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

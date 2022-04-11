package bte;

import bte.model.Circle;
import bte.model.Rectangle;
import static bte.utils.CircleUtils.closerToCenter;
import static bte.utils.CircleUtils.getCircle;
import static bte.utils.RectangleUtils.*;

public class HomeWorkLesson6 {
    public static void main(String[] args) {
        Rectangle[] rectangles = generateRectangles(100);
        double minArea = getSmallestArea(rectangles).calculateArea();
        double minPerimeter = getSmallestPerimeter(rectangles).calculatePerimeter();
        System.out.println("Minninal area is: " + minArea);
        System.out.println("Minimal perimeter is: " + minPerimeter);

       // Circle circle = new Circle(5);
     //   circle.getCenter() = new Point(getRandom(-10, 10), getRandom(0, 10));
      //  circle.move(getRandom(0, 10), getRandom(-10, 10));

        Circle[] circles = getCircle(10);
        closerToCenter(circles);
    }
}

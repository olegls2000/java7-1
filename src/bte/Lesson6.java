package bte;

import bte.model.Point;
import bte.model.Rectangle;
import bte.model.Triangle;
import bte.model.WeekDay;
import bte.util.NumberUtils;

import static bte.util.RectangleUtils.getCircleWithMinAreaAndPerimeter;
import static bte.util.RectangleUtils.getRectangles;

public class Lesson6 {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 4);
        Point c = new Point(3, 0);
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Perimeter " + triangle.getPerimeter(a, b, c));
        WeekDay tuesday = WeekDay.TUESDAY;
        boolean isHoliday = tuesday.isHoliday;
        String name = tuesday.name;
        int ordinal = tuesday.ordinal();
        System.out.println(ordinal);
        WeekDay[] wd = WeekDay.values();
        WeekDay randomDay = wd[NumberUtils.getRandomValue(0, wd.length)];
        System.out.println(randomDay.name);

     /*   Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Your input " + input);
        int num= scanner.nextInt();
      */

        Rectangle[] rectangles=getRectangles(3,1,20);
        Rectangle rec=getCircleWithMinAreaAndPerimeter(rectangles);
        System.out.println("The rectangle with min area " +rec.calculateArea() + " and min perimeter "+ rec.calculatePerimeter());
    }
}

package bte;

import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.util.ArrayUtils;

import java.math.BigDecimal;
import java.time.*;

import static bte.util.ArrayUtils.printAndReturnFigureWithPerimeter;
import static java.time.Month.JANUARY;

public class Lesson11 {
    public static void main(String[] args) {
        SomeInterface instance = new SomeInterfaceImpl();

        SomeInterface instanceI = new SomeInterface() {
            @Override
            public void myMethod() {
                System.out.println(3);
            }

            @Override
            public void myMethodX() {
                System.out.println(3);
            }
        };
        instanceI.myMethod();
        instanceI.myMethodX();
        SomeInterfaceImpl.Result res = new SomeInterfaceImpl.Result(100, null);

        LocalDate localDate = LocalDate.now();
        LocalDate localDateCustom = LocalDate.of(2000, JANUARY, 20);
        System.out.println(localDateCustom);
        localDateCustom = localDateCustom.plusWeeks(2);
        System.out.println(localDateCustom);

        LocalTime localTime = LocalTime.now();
        System.out.println("Time" + localTime);
        LocalTime localTimeCustom = LocalTime.of(6,40,50,500);
        System.out.println("Time custom"+ localTimeCustom);
      localTimeCustom=localTimeCustom.plusSeconds(200);

        LocalDateTime localDateTime= LocalDateTime.now();

        ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("GMT"));
        System.out.println("From " + System.currentTimeMillis());

        Point[] points =new Point[3];
        points[0] = new Point(1,1);
        points[1] = new Point(2,2);
        points[2] = new Point(3,3);

        ArrayUtils.printOutArray(points);
        SimpleCircle circle = new SimpleCircle(5);
        SimpleCircle simpleCircle = printAndReturnFigureWithPerimeter(circle);
        Point[] pp=printAndReturnFigureWithPerimeter(points);
        Point p1=printAndReturnFigureWithPerimeter(points[0]);

        BigDecimal big= new BigDecimal("111111111111111111111111.11");
        System.out.println(big);

        BigDecimal big1= new BigDecimal("111111111111111111111111.11");
        big=big.add(big1);
        System.out.println(big);

      //  throw new Error("Epic fail");
    }
}

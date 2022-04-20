package bte;

import bte.model.Point;
import bte.pattern.iterator.Iterator;
import bte.pattern.iterator.IterableContainer;

import java.time.LocalDate;
import java.time.LocalTime;

import static bte.util.Print.print;
import static java.time.Month.JANUARY;

public class Lesson11 {
    public static void main(String[] args) {
        //SomeInterface instance = new SomeInterfaceImpl();
        SomeInterface instanceAnonymous = new SomeInterface() {
            @Override
            public void myMethod() {
                print("3");
            }

            @Override
            public void myMethodX() {
                print("3");
            }
        };

        instanceAnonymous.myMethod();
        instanceAnonymous.myMethodX();
        SomeInterface instanceAnonymous4 = new SomeInterface() {
            @Override
            public void myMethod() {
                print("4");
            }

            @Override
            public void myMethodX() {
                print("4");
            }
        };
        instanceAnonymous4.myMethod();
        instanceAnonymous4.myMethodX();


        LocalDate localDate = LocalDate.now();
        LocalDate localDateCustom = LocalDate.of(2000, JANUARY,
                20);
        print(localDateCustom);
        localDateCustom = localDateCustom.plusWeeks(2);
        print(localDateCustom);

        LocalTime localTime = LocalTime.now();
        print("Now is"+localTime);

        print(localTime);

        Point[] points = new Point[3];
        points[0] = new Point(1,1);
        points[1] = new Point(2,2);
        points[2] = new Point(3,3);

        Iterator <Point> iterator =
                new IterableContainer<Point>(points);
        while(iterator.hasNext()){
        Point item = iterator.next();
        print(item);
        }

    }
}

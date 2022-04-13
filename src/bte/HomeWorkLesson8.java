package bte;

import bte.model.simple.AbstractShape;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.service.Container;

public class HomeWorkLesson8 {
    public static void main(String[] args) {

        SimpleTriangle triangle1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 5, 4);

        SimpleCircle circle1 = new SimpleCircle(5);
        SimpleCircle circle2 = new SimpleCircle(6);

        SimpleRectangle rectangle1 = new SimpleRectangle(4, 5);
        SimpleRectangle rectangle2 = new SimpleRectangle(6, 3);

        AbstractShape[] shapes = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        Container container = new Container(shapes);
        container.printShapeWithMaxArea();
        container.printShapeWithMinArea();
        container.printShapeWithMaxPerimeter();
        container.printShapeWithMinPerimeter();
    }
}
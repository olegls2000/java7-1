package bte;

import bte.model.simple.*;
import bte.service.Container;

public class HomeWorkLesson8 {
    public static void main(String[] args) {

        SimpleTriangle triangle1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 5, 4);

        SimpleCircle circle1 = new SimpleCircle(5);
        SimpleCircle circle2 = new SimpleCircle(6);

        SimpleRectangle rectangle1 = new SimpleRectangle(4, 5);
        SimpleRectangle rectangle2 = new SimpleRectangle(6, 3);

        WithPerimeter[] shapesPerimeter = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        WithArea[] shapesArea = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        Container container = new Container(shapesArea, shapesPerimeter);
        container.printShapeWithMaxArea();
        container.printShapeWithMinArea();
        container.printShapeWithMaxPerimeter();
        container.printShapeWithMinPerimeter();
    }
}
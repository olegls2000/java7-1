package bte.util;

import bte.model.simple.*;
import bte.service.ContainerArea;
import bte.service.ContainerPerimeter;

import java.awt.*;

public class HomeWork8 {
    public static void main(String[] args) {
        SimpleTriangle triangle1 = new SimpleTriangle(8, 4, 7);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 4, 2);

        SimpleCircle circle1 = new SimpleCircle(11);
        SimpleCircle circle2 = new SimpleCircle(7);

        SimpleRectangle rectangle1 = new SimpleRectangle(9, 2);
        SimpleRectangle rectangle2 = new SimpleRectangle(3, 1);

        WithPerimeter[] perimeters = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        WithArea[] areas = {(WithArea) triangle1, (WithArea) triangle2, circle1, circle2, rectangle1, rectangle2};
        ContainerPerimeter containerP = new ContainerPerimeter(perimeters);
        ContainerArea containerA = new ContainerArea(areas);
        containerA.printShapeWithMaxArea();
        containerA.printShapeWithMinArea();
        containerP.printShapeWithMaxPerimeter();
        containerP.printShapeWithMinPerimeter();
    }
}

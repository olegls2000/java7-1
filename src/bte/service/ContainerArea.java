package bte.service;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

public class ContainerArea implements WithArea {
    private WithArea[] shapes;

    public ContainerArea(WithArea[] shapes) {
        this.shapes = shapes;
    }

    public WithArea[] getShapes() {
        return shapes;
    }

    public void setShapes(WithArea[] shapes) {
        this.shapes = shapes;
    }

    public void printShapeWithMaxArea() {
        WithArea shapeMaxArea = shapes[0];
        for (WithArea shape : shapes) {
            if (shape.getArea() > shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Biggest area have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getArea());
    }

    private String getShapeName(WithArea shape) {
        String result = "";
        if (shape instanceof SimpleCircle) {
            result = "Circle";
        } else if (shape instanceof SimpleTriangle) {
            result = "Triangle";
        } else if (shape instanceof SimpleRectangle) {
            result = "Rectangle";
        }
        return result;
    }

    public void printShapeWithMinArea() {
        WithArea shapeMinArea = shapes[0];
        for (WithArea shape : shapes) {
            if (shape.getArea() < shapeMinArea.getArea()) {
                shapeMinArea = shape;
            }
        }
        System.out.println("Smallest area have shape: " + getShapeName(shapeMinArea) + " " + shapeMinArea.getArea());
    }

    @Override
    public double getArea() {
        return 0;
    }
}

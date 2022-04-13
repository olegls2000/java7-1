package bte.service;

import bte.model.simple.AbstractShape;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;

public class Container {
    private AbstractShape[] shapes;

    public Container(AbstractShape[] shapes) {
        this.shapes = shapes;
    }

    public void printShapeWithMaxArea() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getArea() > shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Biggest area have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getArea());
    }

    private String getShapeName(AbstractShape shape) {
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
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getArea() < shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Smallest area have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getArea());
    }

    public void printShapeWithMaxPerimeter() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() > shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Biggest perimeter have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getPerimeter());
    }

    public void printShapeWithMinPerimeter() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() < shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Smallest perimeter have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getPerimeter());
    }

    public AbstractShape[] getShapes() {
        return shapes;
    }

    public void setShapes(AbstractShape[] shapes) {
        this.shapes = shapes;
    }
}

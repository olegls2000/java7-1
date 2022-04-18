package bte.service;


import bte.model.simple.*;

public class Container {
    private WithArea[] shapesWithArea;
    private WithPerimeter[] shapesWithPerimeter;

    public Container(WithArea[] shapesWithArea, WithPerimeter[] shapesWithPerimeter) {
        this.shapesWithArea = shapesWithArea;
        this.shapesWithPerimeter = shapesWithPerimeter;
    }

    public void printShapeWithMaxArea() {
        WithArea shapeMaxArea = shapesWithArea[0];
        for (WithArea shape : shapesWithArea) {
            if (shape.getArea() > shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Biggest area have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getArea());
    }

    private String getShapeName(Object shape) {
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
        WithArea shapeMaxArea = shapesWithArea[0];
        for (WithArea shape : shapesWithArea) {
            if (shape.getArea() < shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Smallest area have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getArea());
    }

    public void printShapeWithMaxPerimeter() {
        WithPerimeter shapeMaxArea = shapesWithPerimeter[0];
        for (WithPerimeter shape : shapesWithPerimeter) {
            if (shape.getPerimeter() > shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Biggest perimeter have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getPerimeter());
    }

    public void printShapeWithMinPerimeter() {
        WithPerimeter shapeMaxArea = shapesWithPerimeter[0];
        for (WithPerimeter shape : shapesWithPerimeter) {
            if (shape.getPerimeter() < shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        System.out.println("Smallest perimeter have shape: " + getShapeName(shapeMaxArea) + " " + shapeMaxArea.getPerimeter());
    }
}

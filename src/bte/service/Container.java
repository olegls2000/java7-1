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
        String shapeType = "";
        if (shapeMaxArea instanceof SimpleCircle) {
            shapeType = "Circle";
        } else if (shapeMaxArea instanceof SimpleTriangle) {
            shapeType = "Triangle";
        } else if (shapeMaxArea instanceof SimpleRectangle) {
            shapeType = "Rectangle";
        }
        System.out.println("Biggest area have shape: " + shapeType + " " + shapeMaxArea.getArea());
    }

    public void printShapeWithMinArea() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getArea() < shapeMaxArea.getArea()) {
                shapeMaxArea = shape;
            }
        }
        String shapeType = "";
        if (shapeMaxArea instanceof SimpleCircle) {
            shapeType = "Circle";
        } else if (shapeMaxArea instanceof SimpleTriangle) {
            shapeType = "Triangle";
        } else if (shapeMaxArea instanceof SimpleRectangle) {
            shapeType = "Rectangle";
        }
        System.out.println("Smallest area have shape: " + shapeType + " " + shapeMaxArea.getArea());
    }

    public void printShapeWithMaxPerimeter() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() > shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        String shapeType = "";
        if (shapeMaxArea instanceof SimpleCircle) {
            shapeType = "Circle";
        } else if (shapeMaxArea instanceof SimpleTriangle) {
            shapeType = "Triangle";
        } else if (shapeMaxArea instanceof SimpleRectangle) {
            shapeType = "Rectangle";
        }
        System.out.println("Biggest perimeter have shape: " + shapeType + " " + shapeMaxArea.getPerimeter());
    }

    public void printShapeWithMinPerimeter() {
        AbstractShape shapeMaxArea = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() < shapeMaxArea.getPerimeter()) {
                shapeMaxArea = shape;
            }
        }
        String shapeType = "";
        if (shapeMaxArea instanceof SimpleCircle) {
            shapeType = "Circle";
        } else if (shapeMaxArea instanceof SimpleTriangle) {
            shapeType = "Triangle";
        } else if (shapeMaxArea instanceof SimpleRectangle) {
            shapeType = "Rectangle";
        }
        System.out.println("Smallest perimeter have shape: " + shapeType + " " + shapeMaxArea.getPerimeter());
    }

    public AbstractShape[] getShapes() {
        return shapes;
    }

    public void setShapes(AbstractShape[] shapes) {
        this.shapes = shapes;
    }
}

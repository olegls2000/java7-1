package bte.service;

import bte.model.simple.*;

public class ContainerPerimeter implements WithPerimeter {
    private WithPerimeter[] shapes;

    public ContainerPerimeter(WithPerimeter[] shapes) {
        this.shapes = shapes;
    }

    public WithPerimeter[] getShapes() {
        return shapes;
    }

    public void setShapes(WithPerimeter[] shapes) {
        this.shapes = shapes;
    }

    public void printShapeWithMaxPerimeter() {
        WithPerimeter shapeMaxPerimeter = shapes[0];
        for (WithPerimeter shape : shapes) {
            if (shape.getPerimeter() > shapeMaxPerimeter.getPerimeter()) {
                shapeMaxPerimeter = shape;
            }
        }
        System.out.println("Biggest perimeter have shape: " + getShapeName(shapeMaxPerimeter) + " " + shapeMaxPerimeter.getPerimeter());
    }

    private String getShapeName(WithPerimeter shape) {
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

    public void printShapeWithMinPerimeter() {
        WithPerimeter shapeMinPerimeter = shapes[0];
        for (WithPerimeter shape : shapes) {
            if (shape.getPerimeter() < shapeMinPerimeter.getPerimeter()) {
                shapeMinPerimeter = shape;
            }
        }
        System.out.println("Smallest perimeter have shape: " + getShapeName(shapeMinPerimeter) + " " + shapeMinPerimeter.getPerimeter());
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}

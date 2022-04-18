package bte.service;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;

import java.util.function.Function;

public class ShapeContainerInterface {
    private final int INITIAL_CAPACITY = 2;
    private TwoInterfaces[] shapes;
    private int freeSlot;
    private int capacity;

    public ShapeContainerInterface() {
        shapes = new TwoInterfaces[INITIAL_CAPACITY];
        freeSlot = 0;
        capacity = INITIAL_CAPACITY;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addShape(TwoInterfaces shape) {

        if (freeSlot >= capacity) {
            capacity *= 2;
            TwoInterfaces[] tmp = new TwoInterfaces[capacity];
            System.arraycopy(shapes, 0, tmp, 0, shapes.length);
            shapes = tmp;
        }
        shapes[freeSlot] = shape;
        freeSlot++;
    }

    private String findType(Object shapeMaxPerimeter) {
        String shapeType = "";
        if (shapeMaxPerimeter instanceof SimpleTriangle) {
            shapeType = "Triangle";
        } else if (shapeMaxPerimeter instanceof SimpleRectangle) {
            shapeType = "Rectangle";
        } else if (shapeMaxPerimeter instanceof SimpleCircle) {
            shapeType = "Circuit";
        }
        return shapeType;
    }

    public void printNameWithMaxPerimeter() {
        var shapeMaxPerimeter = shapes[0];
        double maxPerimeter = shapeMaxPerimeter.getPerimeter();
        for (var s : shapes) {
            if (s != null) {
                if (s.getPerimeter() > maxPerimeter) {
                    shapeMaxPerimeter = s;
                }
            } else
                break;
        }

        System.out.println(findType(shapeMaxPerimeter) + " with max perimeter " +
                shapeMaxPerimeter.getPerimeter() + "!!!");
    }

    public void printNameWithMinPerimeter() {
        var shapeMinPerimeter = shapes[0];
        double minPerimeter = shapeMinPerimeter.getPerimeter();
        for (var s : shapes) {
            if (s != null) {
                if (s.getPerimeter() < minPerimeter) {
                    shapeMinPerimeter = s;
                }
            } else
                break;
        }

        System.out.println(findType(shapeMinPerimeter) + " with min perimeter " +
                shapeMinPerimeter.getPerimeter() + "!!!");
    }

    public void printNameWithMinSquare() {
        var shapeSquare = shapes[0];
        double minSquare = shapeSquare.getArea();
        for (var s : shapes) {
            if (s != null) {
                if (s.getArea() < minSquare) {
                    shapeSquare = s;
                }
            } else
                break;
        }

        System.out.println(findType(shapeSquare) + " with min square " +
                shapeSquare.getArea() + "!!!");
    }

    public void printNameWithMaxSquare() {
        var shapeSquare = shapes[0];
        double maxSquare = shapeSquare.getArea();
        for (var s : shapes) {
            if (s != null) {
                if (s.getArea() > maxSquare) {
                    shapeSquare = s;
                }
            } else
                break;
        }

        System.out.println(findType(shapeSquare) + " with max square " +
                shapeSquare.getArea() + "!!!");
    }

    public void printNameWithMaxFunction(Function<TwoInterfaces,Double> func) {
        var shapeF = shapes[0];
        double functionality = func.apply(shapeF);

        for (var s : shapes) {
            if (s != null) {

                if (func.apply(shapeF) > functionality) {
                    shapeF = s;
                }
            } else
                break;
        }

        System.out.println(findType(shapeF) + " with max functionality(?) " +
                func.apply(shapeF) + "!!!");
    }
    public void printNameWithMaxSquareF() {
        printNameWithMaxFunction(TwoInterfaces::getArea);
    }
}

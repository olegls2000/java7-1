package bte;

import bte.model.AbstractEmployee;
import bte.model.Accountant;
import bte.model.Administrator;
import bte.model.Developer;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.service.Company;
import bte.service.CompanyPoly;
import bte.service.ShapeContainer;

public class Lesson8 {
    public static void main(String[] args) {
        Developer[] developers = {
                new Developer(30, "Alex", 33_000, "Java"),
                new Developer(100, "AlexOld", 103_000, "Java"),
        };
        Accountant[] accountants = {
                new Accountant("Niina", 36, 14_000, "DevOps"),
        };
        Administrator[] administrators = {
                new Administrator("Ivan", 45, 60_000, "DevOps")
        };

        Developer developer = new Developer(30, "Alex", 33_000, "Java");
        Accountant accounter =
                new Accountant("Niina", 36, 14_000, "DevOps");
        AbstractEmployee[] emp = {developer, accounter};

        CompanyPoly meta = new CompanyPoly(emp);
        meta.printNameWithBiggestSalary();
        SimpleTriangle tr1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle tr2 = new SimpleTriangle(3, 5, 4);

        SimpleTriangle[] triangles = {tr1, tr2};

        SimpleCircle cir1 = new SimpleCircle(5);
        SimpleCircle cir2 = new SimpleCircle(6);
        SimpleCircle[] circuits = {cir1, cir2};

        SimpleRectangle rec1 = new SimpleRectangle(4, 5);
        SimpleRectangle rec2 = new SimpleRectangle(6, 3);
        SimpleRectangle[] rectangles = {rec1, rec2};
        Company comp = new Company(developers, accountants, administrators);
        comp.findNameWithTheBiggestSalary();


        ShapeContainer containerOfShapes = new ShapeContainer();
        SimpleCircle circle = new SimpleCircle(5);
        SimpleCircle circle1 = new SimpleCircle(1);
        SimpleRectangle rectangle = new SimpleRectangle(2, 3);
        SimpleTriangle triangle = new SimpleTriangle(3, 6, 7);
        containerOfShapes.addShape(circle);
        containerOfShapes.addShape(circle1);
        containerOfShapes.addShape(rectangle);
        containerOfShapes.addShape(triangle);

        containerOfShapes.printNameWithMaxPerimeter();
        containerOfShapes.printNameWithMinPerimeter();
        containerOfShapes.printNameWithMaxSquare();
        containerOfShapes.printNameWithMinSquare();

        containerOfShapes.printNameWithMaxSquareF();

        SimpleRectangle recA = new SimpleRectangle(4, 5);
        SimpleRectangle recB = new SimpleRectangle(6, 3);
        Object[] rectangles1 = {rec1, rec2};


    }


}

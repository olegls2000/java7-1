package bte;

import bte.model.AbstractEmploy;
import bte.model.Accounter;
import bte.model.Administrator;
import bte.model.Developer;
import bte.model.simple.AbstractShape;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.service.Company;
import bte.service.CompanyPoly;

public class Lesson8 {

    public static void main(String[] args) {
        Developer[] developers = {
                new Developer(30, "Jo", 30_000, "Python"),
                new Developer(22, "Chack", 20_000, "JS")
        };
        Administrator[] administrators = {
                new Administrator(30, "Mike", 15_000, "Logistic"),
                new Administrator(22, "Max", 10_000, "Supply")
        };
        Accounter[] accounters = {
                new Accounter(30, "Mila", 33_000, "DevOps"),
                new Accounter(22, "Olga", 24_000, "Admin")
        };

        Company google = new Company(developers, administrators, accounters);
        google.printNameWithBiggestSalary();

        AbstractEmploy developer = new Developer(30, "Jo", 30_000, "Python");
        developer.getSalary();
        AbstractEmploy accounter = new Accounter(30, "Mila", 33_000, "DevOps");
        Administrator administrator = new Administrator(22, "Max", 10_000, "Supply");
        administrator.getDepartment();
        administrator.getSalary();
        administrator.hashCode();

        AbstractEmploy[] employee = {developer,accounter,administrator};

        CompanyPoly meta = new CompanyPoly(employee);
        meta.printNameWithBiggestSalary();

        SimpleTriangle triangle1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 5, 4);
        // SimpleTriangle[] triangles = {triangle1, triangle2};

        SimpleCircle circle1 = new SimpleCircle(5);
        SimpleCircle circle2 = new SimpleCircle(6);
        // SimpleCircle[] circles = {circle1, circle2};

        SimpleRectangle rectangle1 = new SimpleRectangle(4, 5);
        SimpleRectangle rectangle2 = new SimpleRectangle(6, 3);
        // SimpleRectangle[] rectangles = {rectangle1, rectangle2};

        AbstractShape[] shapes = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        AbstractShape maxPerimeterShape = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() > maxPerimeterShape.getPerimeter()) {
                maxPerimeterShape = shape;
            }
        }
        System.out.println("Max perimeter shape is " + maxPerimeterShape);
    }
}

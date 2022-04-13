package bte;

import bte.model.*;
import bte.model.simple.AbstractShape;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.service.Company;
import bte.service.CompanyPoly;

public class Lesson8 {

   /* Создайте класс Компания. В комании работают:
    программисты (возраст, имя, ЗП, язык программирования),
    администраторы (возраст, имя, ЗП, отдел) и бухгалтеры (возраст, имя, ЗП и отдел).
    Создайте конструктор с параметрами   для всех классов для всех параметров.
    Реализуйте в классе Компания метод, определяющий имя сотрудника с самой  большой ЗП.
    */

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


        AbstractEmployee developer = new Developer(30, "Jo", 30_000, "Python");
        //developer.getProgrammingLanguage();
        developer.getSalary();
        AbstractEmployee accounter = new Accounter(30, "Mila", 33_000, "DevOps");
        Administrator administrator = new Administrator(30, "Mike", 15_000, "Logistic");
        administrator.getDepartment(); // From Administrator
        administrator.getSalary();// From AbstractEmployee
        administrator.hashCode();
        Object randomObject = new Developer(30, "Jo", 30_000, "Python");
        Object randomObject1 = new Triangle(null, null, null);
        randomObject.hashCode();

        AbstractEmployee[] employees = {developer, accounter, administrator};

        CompanyPoly meta = new CompanyPoly(employees);
        meta.printNameWithBiggestSalary();

/*        AbstractEmployee abstractEmployee =
                new AbstractEmployee(30, "Jo", 30_000);*/

        SimpleTriangle triangle1 = new SimpleTriangle(44, 44, 44);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 5, 4);
        //SimpleTriangle[] triangles = {triangle1, triangle2};
        SimpleCircle circle1 = new SimpleCircle(5);
        SimpleCircle circle2 = new SimpleCircle(6);
        //SimpleCircle[] circles = {circle1, circle2};
        SimpleRectangle rectangle1 = new SimpleRectangle(4, 5);
        SimpleRectangle rectangle2 = new SimpleRectangle(6, 3);
        //SimpleRectangle[] rectangles = {rectangle1, rectangle2};

        AbstractShape[] shapes = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        AbstractShape maxPerimShape = shapes[0];
        for (AbstractShape shape : shapes) {
            if (shape.getPerimeter() > maxPerimShape.getPerimeter()) {
                maxPerimShape = shape;
            }
        }
        String shapeString = maxPerimShape.toString();

        int i = 9;

        System.out.println("Max perimeter shape is: "+ shapeString);

    }
}
package bte.util;

import bte.model.AbstractEmployee;
import bte.model.Accounter;
import bte.model.Admin;
import bte.model.Developer;
import bte.model.simple.AbstractShape;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.service.Company;
import bte.service.CompanyPoly;

public class Lesson8 {
    public static void main(String[] args) {
        Developer[] developers ={
            new Developer(30, "Jo", 30_000, "Python"),
            new Developer(20, "Mark", 20_000, "JS")
        };
        Admin[] admins = {
            new Admin(33, "Mike", 10_000, "DevOps"),
            new Admin(22, "Max", 15_000, "Admin")
        };
        Accounter[] accounters = {
            new Accounter(40, "Mila", 12_000, "Logistic"),
            new Accounter(45, "Ira", 17_000, "Suply")
        };
        Company google = new Company(developers, admins, accounters);
        google.printNameWithBiggestSalary();

        AbstractEmployee developer = new Developer(30, "Jo", 30_000, "Python");
        //developer.getProgrammingL();
        developer.getSalary();

        AbstractEmployee accounter = new Accounter(40, "Mila", 12_000, "Logistic");
        AbstractEmployee admin = new Admin(33, "Mike", 10_000, "DevOps");
        Object randomObject = new Developer(30, "Jo", 30_000, "Python");
        randomObject.hashCode();

        AbstractEmployee[] employees = {developer, accounter, admin};

        CompanyPoly meta = new CompanyPoly(employees);


        SimpleTriangle triangle1 = new SimpleTriangle(4, 4, 4);
        SimpleTriangle triangle2 = new SimpleTriangle(3, 5, 4);
        //SimpleTriangle[] triangles = {triangle1, triangle2};

        SimpleCircle circle1 = new SimpleCircle(5);
        SimpleCircle circle2 = new SimpleCircle(5);
        //SimpleCircle[] circles = {circle1, circle2};

        SimpleRectangle rectangle1 = new SimpleRectangle(4, 5);
        SimpleRectangle rectangle2 = new SimpleRectangle(6, 3);
        //SimpleRectangle[] rectangles = {rectangle1, rectangle2};

        AbstractShape[] shapes = {triangle1, triangle2, circle1, circle2, rectangle1, rectangle2};
        AbstractShape maxPerimShape = shapes[2];
        for (AbstractShape shape : shapes){
            if(shape.getPerimetr() > maxPerimShape.getPerimetr()){
                maxPerimShape = shape;
            }
        }
        System.out.println(maxPerimShape.toString());

    }
}

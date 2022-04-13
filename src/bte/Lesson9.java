package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleRectangle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.WithArea;

import static bte.util.Print.print;

public class Lesson9 {
    public static void main(String[] args) {
        WithArea shape = new SimpleCircle(5);
        shape.getArea();
        shape.newMethod();
        int y = shape.COUNT;
        int y1 = WithArea.COUNT;
        //WithArea.COUNT = 6;
        String str = "My String";
        String str1 = "My String";
        String str2 = new String("My String");
        print(str == str1);// true
        print(str1 == str2);// false
        print(str.equals(str1));//true
        print(str.equals(str2));//true

        SimpleTriangle simpleTriangle = new SimpleTriangle(4,4,1);
        SimpleCircle circle1 = new SimpleCircle(6);
        SimpleCircle circle2 = new SimpleCircle(6);
        print(circle1 == circle2);//false
        print(circle1.equals(circle2));//false
        print(circle1.equals(simpleTriangle));//false

        SimpleRectangle rectangle1 = new SimpleRectangle(5,10);
        SimpleRectangle rectangle2 = new SimpleRectangle(5,15);
        print(rectangle1 == rectangle2);
        print(rectangle1.equals(rectangle2));
        print(rectangle1.equals(simpleTriangle));
        print(rectangle1.equals(circle1));
    }
}

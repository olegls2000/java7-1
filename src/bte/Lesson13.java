package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;

import java.util.*;

import static bte.util.Print.print;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
//        arrayList.add(Integer.valueOf(3));
//        arrayList.add(Double.valueOf(3));
//        arrayList.add(new Point(1,1));

//        arrayList.add("RED");
//        arrayList.add("GREEN");
//        arrayList.add("BLUE");
//        arrayList.add(1, "WHITE");
//        print(arrayList.size());
//        print(arrayList);
//        print();
//        for (String item : arrayList) {
//            print(item);
//        }
//        print();
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            print(iterator.next());
//        }
//        print();
//        for (int i = 0; i < arrayList.size(); i++) {
//            print(arrayList.get(i));
//        }
//

        List<Integer> intList = new ArrayList();
        for (int i = 0; i < 100; i++) {
            intList.add(0, i);
        }
        for (int i = 0; i < intList.size() / 2; i++) {
            //print(intList.get(i));
        }

        final List<SimpleCircle> simpleCircles = generateCircleList(2_000);
        final SimpleCircle maxPerimCircle = getCircleMaxPerimeter(simpleCircles);
        print("Max prim circle: " + maxPerimCircle);


        Set<SimpleTriangle> triangleSet = new HashSet<>();
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        triangleSet.add(new SimpleTriangle(2, 2, 2));
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        print("Set size: " + triangleSet.size());
        boolean isContains = triangleSet.contains(new SimpleTriangle(3, 2, 2));
        print(isContains);

        for (SimpleTriangle triangle :
                triangleSet) {
            print(triangle);
        }
        Set<SimpleCircle> set1 = generateCircleSet(30);
        print(set1.size());
        Set<SimpleCircle> set2 = generateCircleSet(300);
        print(set2.size());
        Set<SimpleCircle> set3 = generateCircleSet(3000);
        print(set3.size());

        Set<SimpleTriangle> triangleTreeSet = new TreeSet<>();


    }
    private static Set<SimpleCircle>generateCircleSet(int count){
        Set<SimpleCircle> simpleCircleSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            simpleCircleSet.add(new SimpleCircle());

        }
        return simpleCircleSet;
    }

    private static List<SimpleCircle> generateCircleList(int count) {
        final var result = new ArrayList<SimpleCircle>();
        for (int i = 0; i < count; i++) {
            result.add(new SimpleCircle());
        }
        return result;
    }

    private static SimpleCircle getCircleMaxPerimeter(List<SimpleCircle> circles) {
        var result = circles.get(0);

        for (SimpleCircle circle : circles) {
            if (circle.getPerimeter() > result.getPerimeter()) {
                result = circle;
            }

        }
        return result;

    }
}


package bte;

import bte.model.Triangle;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.SimpleTriangleSideAComparator;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(10);
        //  arrayList.add(Integer.valueOf(3));
        //  arrayList.add(Double.valueOf(3.0));
        arrayList.add("RED");
        arrayList.add("GREEN");
        arrayList.add("BLUE");
        arrayList.add(1, "WHITE");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        for (String item : arrayList) {
            System.out.println(item);
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        List<Integer> intList = new ArrayList(40);
        for (int i = 0; i < 40; i++) {
            intList.add(0, i);
        }


        for (int i = 0; i < intList.size() / 2; i++) {
            System.out.println(intList.get(i));
        }
        System.out.println(intList.subList(0, intList.size() / 2));

        final List<SimpleCircle> simpleCircles = generateCircleList(2000);
        final SimpleCircle maxPerimeter = getCircleMaxPerimeter(simpleCircles);
        System.out.println("Max perimeter circle: " + maxPerimeter);

        Set<SimpleTriangle> triangleSet = new HashSet<>();
        triangleSet.add(new SimpleTriangle(1,1,1));
        triangleSet.add(new SimpleTriangle(2,2,2));
        System.out.println("Set size: " + triangleSet.size());
        boolean isContains = triangleSet.contains(new SimpleTriangle(1,1,1));
        System.out.println(isContains);
        for(SimpleTriangle triangle:triangleSet){
            System.out.println(triangle);
        }
        Set<SimpleCircle> set1 = generateCircleSet(30);
        System.out.println(set1.size());
        Set<SimpleCircle> set2 = generateCircleSet(300);
        System.out.println(set2.size());
        Set<SimpleCircle> set3 = generateCircleSet(3000);
        System.out.println(set3.size());

        Set<SimpleTriangle> triangleTreeSet = new TreeSet<>();
        triangleTreeSet.add(new SimpleTriangle(3,3,3));
        triangleTreeSet.add(new SimpleTriangle(4,4,4));
        triangleTreeSet.add(new SimpleTriangle(3,3,3));

        SimpleTriangleSideAComparator sideAComparator = new SimpleTriangleSideAComparator();
        Set<SimpleTriangle> triangleTreeSetSideA = new TreeSet<>(sideAComparator);
        triangleTreeSetSideA.add(new SimpleTriangle(3,3,3));
        triangleTreeSetSideA.add(new SimpleTriangle(4,4,4));
        triangleTreeSetSideA.add(new SimpleTriangle(2,2,2));
        triangleTreeSetSideA.add(new SimpleTriangle(1,4,4));
        System.out.println(triangleTreeSetSideA);
    }

    private static Set<SimpleCircle> generateCircleSet(int count){
        Set<SimpleCircle> circles = new HashSet<>();
        for (int i = 0; i < count; i++) {
            circles.add(new SimpleCircle());
        }
        return circles;
    }

    private static List<SimpleCircle> generateCircleList(int count) {
        var circleList = new ArrayList();
        for (int i = 0; i < count; i++) {
            circleList.add(new SimpleCircle());
        }
        return circleList;
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


import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.SimpleTriangleSideAComparator;

import java.util.*;

public class Lesson13 {

    public static void main(String[] args) {
        //Write a Java program to create a new array list, add some colors (string) and print out the collection.
        List<String> arrayList = new ArrayList<>(10);
        //arrayList.add(Integer.valueOf(3));
        //arrayList.add(Double.valueOf(3));
        //arrayList.add(new Point(1, 1));
        arrayList.add("RED");
        arrayList.add("GREEN");
        arrayList.add("BLUE");
        arrayList.add(1, "WHITE");
        System.out.println(arrayList.size());
        System.out.println(arrayList);

        //Write a Java program to iterate through all elements in a array list via Iterator
        for (String item : arrayList) {
            System.out.println(item);
        }

        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Write a Java program to insert 10 element into the
        // array list at the first position

        //0
        //1, 0
        //2, 1, 0 ...
        List<Integer> intList = new ArrayList();
        for (int i = 0; i < 40; i++) {
            intList.add(0, Integer.valueOf(i));
        }

        //print first half of elements 0 ... 20 .
        //40, 39, 38, ... 20
        for (int i = 0; i < intList.size() / 2; i++) {
            System.out.println(intList.get(i));
        }

        System.out.println(intList.subList(0, intList.size() / 2));

        // Create a collection with 100 triangles. Find a Triangle with the biggest Perimeter.
        final List<SimpleCircle> simpleCircles = generateCircleList(20000);
        final SimpleCircle maxPerimCircle = getCircleMaxPerimeter(simpleCircles);
        System.out.println("Max perim circle: " + maxPerimCircle);

        Set<SimpleTriangle> triangleSet = new HashSet<>();

        triangleSet.add(new SimpleTriangle(2, 2, 2));
        boolean addResult = triangleSet.add(new SimpleTriangle(2, 2, 2));
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        System.out.println("Set size: " + triangleSet.size());
        boolean isContains = triangleSet.contains(new SimpleTriangle(3, 2, 2));
        System.out.println(isContains);
        for (SimpleTriangle triangle : triangleSet) {
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


        SimpleTriangleSideAComparator sideAComparator =
                new SimpleTriangleSideAComparator();
        Set<SimpleTriangle> triangleTreeSetSideA = new TreeSet<>(sideAComparator);

        triangleTreeSetSideA.add(new SimpleTriangle(3,3,3));
        triangleTreeSetSideA.add(new SimpleTriangle(5,5,3));
        triangleTreeSetSideA.add(new SimpleTriangle(4,4,4));
        triangleTreeSetSideA.add(new SimpleTriangle(2,3,3));
        System.out.println(triangleTreeSetSideA);


    }

    private static Set<SimpleCircle> generateCircleSet(int count) {

        //TODO
        return Collections.EMPTY_SET;
    }

    private static List<SimpleCircle> generateCircleList(int count) {
        final var result = new ArrayList<SimpleCircle>();
        for (int i = 0; i < count; i++) {
            result.add(new  SimpleCircle());
        }
        return result;
    }

    private static SimpleCircle getCircleMaxPerimeter(
            List<SimpleCircle> circles) {
        var result = circles.get(0);
        for (SimpleCircle circle : circles) {
            if (circle.getPerimeter() > result.getPerimeter()) {
                result = circle;
            }
        }
        return result;
    }
}
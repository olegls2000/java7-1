package bte;

import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleCircleInterface;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.SimpleTriangleSideAComparator;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); //?
        arrayList.add(3);                      //?
        arrayList.add("string");               //?

        List<String> arrayStringList = new ArrayList<>();
        arrayStringList.add("RED");
        arrayStringList.add("RED");
        arrayStringList.add("GREEN");
        arrayStringList.add(1, "WHITE");
        System.out.println(arrayStringList);
        System.out.println(arrayList.size());

        for (var item : arrayStringList) {
            System.out.println(item);
        }
        for (int i = 0; i < arrayStringList.size(); i++) {
            System.out.println(arrayStringList.get(i));
        }

        Iterator<String> iterator = arrayStringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            list.add(0, i); //Integer.valueOf(i)
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < list.size() / 2; i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println(list.subList(0, list.size() / 2));

        List<SimpleCircle> circles = generateCircleList(20000);
        System.out.println(getCircleMaxPerimeter(circles));


        Set<SimpleTriangle> triangleSet = new HashSet<>();
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        triangleSet.add(new SimpleTriangle(2, 2, 2));
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        System.out.println("Set size " + triangleSet.size());

        boolean isContains = triangleSet.contains(new SimpleTriangle(3, 2, 2));
        System.out.println(isContains);


        for (var t : triangleSet) {
            System.out.println(t);
        }
        Set<SimpleCircleInterface> set1 = generateCircleSet(30);
        System.out.println(set1.size());
        Set<SimpleCircleInterface> set2 = generateCircleSet(300);
        System.out.println(set2.size());
        Set<SimpleCircleInterface> set3 = generateCircleSet(3000);
        System.out.println(set3.size());

        Set<SimpleTriangle> simpleTriangles= new TreeSet<>();
        triangleSet.add(new SimpleTriangle(3,3,3));
        triangleSet.add(new SimpleTriangle(4,3,2));
        triangleSet.add(new SimpleTriangle(5,6,3));

        SimpleTriangleSideAComparator simpleTriangleSideAComparator = new SimpleTriangleSideAComparator();
        Set<SimpleTriangle> triangles1= new TreeSet<>(simpleTriangleSideAComparator);

        triangles1.add(new SimpleTriangle(3,3,3));
        triangles1.add(new SimpleTriangle(4,3,2));
        triangles1.add(new SimpleTriangle(5,6,3));
        System.out.println(triangles1);

    }

    private static List<SimpleCircle> generateCircleList(int count) {
        List<SimpleCircle> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list.add(new SimpleCircle());
        }
        return list;
    }

    private static SimpleCircle getCircleMaxPerimeter(List<SimpleCircle> circles) {
        SimpleCircle maxC = circles.get(0);
        double max = maxC.getPerimeter();

        for (int i = 1; i < circles.size(); i++) {
            SimpleCircle current = circles.get(i);
            if (current.getPerimeter() > max) {
                max = current.getPerimeter();
                maxC = current;
            }
        }
        return maxC;
    }

    public static Set<SimpleCircleInterface> generateCircleSet(int count) {
        Set<SimpleCircleInterface> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(new SimpleCircleInterface());
        }
        return set;
    }

}

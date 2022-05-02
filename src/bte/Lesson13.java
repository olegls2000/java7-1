package bte;

import bte.model.Point;
import bte.model.simple.SimpleCircle;
import bte.model.simple.SimpleTriangle;
import bte.model.simple.SimpleTriangleSideAComporator;
import bte.pattern.iterator.Collection;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("RED");
        list.add("BLUE");
        list.add("GREEN");
        list.add(1, "WHITE");
        //System.out.println(list.size());
        //System.out.println(list);

        for (String s : list) {
            //System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.println(list.get(i));
        }

        Iterator iterator = list.iterator();
     /*   while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            intList.add(0, i);
        }

        for (int i = 0; i < intList.size() / 2; i++) {
           // System.out.println(intList.get(i));
        }

        final List<SimpleCircle> simpleCircles = generateCircleList(20000);
        final SimpleCircle maxPerimCircle = getCircleMaxPerimetr(simpleCircles);
        //System.out.println("Max perimetr circle: " + maxPerimCircle);

        Set<SimpleTriangle> triangleSet = new HashSet<>();
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        triangleSet.add(new SimpleTriangle(2, 2, 2));
        triangleSet.add(new SimpleTriangle(1, 1, 1));
        System.out.println(triangleSet.size());
        boolean isContains = triangleSet.contains(new SimpleTriangle(1, 1, 1));
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
        triangleTreeSet.add(new SimpleTriangle(3, 3, 3));
        triangleTreeSet.add(new SimpleTriangle(4, 4, 4));
        triangleTreeSet.add(new SimpleTriangle(3, 3, 3));


        SimpleTriangleSideAComporator triangleSideAComporator = new SimpleTriangleSideAComporator();
        Set<SimpleTriangle> triangleTreeSetSideA = new TreeSet<>(triangleSideAComporator);
        triangleTreeSetSideA.add(new SimpleTriangle(3, 3, 3));
        triangleTreeSetSideA.add(new SimpleTriangle(5, 4, 4));
        triangleTreeSetSideA.add(new SimpleTriangle(2, 3, 3));
        System.out.println(triangleTreeSetSideA);
    }

    private static List<SimpleCircle> generateCircleList(int count) {
        List<SimpleCircle> circleList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            circleList.add(new SimpleCircle());
        }
        return circleList;
    }

    private static SimpleCircle getCircleMaxPerimetr(List<SimpleCircle> circles) {
        SimpleCircle max = circles.get(0);
        for (int i = 0; i < circles.size(); i++) {
            if (circles.get(i).getPerimeter() > max.getPerimeter()) {
                max = circles.get(i);
            }
        }
        return max;
    }

    private static Set<SimpleCircle> generateCircleSet(int count){
        Set<SimpleCircle> circles = new HashSet<>();
        for (int i = 0; i < count; i++) {
            circles.add(new SimpleCircle()); {
            }
        }
        return circles;
    }
    }

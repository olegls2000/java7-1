package bte;

import bte.model.simple.SimpleTriangle;
import java.util.*;

public class HomeWorkLesson13 {
    public static void main(String[] args) {
        var list1 = new ArrayList<>(30);
        var list2 = new ArrayList<>();
        var list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(1);
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list1.addAll(list2);
        list3.addAll(list1);
        System.out.println(list1 + " join two array lists");
        Collections.copy(list3,list2);
        System.out.println(list3 + "copy one array list into another");
        Collections.shuffle(list1);
        System.out.println(list1 + " shuffle elements in a array list");
        Collections.reverse(list1);
        System.out.println(list1 + " reverse elements in a array list");
        List revers = reversedList(list1);
        System.out.println(revers + " reverse elements in a array list");
        System.out.println(list1.subList(0,3) + " extract a portion of a array list");
        System.out.println(list1.equals(list2) + " compare two array lists");
        Collections.swap(list1,0,3);
        System.out.println(list1 + " swap two elements in an array list");
        list2.removeAll(list2);
        System.out.println(list2 + " empty an array list");
        System.out.println(list2.isEmpty() + " test an array list is empty or not");
        list1.trimToSize();
        System.out.println(list1.size() + " trim the capacity of an array list the current list size");
        HashSet<Object> hashSet1 = new HashSet<>();
        HashSet<Object> hashSet2 = new HashSet<>();
        hashSet1.add(list1);
        hashSet2.add(list1);
        System.out.println(hashSet1.equals(hashSet2) + " compare two hash sets");
        boolean hashSet3 = hashSet1.retainAll(hashSet2);
        System.out.println(hashSet3 + " compare two sets and retain elements which are same for both sets");
        TreeSet<SimpleTriangle> triangleTreeSet = new TreeSet<>();
        triangleTreeSet.add(new SimpleTriangle(3,3,3));
        triangleTreeSet.add(new SimpleTriangle(4,4,4));
        triangleTreeSet.add(new SimpleTriangle(3,4,3));
        System.out.println("First element of TreeSet is: " + triangleTreeSet.first());
        System.out.println("Last element of TreeSet is : " + triangleTreeSet.last());

    }

    public static List reversedList(List list) {
        List result = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i));
        }
        return result;
    }
}

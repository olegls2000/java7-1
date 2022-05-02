package bte.homework;

import java.util.*;

public class HomeworkListSet {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Masha");
        list1.add("Sasha");
        list1.add("Dasha");
        list1.add("Olga");
        ArrayList<String> list2 = new ArrayList<>(list1);
        Collections.copy(list2, list1); //1
        System.out.println(list2);

        Collections.shuffle(list2);    //2
        System.out.println(list2);

        Collections.reverse(list2);   //3
        System.out.println(list2);

        List<String> list3 = list2.subList(0, 2);  //4
        System.out.println(list3);

        System.out.println(Collections.disjoint(list1, list2)); //5

        Collections.swap(list2, 2, 0);   //6
        System.out.println(list2);

        list1.addAll(list2);        //7
        System.out.println(list1);

        list1.clear();            //8
        System.out.println(list1);

        System.out.println(list1.isEmpty());     //9

        list2.trimToSize();   //10

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
        set1.addAll(list2);
        set2.add("Masha");
        set2.add("Misha");
        set2.add("Alex");
        set2.add("Olga");

        System.out.println(set1.containsAll(set2));   //11

        set1.removeAll(set2);   //12
        System.out.println(set1);

        TreeSet<String> set = new TreeSet<>();   //13
        set.addAll(list2);
        System.out.println("the first is: " +  set.first() + " and the last is:" + set.last());

    }
}

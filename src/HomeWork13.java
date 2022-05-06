import java.util.*;

public class HomeWork13 {
    public static void main(String[] args) {
        var list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        System.out.println("List 1: " + list1);
        var list2 = new ArrayList<String>();
        list2.add("5");
        list2.add("6");
        list2.add("7");
        System.out.println("List 2: " + list2);
        Collections.copy(list1, list2);
        System.out.println("Copy List 2 to List 1:");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        var listShuffle = new ArrayList<String>();
        listShuffle.add("A");
        listShuffle.add("B");
        listShuffle.add("C");
        listShuffle.add("D");
        Collections.shuffle(listShuffle);
        System.out.println("List after shuffle: " + listShuffle);

        var listReverse = new ArrayList<String>();
        listReverse.add("A");
        listReverse.add("B");
        listReverse.add("C");
        listReverse.add("D");
        Collections.reverse(listReverse);
        System.out.println("List after reversing: " + listReverse);

        var listPart = new ArrayList<String>();
        listPart.add("1");
        listPart.add("2");
        listPart.add("3");
        listPart.add("4");
        listPart.add("5");
        var listPart1 = listPart.subList(1, 4);
        System.out.println("Part of list: " + listPart1);

        var a1 = new ArrayList<String>();
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Blue");

        var a2 = new ArrayList<String>();
        a2.add("Red");
        a2.add("Green");
        a2.add("Black");
        a2.add("Blue");

        var a3 = new ArrayList<String>();
        for (String a : a1)
            a3.add(a2.contains(a) ? "Yes" : "No");
        System.out.println(a3);

        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Blue");

        System.out.println("Array list before Swap:");
        for (String a : c1) {
            System.out.println(a);
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for (String b : c1) {
            System.out.println(b);

        }

        var l1 = new ArrayList<String>();
        l1.add("Red");
        l1.add("Green");
        l1.add("Black");
        l1.add("White");
        l1.add("Pink");

        System.out.println("Array list before Swap:");
        for (String a : l1) {
            System.out.println(a);
        }
        Collections.swap(l1, 0, 2);
        System.out.println("Array list after swap:");
        for (String b : l1) {
            System.out.println(b);

        }

        var j1 = new ArrayList<String>();
        j1.add("Red");
        j1.add("Green");
        j1.add("Black");
        j1.add("White");
        j1.add("Pink");
        System.out.println("List of first array: " + j1);
        var j2 = new ArrayList<String>();
        j2.add("Red");
        j2.add("Green");
        j2.add("Black");
        j2.add("Pink");
        System.out.println("List of second array: " + j2);

        var a = new ArrayList<String>();
        a.addAll(j1);
        a.addAll(j2);
        System.out.println("New array: " + a);

        var e1 = new ArrayList<String>();
        e1.add("Red");
        e1.add("Green");
        e1.add("Black");
        e1.add("White");
        e1.add("Pink");
        System.out.println("Original array list: " + e1);
        c1.removeAll(e1);
        System.out.println("Array list after remove all elements " + e1);

        var myArrayList = new ArrayList();
        if (myArrayList.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }

        var t1 = new ArrayList<String>();
        t1.add("Red");
        t1.add("Green");
        t1.add("Black");
        t1.add("White");
        t1.add("Pink");
        System.out.println("Original array list: " + t1);
        System.out.println("Let trim to size the above array: ");
        t1.trimToSize();
        System.out.println(t1);

        var h1 = new HashSet<String>();
        h1.add("Red");
        h1.add("Green");
        h1.add("Black");
        h1.add("White");

        var h2 = new HashSet<String>();
        h2.add("Red");
        h2.add("Pink");
        h2.add("Black");
        h2.add("Orange");
        HashSet<String> result_set = new HashSet<String>();
        for (String element : h1) {
            System.out.println(h2.contains(element) ? "Yes" : "No");



        }

        var hS1 = new HashSet<String>();
        hS1.add("Red");
        hS1.add("Green");
        hS1.add("Black");
        hS1.add("White");
        System.out.println("First HashSet content: " + hS1);
        var hS2 = new HashSet<String>();
        hS2.add("Red");
        hS2.add("Pink");
        hS2.add("Black");
        hS2.add("Orange");
        System.out.println("Second HashSet content: " + hS2);
        hS1.retainAll(hS2);
        System.out.println("HashSet content:");
        System.out.println(hS1);

        var tS = new TreeSet<String>();
        tS.add("Red");
        tS.add("Green");
        tS.add("Orange");
        tS.add("White");
        tS.add("Black");
        System.out.println("Tree set: ");
        System.out.println(tS);

        Object first_element = tS.first();
        System.out.println("First Element is: "+first_element);

        Object last_element = tS.last();
        System.out.println("Last Element is: "+last_element);
    }
}



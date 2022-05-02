package bte.collections;

import java.util.*;

public class Lesson13HW {
    public static void main(String[] args) {

        /* 1 */
        System.out.println("/* 1 */");
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("melon");
        list.add("grape");
        System.out.println(list);
        List<String> copiedList = new ArrayList<>(list.size());
        copiedList.add("1");
        copiedList.add(String.valueOf(5));
        copiedList.add("4");

        Collections.copy(copiedList, list);
        System.out.println(copiedList);
        var listCopy = ListUtils.copyList(list);
        System.out.println(listCopy);

        var copiedList2  = (ArrayList<String>)listCopy.clone();

        System.out.println(copiedList2);
        /* 1 */
        /* extra tasks ;)) */
        list.add("cucumber");
        System.out.println(list);
        System.out.println(listCopy);
        if (Collections.replaceAll(list, "apple", "cucumber")) {
            System.out.println("Modified!");
        }
        System.out.println(list);
        System.out.println(listCopy);
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
        System.out.println(listCopy);
        list.replaceAll((e) -> {
            if (e.equals("CUCUMBER")) {
                //    e=e.toLowerCase();
                e = "fruit";
            }
            return e;
        });
        System.out.println(list);
        /* 2 */
        System.out.println("/* 2 */");
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list, new Random(10));
        System.out.println(list);
        System.out.println(ListUtils.shuffleList(list));
        /* 2 */
        /* 3 */
        System.out.println("/* 3 */");
        System.out.println(listCopy);
        ListUtils.reverseList(listCopy);
        System.out.println(listCopy);
        Collections.reverse(listCopy);
        System.out.println(listCopy);
        /* 3 */
        /* 4 */
        System.out.println("/* 4 */");
        System.out.println(ListUtils.subList(listCopy, 1, 2));
        /* 4 */
        /* 5 */
        System.out.println("/* 5 */");
        List<String> list1 = new ArrayList<>();
        list.add("apple");
        list.add("melon");
        list.add("grape");
        List<String> list2 = new ArrayList<>();
        list.add("apple");
        list.add("cucumber");
        list.add("grape");
        boolean isEqual = list1.equals(list2);      //false
        System.out.println(isEqual);
        /* 5 */
        /* 6 */
        System.out.println("/* 6 */");
        System.out.println(listCopy);
        ListUtils.swap2Elements(listCopy, 0, listCopy.size() - 1);
        System.out.println(listCopy);
        Collections.swap(listCopy, 0, listCopy.size() - 1);
        System.out.println(listCopy);
        /* 6 */
        /* 7 */
        listCopy.addAll(copiedList);
        System.out.println(listCopy);
        /* 7 */
        /* 8 */
        listCopy.clear();
        System.out.println(listCopy.isEmpty());
        /* 8 */
        /* 9 */
        if (listCopy.isEmpty()) {
            System.out.println("List is empty");
        }
        if (list.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        /* 9 */
        ArrayList<Integer> arraylist = new ArrayList<>(5);

        arraylist.add(5);
        arraylist.add(7);
        arraylist.add(3);

        arraylist.trimToSize();
        /* 9 */
        /* 10 */
        Set<String> hash1 = new HashSet<>();
        hash1.add("Learn");
        hash1.add("Java");
        hash1.add("It's easy!");
        Set<String> hash2 = new HashSet<>();
        hash2.add("Learn");
        hash2.add("Java");
        hash2.add("It's easy!");
        if (hash1.equals(hash2)) {
            System.out.println("HashSets are equal");
        } else {
            System.out.println("HashSets are not equal");
        }
        /* 10 */
        /* 11 */
        hash1.clear();
        hash2.clear();
        hash1.add("Learn");
        hash1.add("Java");
        hash1.add("It's easy!");
        hash1.add("!!");

        hash2.add("Learn");
        hash2.add("C++");
        hash2.add("It's easy!");
        hash2.add("??");

        hash1.retainAll(hash2);
        System.out.println(hash1);
        /* 11 */
        /* 12 */
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("First");
        treeSet.add("Second");
        treeSet.add("Third");

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        // System.out.println(treeSet.pollFirst());
        // System.out.println(treeSet.pollLast());
        /* 12 */
    }

}


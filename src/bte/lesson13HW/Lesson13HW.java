package bte.lesson13HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static bte.util.Print.print;

/**
 * Topic: Collections (List, Sets)
 * Read Ekkel: 323...346, 666...713
 * Write a Java program to copy one array list into another.
 * Write a Java program to shuffle elements in a array list.
 * Write a Java program to reverse elements in a array list.
 * Write a Java program to extract a portion of a array list
 * Write a Java program to compare two array lists.
 * Write a Java program of swap two elements in an array list.
 * Write a Java program to join two array lists
 * Write a Java program to empty an array list.
 * Write a Java program to test an array list is empty or not.
 * Write a Java program to trim the capacity of an array list the current list size.
 * <p>
 * Write a Java program to compare two hash sets
 * <p>
 * Write a Java program to compare two sets and retain elements which are same for both sets
 * <p>
 * Write a Java program to get the first and last elements in a tree set.
 */


public class Lesson13HW {
    public static void main(String[] args) {
        //1 * Write a Java program to copy one array list into another.
        List<Integer> intList = new ArrayList();
        for (int i = 0; i < 50; i++) {
            intList.add(i);
        }

        List<Integer> intList2 = new ArrayList<Integer>();
        for (int i = 0; i < intList.size(); i++) {
            intList2.add(intList.get(i));
        }
        //intList2.addAll(0, intList);
        print(intList + "\n" + intList2);

        //2  Write a Java program to shuffle elements in a array list.
//        Collections.shuffle(intList2);
//        print("\n" + intList + "\n" + intList2);

        //3  Write a Java program to reverse elements in a array list.
        List<Integer> intList3 = new ArrayList<Integer>();
        for (int i = 0; i < intList2.size(); i++) {
            intList3.add(0, i);
        }
        print("\n 3: " + intList + "\n" + intList3);


        //4   * Write a Java program to extract a portion of a array list
        List<Integer> intList4 = new ArrayList<Integer>();
        for (int i = 0; i < intList.size() / 2; i++) {
            intList4.add(i);
        }
        print("\n 4: " + intList4);


        //5 * Write a Java program to compare two array lists.
        boolean compareLists = intList.equals(intList2);
        print("6: " + compareLists);


        //6  * Write a Java program of swap two elements in an array list.
        List<Integer> intList6 = new ArrayList<Integer>();
        intList6.add(0,5);
        intList6.add(1,6);
        intList6.add(3,2);
        Collections.swap(intList6, 2,5);
        print("\n" + intList6);


        //7  * Write a Java program to join two array lists
        List<Integer> intList7 = new ArrayList<Integer>();
        for (int i = 0; i < intList.size() + intList2.size(); i++) {
            intList7.add(i);
        }
        print("\n 7: " + intList7);

        //8  * Write a Java program to empty an array list.
        List<Integer> intList8 = new ArrayList<>();
        intList8.addAll(0, intList4);
        for (int i = 0; i < intList8.size(); i++) {
            intList8.remove(intList8.removeAll(intList8));
        }
        print("\n 8: " + intList8);

        //9 Write a Java program to test an array list is empty or not.
        List<Integer> intList9 = new ArrayList<Integer>(intList2);
        if(intList9.size() == 0){
            print("List is empty");
        }else{print("List is not empty");}
            print("\n" + intList9);





    }

}


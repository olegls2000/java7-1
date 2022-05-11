package bte.hw;

import java.util.ArrayList;
import java.util.List;

public class Lesson17HW {
    //Stream
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("!");
        strings.add("We love");
        strings.add("Java 8");

        //Sort
        strings
                .stream()
                .sorted()
                .filter(s -> s.startsWith("W"))
                .forEach(System.out::println);



        List<String> strings2 = new ArrayList<>();
        strings2.add("1");
        strings2.add("2");
        strings2.add("3");
        strings2.add("4");
        strings2.add("5");

        strings2
                .stream()
                .sorted()
                .map(Integer::valueOf)
                .forEach(System.out::println);
    }


}

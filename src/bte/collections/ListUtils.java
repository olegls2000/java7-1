package bte.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListUtils {
    public static <T> ArrayList<T> copyList(List<T> list) {
     //   ArrayList<T> listCopy = new ArrayList<>();
     //   listCopy.addAll(list);
        return new ArrayList<>(list);
    }

    public static <T> void swap2Elements(List<T> list, int i, int j) {
        var el1 = list.get(i);
        list.set(i, list.get(j));
        list.set(j, el1);
    }

    public static <T> void reverseList(List<T> list) {
        List<T> listReverseCopy = new ArrayList<>();
        for (var el : list) {
            listReverseCopy.add(0, el);
        }
        list.clear();
        list.addAll(listReverseCopy);
    }

    public static <T> List<T> subList(List<T> list, int from, int length) {
        int to = from + length;
        if (to > list.size())
            to = list.size();

        return list.subList(from, to);
    }

    public static <T> List<T> shuffleList(List<T> list) {
        var random = new Random();
        for (int k = 0; k < list.size(); k++) {
            int i = random.nextInt(list.size() - 1);
            int j = random.nextInt(list.size() - 1);
            swap2Elements(list, i, j);
        }
        return list;
    }
}

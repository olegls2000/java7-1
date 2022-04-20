package pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        ListOfIntegers list = new ListOfIntegers(array);
        Iterator iterator = list.createIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}

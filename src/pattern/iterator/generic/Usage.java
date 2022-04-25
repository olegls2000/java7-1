package pattern.iterator.generic;

import java.util.ArrayList;
import java.util.List;

public class Usage {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        ListOfIntegers<Integer> list = new pattern.iterator.generic.ListOfIntegers<>(array);
        Iterator<Integer> iterator = list.createIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
       // Integer[] integers={1,2,3,4};
       // Iterator<Integer> iteratorInt = IterableCollection<>(integers);
    }
}

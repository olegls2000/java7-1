package pattern.iterator;

import java.util.List;

public class ListOfIntegers<I extends Number> implements IterableCollection {
    private final List<Integer> array;

    public ListOfIntegers(List<Integer> array) {
        this.array = array;
    }

    @Override
    public Iterator createIterator() {
        return new ListIterator(array);
    }

}

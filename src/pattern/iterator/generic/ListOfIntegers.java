package pattern.iterator.generic;

import java.util.List;

public class ListOfIntegers<T> implements IterableCollection<T> {
    private List<T> array;

    public ListOfIntegers(List<T> array) {
        this.array = array;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ListIterator<T>(array);
    }

}

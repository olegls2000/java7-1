package pattern.iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private final List<Integer> items;
    private int position = 0;

    public ListIterator(List<Integer> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public Object next() {
        Integer integer = items.get(position);
        position++;

        return integer;
    }
}

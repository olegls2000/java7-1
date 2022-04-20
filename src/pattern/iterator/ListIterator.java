package pattern.iterator;

import java.util.List;

public class ListIterator implements Iterator {
    private List<Integer> items;
    private int position = 0;

    public ListIterator(List<Integer> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position)==null)
            return false;
        return true;
    }

    @Override
    public Object next() {
        Integer integer = items.get(position);
        position++;

        return integer;
    }
}

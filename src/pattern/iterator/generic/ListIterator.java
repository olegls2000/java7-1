package pattern.iterator.generic;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private List<T> items;
    private int position = 0;

    public ListIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position)==null)
            return false;
        return true;
    }

    @Override
    public T next() {
        T integers = items.get(position);
        position++;

        return integers;
    }
}

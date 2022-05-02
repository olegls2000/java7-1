package pattern.iterator.generic;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {
    private final List<T> items;
    private int position = 0;

    public ListIterator(List<T> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size() && items.get(position) != null;
    }

    @Override
    public T next() {
        T integers = items.get(position);
        position++;

        return integers;
    }
}

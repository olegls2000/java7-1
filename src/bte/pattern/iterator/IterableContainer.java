package bte.pattern.iterator;

import bte.model.Point;

public class IterableContainer<T> implements Iterator<T> {
    private T [] container;
    private int position;

    public IterableContainer(T[] container) {
        this.container = container;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < container.length;
    }

    @Override
    public T next() {
        final var result = container[position];
        position++;
        return result;
    }
}

package bte.pattern.iterator;

public class IterableContainer<T> implements Iterator {
    private T [] container;
    private int position;

    public IterableContainer(T[] container) {
        this.position = 0;
        this.container = container;
    }

    @Override
    public boolean hasNext() {
        return position < container.length;
    }

    @Override
    public T next() {
        final var result = container[position];
        position++;
        return null;
    }
}

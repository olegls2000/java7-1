package bte.pattern.iterator;

public class IteratorContainer<T> implements Iterator {
    private T [] container;
    private int position;

    public IteratorContainer(T[] container) {
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

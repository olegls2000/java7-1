package bte.collection;

import java.util.*;

import static java.lang.System.arraycopy;

public class BtaQueue<T> implements Queue<T> {

    private Object[] queue;
    private final int capacity;
    private int counter;

    public BtaQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.counter = 0;
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        return this.counter == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < counter; i++) {
            if (queue.equals(0)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Object[] newQueue = new Object[counter];
        System.arraycopy(this.queue, 0, newQueue, 0, counter);
        return new BtaQueueIterator<>(newQueue);
    }

    public static class BtaQueueIterator<T> implements Iterator<T> {

        private final Object[] items;
        private int cursor;

        public BtaQueueIterator(Object[] items) {
            this.items = items;
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < items.length;
        }

        @Override
        public T next() {
            final T result = (T) items[cursor];
            cursor++;
            return result;
        }
    }

    @Override
    public Object[] toArray() {
        return this.queue;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return a;
    }

    @Override
    public boolean add(T o) {
        if (o == null) {
            throw new NullPointerException("Bta Queue is not accepting null value");
        }
        if (counter >= capacity) {
            throw new IllegalStateException("Bta Queue is full, Capacity = " + capacity);
        }
        queue[counter] = o;
        counter++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException("Bta Queue is not accepting null value");
        }
        queue[counter] = o;
        counter--;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (c == null) {
            throw new NullPointerException("Bta Queue is not accepting null value");
        }
        if (counter >= capacity) {
            throw new IllegalStateException("Bta Queue is full, Capacity = " + capacity);
        }
        Collection<T> collections = new ArrayList<>();
        counter = 0;
        for (int i = 0; i < capacity; i++) {
            collections.add((T) queue[i]);
            counter++;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
//TODO
    }

    @Override
    public boolean offer(T o) {
        if (o == null) {
            throw new NullPointerException("Bta Queue is not accepting null value");
        }
        if (counter >= capacity) {
            return false;
        }
        queue[counter] = o;
        counter++;
        return true;
    }

    @Override
    public T remove() {
        if (this.counter == 0) {
            throw new NoSuchElementException("Bta Queue is empty!");
        }
        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        if (capacity - 1 >= 0) {
            arraycopy(queue, 1, newQueue, 0, capacity - 1);
        }
        this.queue = newQueue;
        this.counter--;
        return result;
    }

    @Override
    public T poll() {
        if (this.counter == 0) {
            return null;
        }
        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        if (capacity - 1 >= 0) {
            arraycopy(queue, 1, newQueue, 0, capacity - 1);
        }
        this.queue = newQueue;
        this.counter--;
        return result;
    }

    @Override
    public T element() {
        if (this.counter == 0) {
            throw new NoSuchElementException("Bta Queue is empty!");
        }
        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        if (capacity - 1 >= 0) {
            arraycopy(queue, 1, newQueue, 0, capacity - 1);
        }
        this.queue = newQueue;
        //TODO
        return result;
    }

    @Override
    public T peek() {
        if (this.counter == 0) {
            return null;
        }
        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        if (capacity - 1 >= 0) {
            arraycopy(queue, 1, newQueue, 0, capacity - 1);
        }
        this.queue = newQueue;
        //TODO
        return result;
    }
}
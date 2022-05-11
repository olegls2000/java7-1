package bte.collectionsq.queue;

import java.util.*;

import static java.lang.System.arraycopy;

public class BtaQueue<T> implements Queue<T> {
    private Object[] queue;
    private int capacity;
    private int counter;

    public BtaQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new Object[capacity];
        this.counter = 0;
    }

    public void setCapacity(int capacity) {
        if (capacity > this.capacity) {
            final Object[] newQueue = new Object[capacity];
            System.arraycopy(this.queue, 0, newQueue, 0, this.counter);
            this.queue = newQueue;
            this.capacity = capacity;
        }

    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        return this.counter == 0;
    }

    public boolean isFull() {
        return this.counter == this.capacity;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < counter; i++) {
            if (queue[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        Object[] newQueue = new Object[this.capacity];
        for (int i = 0; i < counter; i++) {
            newQueue[i] = this.queue[i];
        }
        return new BtaQueueIterator<>(newQueue);
    }

    public static class BtaQueueIterator<T> implements Iterator<T> {
        private Object[] items;
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
            final T result = (T) this.items[cursor];
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
        return (T1[]) this.queue;
    }

    @Override
    public boolean add(T o) {

        if (o == null) {
            throw new NullPointerException("Bta Queue is not accepting null!");
        }
        if (this.counter >= this.capacity) {
            throw new IllegalStateException("Bta Queue is full. Capacity = " + capacity);
        }
        this.queue[this.counter] = o;
        this.counter++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int i = 0;
        boolean found = false;
        for (; i < this.counter; i++) {
            if (this.queue[i].equals(o)) {
                found = true;
                break;
            }
        }
        if (found) {
            Object[] copyArray = new Object[this.capacity];
            System.arraycopy(this.queue, 0, copyArray, 0, i);
            System.arraycopy(this.queue, i + 1, copyArray, i, counter - i - 1);
            this.queue = copyArray;
            this.counter--;
            return true;
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> c) {

        final ArrayList arrayList = new ArrayList(Arrays.asList(this.queue));
        arrayList.removeIf(Objects::isNull);

        final ArrayList arrayListC = new ArrayList(c);

        arrayListC.removeIf(Objects::isNull);

        if (arrayList.size() >= arrayListC.size()) {

            return arrayList.containsAll(arrayListC);
        }

        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {

        final Object[] objects = c.toArray();
        boolean result = true;

        int len = objects.length;
        int remainingEmptyElements = capacity - counter;

        if (len > remainingEmptyElements) {
            //   len = remainingEmptyElements;
            result = false;
        } else {
            System.arraycopy(objects, 0, this.queue, counter, len);
            this.counter+=len;
        }

        return result;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
       final List<Object> queueList = new ArrayList<>(Arrays.asList(this.queue));
        queueList.removeIf(Objects::isNull);

        if (queueList.removeAll(c)) {
            System.arraycopy(queueList.toArray(),0,this.queue, 0, queueList.size());
            Arrays.fill(this.queue, queueList.size(),this.counter,null);
            this.counter = queueList.size();
            return true;
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        final List<Object> queueList = new ArrayList<>(Arrays.asList(this.queue));
        queueList.removeIf(Objects::isNull);

        if (queueList.retainAll(c)) {
            final Object[] objects = queueList.toArray();
            System.arraycopy(objects,0,this.queue, 0, queueList.size());
            Arrays.fill(this.queue, queueList.size(),this.counter, null);
            this.counter = queueList.size();
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        Arrays.fill(this.queue, 0, counter, null); //?!
        this.counter = 0;
    }

    @Override
    public boolean offer(T o) {
        if (o == null) {
            throw new NullPointerException("Bta Queue is not accepting null!");
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
        if (this.counter == 0) throw new NoSuchElementException();

        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        if (this.counter - 1 > 0) {
            arraycopy(queue, 1, newQueue, 0, this.counter - 1);
        }
        this.counter--;
        this.queue = newQueue;
        return result;
    }

    @Override
    public T poll() {
        if (this.counter == 0) return null;
        final T result = (T) queue[0];
        Object[] newQueue = new Object[capacity];
        for (int i = 1; i < capacity; i++) {
            newQueue[i - 1] = queue[i];
        }
        this.counter--;
        this.queue = newQueue;
        return result;
    }

    @Override
    public T element() {
        if (isEmpty()) throw new NoSuchElementException();
        else return (T) this.queue[0];
    }

    @Override
    public T peek() {
        if (isEmpty()) return null;
        else return (T) this.queue[0];
    }

    @Override
    public String toString() {
        return "BtaQueue { " + "queue = " + Arrays.toString(queue) + ", capacity = " + capacity + ", counter = " + counter + " }";
    }
}

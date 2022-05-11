package bte.collectionsq.list;

import java.util.*;

//under construction
public class DoubleLinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T content;
        private Node<T> next;
        private Node<T> previous;

        public Node(T content) {
            this.content = content;

        }
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {

        Node<T> newNode = new Node<>(t);

        if (this.head == null) {
            newNode.previous = newNode;
            this.head = newNode;

        } else {
            this.tail.next = newNode;
            newNode.previous = this.tail;
        }

        this.tail = newNode;
        this.size++;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> currNode = this.head;

        result.append("DoubleLinkedList: \n");
        int i = 0;
        while (currNode != null) {
            if (i == 0) {
                result.append("[ ");
            } else {
                result.append(", ");
            }
            result.append(currNode.content.toString());
            currNode = currNode.next;
            i++;
        }
        result.append(" ]\n Size = " + this.size);

        return result.toString();
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
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

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = null;

        Node<T> newNode = new Node<>(element);

        int i = 0;
        while (i < index) {
            if (i == 0) {
                current = this.head;
            } else {
                current = current.next;
            }
            i++;
        }
        if (current == null) {
            newNode.previous = newNode;
            newNode.next = this.head;
            this.head.previous = newNode;
            this.head = newNode;

        } else {
            newNode.next = current.next;
            current.next.previous = newNode;
            current.next = newNode;

        }
        this.size++;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }


    public static class DoubleLinkedListIterator<E> implements ListIterator<E> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public E next() {
            return null;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public E previous() {
            return null;
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(E e) {

        }

        @Override
        public void add(E e) {

        }
    }
}

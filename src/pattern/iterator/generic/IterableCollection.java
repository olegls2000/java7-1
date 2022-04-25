package pattern.iterator.generic;

public interface IterableCollection<T> {
     Iterator<T> createIterator();
}

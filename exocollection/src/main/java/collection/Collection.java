package collection;

public interface Collection<T> {
    void add(T t);
    Iterator iterator();
}

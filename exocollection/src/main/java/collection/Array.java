package collection;

import java.util.NoSuchElementException;

/**
 *
 * @param <T>
 */
public class Array<T> implements Collection<T> {

    private T[] array;
    private int size = 0;


    public Array (Class<T> cls, int length) {

        if (size < 0) {
            throw new IllegalArgumentException("Illegal Capacity");
        }

        array = (T[]) java.lang.reflect.Array.newInstance(cls, length);
        //array = (T[]) new Object[length]; //todo Type unsafe :/ ?

    }

    public void add(T object) {

        if (size >= array.length) {
            throw new IndexOutOfBoundsException();
        }

        array[size] = object;
        ++size;
    }

    public Iterator iterator() {
        return new Iterator() {

            int index = 0;

            @Override
            public Object next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }

                return array[index++];

            }

            @Override
            public boolean hasNext() {
                return index < size;
            }
        };
    }

}


package collection;

import java.util.NoSuchElementException;

/**
 *
 * @param <T>
 */
public class List<T> implements Collection<T>{

    private Element head = null;
    private Element tail = null;

    public void add(T t) {
        if (tail == null) {
            head = new Element(t);
            tail = head;
        } else {
            Element e = new Element(t);
            tail.setNext(e);
            tail = e;
        }
    }

    public Iterator iterator() {
        return new Iterator() {

            Element current = new Element(head);

            @Override
            public Object next() {

                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }

                current = current.next;

                return current.data;
            }

            @Override
            public boolean hasNext() {
                return current.next != null;
            }
        };
    }


    /**
     *
     */
    private class Element {

        private T data;
        private Element next;

        Element(T data) {
            this.data = data;
            next = null;
        }

        private Element(Element next) {
            this.next = next;
        }

        private void setNext(Element next) {
            this.next = next;
        }
    }
}


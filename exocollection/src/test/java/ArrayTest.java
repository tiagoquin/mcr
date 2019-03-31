import collection.Array;
import collection.Collection;
import collection.Iterator;
import org.junit.jupiter.api.Test;


class ArrayTest {

    @Test
    void testArrayConstructor () {
        Array<String> a = new Array<>(String.class, 3);

    }

    @Test
    void testAddArray () {

        Array<String> a = new Array<>(String.class, 3);
        a.add("one");
        a.add("two");
        a.add("three");
    }

    @Test
    void testArrayIterate () {
        Array<String> a = new Array<>(String.class, 3);
        a.add("one");
        a.add("two");
        a.add("three");

        Iterator<?> it = a.iterator();

        String s = "< ";
        while (it.hasNext())
            s += it.next() + " ";
        System.out.println(s + ">");
    }

    @Test
    void testArrayIterateCollection () {
        Array<String> a = new Array<>(String.class, 3); //todo doesn't like it :/
        a.add("one");
        a.add("two");
        a.add("three");

        Collection<?> collection = a;

        Iterator<?> it = collection.iterator();
        String s = "< ";
        while (it.hasNext())
            s += it.next() + " ";
        System.out.println(s + ">");
    }
}

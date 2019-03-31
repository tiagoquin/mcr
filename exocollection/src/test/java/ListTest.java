import collection.Collection;
import collection.Iterator;
import collection.List;
import org.junit.jupiter.api.Test;

class ListTest {

    @Test
    void testListGenericConstructor() {
        List<Integer> l = new List<Integer>();
    }

    @Test
    void testListAdd() {
        List<Integer> l = new List<>();
        l.add(1); l.add(2); l.add(3);
    }

    @Test
    void testListIterate() {
        List<Integer> l = new List<>();
        l.add(1); l.add(2); l.add(3);

        Iterator<?> it = l.iterator();

        String s = "< ";
        while (it.hasNext())
            s += it.next() + " ";
        System.out.println(s + ">");
    }

    @Test
    void testListIterateCollection () {

        List<Integer> l = new List<>();
        l.add(1); l.add(2); l.add(3);

        Collection<?> collection = l;

        Iterator<?> it = collection.iterator();
        String s = "< ";
        while (it.hasNext())
            s += it.next() + " ";
        System.out.println(s + ">");
    }

}

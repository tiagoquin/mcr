import collection.Collection;
import collection.Iterator;
import collection.Array;
import collection.List;
import org.junit.jupiter.api.Test;

public class CollectionTest {

    @Test
    void allTests () {
        List<Integer> l = new List<Integer>();
        l.add(1); l.add(2); l.add(3);

        Array<String> a = new Array<String>(String.class,3);
        a.add("one"); a.add("two"); a.add("three");

        for (Collection<?> collection : new Collection<?>[] { l, a })
        {
            Iterator<?> it = collection.iterator();
            String s = "< ";
            while (it.hasNext())
                s += it.next() + " ";
            System.out.println(s + ">");
        }
    }
}

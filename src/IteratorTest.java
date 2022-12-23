import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void test1() {
        Collection coll = new ArrayList();
        coll.add("AAA");
        coll.add("BBB");
        coll.add(new String("mother"));
        coll.add(123);
        coll.add(new Persons("Mary",20));
        for(Object obj: coll) {
            System.out.println(obj);
        }
    }
}

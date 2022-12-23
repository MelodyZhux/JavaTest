import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();
        s.add(15);
        s.add(1);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(2);
        s.add(4);
        s.add(9);
        s.add(1);
        s.add(4);
        System.out.println(s.toString());

    }
}

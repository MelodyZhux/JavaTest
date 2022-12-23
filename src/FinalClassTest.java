import java.io.ObjectStreamClass;

public class FinalClassTest {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.test("hello");
        f.name = "Melody";

    }
}


final class FinalClass {
    String name;
    public void test(String s) {

        System.out.println("final class test is " + s);
    }

}


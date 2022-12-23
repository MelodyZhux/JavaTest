
public class test extends A {
    public static String print() {
        return "b";
    }
    public static void main(String[] args) {
        test b = new test();
        A a = new test();

        System.out.println(b.print() + " " + a.print());
    }
}
class A {
    public static String print() {
        return "a";
    }
}
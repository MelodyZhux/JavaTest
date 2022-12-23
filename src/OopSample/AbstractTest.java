package OopSample;

public class AbstractTest extends Person1 implements behavior{
    public static void main(String[] args) {
        AbstractTest a = new AbstractTest();
        a.age = 15;
       a.walking();
       a.barking();
        System.out.println(behavior.state);
        a.test3();
        behavior.test4();
    }

    public void test2() {
        System.out.println("test2");
    }

    public void walking() {

        System.out.println("walking");
    }

    public void barking() {
        System.out.println("barking");
    }

}



abstract class Person1 {

    int age = 0;
    String gender;

    public void test1 () {

        System.out.println("test1");
    }

    abstract void test2();



}

interface behavior {

    static final String state = "slow";

     void walking();
    void barking();
    default void test3() {
        System.out.println("test3");

    }

    static void test4(){
        System.out.println("test4");
    }


}
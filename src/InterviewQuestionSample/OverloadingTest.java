package InterviewQuestionSample;

public class OverloadingTest {

    public static void test1(String s) {
        System.out.println("String");
    }
    public static void test1(Object s) {
        System.out.println("object");
    }
    public static void test1(Integer s) {
        System.out.println("Integer");
    }

  /*  public static void main(String[] args) {
        OverloadingTest.test(null).
    }*/
}


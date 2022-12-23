package InterviewQuestionSample;

public class ExceptionTest {
    public static void main(String[] args) {
        int i = method1();
        System.out.println(i);

    }
    public static int method1() {
        try {
            System.out.println("try");
            return 10;

        }catch(Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
            return 88;
        }
    }
}

package InterviewQuestionSample;

public class Sample1 {
    int x = 3;

    public static void main(String[] args) {
        new Sample1().go1();
    }
    void go1() {
        //int x =
        go2(++x);

    }
    void go2(int y) {
        int x =++y;
        System.out.println(x);
    }
}

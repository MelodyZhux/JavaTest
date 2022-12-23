package InterviewQuestionSample;

public class FinalKeywordSample {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass(10);
        System.out.println(finalClass.a);
        System.out.println("**************************************");
        //finalClass.a = 20; cannot change final variable
        int a = FinalClass1.a;
        System.out.println(a);
    }

}

class FinalClass {
    public final int a;
    public FinalClass(int a) {
        this.a = a;
    }

}
class FinalClass1 {
    // public static final int a = 20;  init a
    static final int a;
    static
    {
        a = 20;
    }

    public FinalClass1() {
    }


}


package InterviewQuestionSample;

public class StringSample {
    public void m1(String arg1) {
        arg1 = "Am I going to disappear?";
    }

    public static void main(String[] args) {
        StringSample stringSample = new StringSample();
        String iAmOfAnArgumentativeNature = "I am born new";
        stringSample.m1(iAmOfAnArgumentativeNature);
        System.out.println(iAmOfAnArgumentativeNature);

    }


}

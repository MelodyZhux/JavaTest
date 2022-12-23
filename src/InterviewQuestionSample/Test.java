package InterviewQuestionSample;


public class Test{

    static String name = "Test";

    public Test(){
        name = "TestObject";
    }

    public static void main(String[] args){
        System.out.println("Name is " + name);

        int i = 12;
        int j = -5;
        int i1 = i % j;
        System.out.println(i1);

        short d = 10;
        d +=10;
        System.out.println(d);
        int ii = 3;

        System.out.println(3<<1);


    }
}
package InterviewQuestionSample;

public class InterviewTest2 {

    public static void main(String[] args) {

        Car car = new Car();

    }




}




class Car {
    static String name ;

    {
        name = "Civic";
        System.out.println("static block");

    }

    public Car() {
        System.out.println("car");
    }

    public void  aaa() {
        System.out.println("car");
    }

    {

        System.out.println("non static block");
    }
}


class Lambo extends  Car {
    int i = 10;

    public int aaa(int s) {
        System.out.println("lambo");
        return 2;
    }

    public void aaa(String s) {
        System.out.println(s);
    }
}


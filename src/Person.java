public class Person {
    int age;
    String name;

    public Person() {};

    public Person(String n,int a) {
        age = a;
        name = n;
    };

    public void eat() {
        System.out.println("eating");
    }
    public void walk(int distance) {
        System.out.println("walking to" + distance);
    }

}


public class Students extends Person {
    String major;

    public Students () {

    }
    public Students(String m) {
        this.major = m;
    }

    public void eat() {
        System.out.println("student eating");
    }

    public void study() {
        System.out.println("studying, major is "+ major);
    }
}

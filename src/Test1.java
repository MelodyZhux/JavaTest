public class Test1 {
    public static void main(String[] args) {
        Parent ch = new Child();
        System.out.println(ch.value);
        System.out.println(ch.walking());
    }
}

class Parent {

    public String value= "parent";
    public String walking() {
        return value;
    }
}

class Child extends  Parent {
    public String value = "child";
    public String walking() {
        return value;
    }
}


package ExceptionTest;

public class Test2 {
    public static void main(String[] args) throws Exception {
        Test2 t = new Test2();
        t.method1();
    }

    public void method1() throws Exception {
        method2();
    }
    public void method2() throws Exception {
        throw method3();
    }

    public Exception method3() {
        return new Exception();
    }

}

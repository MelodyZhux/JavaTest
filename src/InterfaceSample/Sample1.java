package InterfaceSample;

public class Sample1 {
    public static void main(String[] args) {
        SampleTest sampleTest = new SampleTest();
        sample.method2();
    }
}


interface sample {
    public void method1();
    public static void method2() {
        System.out.println("sample method2");
    }
}
interface sampleB {
    public void method3();
}

class SampleTest implements  sample, sampleB {
    public void method1() {
        System.out.println("method1");
    }

    public void method3() {
        System.out.println("method3");
    }
    public static void method4() {

        System.out.println("method3");
    }

}




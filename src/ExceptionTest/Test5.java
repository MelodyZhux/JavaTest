package ExceptionTest;

public class Test5 {
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 5/0;

        }catch(Exception e) {
            System.out.println("Exception");
        }
        /*catch(ArithmeticException ae) {
            System.out.println("ArithmeticException");
        }*/
        System.out.println("finishec");
    }
}

public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle tri = new TriAngle();
        tri.setBase(2.0);
        tri.setHeight(4.0);
        TriAngle tti1 = new TriAngle(4.0,6.0);
        System.out.println("ares is " + tti1.getBase()*tti1.getHeight()/2);

    }
}

class Class {
    int[] cls = {1,2,3,4,5,6,7,8,9,10};
}
public class Sample {
    public static void main(String[] args) {
        Sample [] c = new Sample[3];
        for(int i = 0; i< c.length; i++) {
            System.out.println(c[i]);
        }
        c[0] = new Sample();
        Sample co = new Sample();
        c[1] = co;
        co = null;
        c[1] = null;
        // TO DO

        for(int i = 0; i< c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
package OopSample;

public class Circle {

    double radius;

    public double findArea(double radius) {
        return Math.PI*radius*radius;
    }
}
class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("/radius/t/area");
        for (int i = 0;i<time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea(c.radius));
        }
    }

    public static void main(String[] args) {
        PassObject pass = new PassObject();
        pass.printAreas(new Circle(), 5);
    }
}

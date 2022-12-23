package LeecodeTest;
import java.util.Scanner;
// Given an integer num, return the number of steps to reduce it to zero.
//In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
public class NumberTest1 {
    public static void main(String[] args) {
        NumberTest1 n = new NumberTest1();
        n.test4();
    }

    public void test4() {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int step = getStep(number);
        System.out.println(step);

    }

    private int getStep (int number) {
        System.out.println("number is "+ number);
        int step = 0;
        String s = null;
        System.out.println(s instanceof String);

        if ( number==0) return step;

        if(number%2==0) {
            step = getStep(number/2);
        } else
            step = getStep(number-1);
        return step+1;


    }


}
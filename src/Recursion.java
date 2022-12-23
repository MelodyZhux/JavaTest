public class Recursion {

    public static void main(String[] args) {
        Recursion re = new Recursion();
        int sum1 = re.getSum(2);
        System.out.println(sum1);
    }
    public int getSum(int n) {
        System.out.println("n is " +n);
        if (n == 1)
            return 1;
        else return n+getSum(n-1);
    }

    private static void log (String msg) {
        System.out.println(msg);
    }

}

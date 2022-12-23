package dynamicproxy;

public class Test {
    public static void main(String[] args) {
        ProxyUtil proxyUtil = new ProxyUtil(new MathImpl());
        Math math = (Math) proxyUtil.getProxy();
        int add = math.add(1, 1);
        System.out.println(add);
        int div = math.div(4, 2);
        System.out.println(div);

    }
}


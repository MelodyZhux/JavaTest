import java.util.HashMap;
import java.util.stream.IntStream;

public class hashMapExample {
    public static void main(String args[]) {

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        System.out.println("c " + c);
        String d = cde.substring(0, 3);
        System.out.println("d " + d);
        IntStream f = cde.chars();
        log("f is "+ f);
        String str = "I am Melody";

        int count =0;
        String[] str1 = str.split(" ");
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        log("before map is"+ map);
        for (int i=0;i<str1.length;i++) {
            if(map.containsKey(str1[i]))
                map.put(str1[i],count++);
            else map.put(str1[i],1);
        }
        log("map is"+ map);

    }

    private static void log(String msg) {
        System.out.println(msg);
    }

}

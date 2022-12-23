public class StringTest {

    static String s1 = "javaee";
    static String s2 = "def";

    public static void main(String[] args) {
        String s1 = new String("abc");

        String s2 ="ab";
         s1 = "def";

        //s=s1;

        String str1 = "javaee";
        String  str2 = "def";
        String str3 = "javaeedef";
        String str4 = s1 + s2;
        String str5 = str1+str2;
        System.out.println(str3==str4);
        System.out.println(str3==str5);

        P p = new P("Tom");
        P p1 = new P("Tom");
        System.out.println(p.name == p1.name);
        P p2 = new P();
        p2.name = "Tom";
        P p3 = new P();
        p3.name = "Tom";
        System.out.println(p2 == p3);
        String[] s01 = new String[]{"Monday","Friday"};
        s01[1] = "Sunday";
        System.out.println( s01[1]);


    }


}

class P {
     String name;

    public P(String name) {
        this.name = name;
    }

    public P() {
    }
}
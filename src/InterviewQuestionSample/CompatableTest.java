package InterviewQuestionSample;

import java.util.Arrays;
import java.util.Comparator;

/*Comparable与Comparator都是interface,Comparable又称为排序接口, Comparator称为比较器接口。

如果一个类实现了Comparable接口，则说明该类支持排序，则该List列表(或数组)可以直接通过 Collections.sort（或 Arrays.sort）进行排序，值得注意的是，Comparable接口只有一个抽象方法，比的方法均没有。

但是如果没有实现Comparable接口，则要排序需要通过传入一个实现了Comparator比较器接口的类作为sort的参数，相当于告诉sort你想要的排序规则，当然你觉得你只使用一次比较器接口，那么你就可以直接在参数位置使用匿名内部类即可。这里比较器传参有点像C++里面的“谓词”。*/
public class CompatableTest {
    public static void main(String[] args) {

        int n = 4;
        Pair arr[] = new Pair[n];

        arr[0] = new Pair("abc", 3);
        arr[1] = new Pair("a", 4);
        arr[2] = new Pair("bc", 5);
        arr[3] = new Pair("a", 2);
        print(arr);
        Arrays.sort(arr);
        System.out.println("----------------------");
        print(arr);
        System.out.println("----------------------");
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.y - o2.y;
            }
        });
        print(arr);
    }

    public static void print(Pair[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


class Pair implements Comparable<Pair> {
    String x;
    int y;

    public Pair(String x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "x='" + x + '\'' +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Pair o) {
        int i = this.x.compareTo(o.x);
        if (i!=0)
            return i;
       else
           return this.y - o.y;
    }
}


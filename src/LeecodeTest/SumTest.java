package LeecodeTest;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumTest {

    public static void main(String[] args) {

    }
    @Test
    public void test1() {
        int[] list = new int[]{3,1,2,10,1};
        int l = list.length;
        int[] list1 = new int[l];

        int sum = 0;
        for(int i = 0; i<l; i++) {
            sum = sum + list[i];
        }
        System.out.println("sum is "+ sum);
        list1[l-1] = sum;
        list1[0] = list[0];
        for(int j = l-2; j>=1; j--) {
            sum = sum -list[j+1];
            list1[j] = sum;
        }
        for(int k: list1)
            System.out.println(k);

    }

    @Test
    public void test2 () {
        int[] temp = new int[]{7,1,3};
        int length = temp.length;
        int[][] account = new int[length][length];
        account[0]= temp;
        account[1] = new int[]{2,8,7};
        account[2] = new int[]{1,9,5};
        int richest = 0;
        for (int i = 0; i<length; i++) {
            int sum = 0;
            for(int j = 0; j<length; j++) {
                sum = account[i][j]+ sum;
            }
            System.out.println("sum is " +sum);
            System.out.println("richest is " +richest);

            if(richest<sum)
                richest = sum;

        }
        System.out.println("the richest is " + richest);
    }
    // fuzz game solution
    @Test
    public void test3() {
        List<Integer> list = new ArrayList<>();
        List<String> sList = new ArrayList<>();
        for (int i = 1; i<=34; i++) {
            list.add(i);
        }
        for(int i: list) {
            if(i%3==0 && i%5 ==0) {
                sList.add("FizzBuzz");
                continue;
            }
            else if (i%3==0)
                sList.add("Fizz");
            else if (i%5==0)
                sList.add("Buzz");
            else sList.add(String.valueOf(i));

        }
       // System.out.println(sList);

        sList.forEach(n -> System.out.print(n+" "));

    }

}

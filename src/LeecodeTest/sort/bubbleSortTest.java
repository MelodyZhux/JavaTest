package LeecodeTest.sort;

import org.testng.annotations.Test;

public class bubbleSortTest {

    public static void main(String[] args) {
        int[] list = {35,0,12,4,36,89,-10,4};
        int len = list.length;
        while(len>1) {
            for(int i = 0; i< len-1; i++) {
                if(list[i]>list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
            len --;
        }
        for(int i: list)
            System.out.println(i);
    }

}

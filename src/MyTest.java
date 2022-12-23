import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 3, 4};
        int max = 1;

        for (int i = 0; i < list.length; i++) {
            max = max * list[i];
        }
        for (int j = 0; j < list.length; j++) {
            int temp = 1;
            temp = max / list[j];
            System.out.println(temp);
        }

    }


}

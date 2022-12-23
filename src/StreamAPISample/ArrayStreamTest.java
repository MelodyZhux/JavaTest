package StreamAPISample;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamTest {

    public static void main(String[] args) {
        String[] strArray = {"one", "two", "three", "four"};
        Stream<String> strArrayStream = Stream.of(strArray);
        System.out.println(strArrayStream.count());
        int[] array = {1,2,4,5,6};
        Stream<int[]> array1 = Stream.of(array);

        IntStream stream = Arrays.stream(array);

    }
}

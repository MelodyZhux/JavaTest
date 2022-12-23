package StreamAPISample;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample1 {

    public static void main(String[] args) {
        IntStream.range(1,11).peek(x -> System.out.print("\nA"+x)).
                skip(3).
                peek(x -> System.out.print("B"+x)).
                forEach(x-> System.out.println("C"+x));
        IntStream.range(1,7).filter(x -> x>3).forEach(x->System.out.print(x));
    }
}

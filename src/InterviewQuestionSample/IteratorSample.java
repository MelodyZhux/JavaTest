package InterviewQuestionSample;

import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static javax.swing.text.html.HTML.Tag.S;

public class IteratorSample {
    @Test
    public static void test1() {
        List<String> words = new ArrayList<>(Arrays.asList("pen", "pencil",
                "sky", "blue", "sky", "dog"));

        for (String word: words) {

            if ("sky".equals(word)) {

                words.remove(word);
            }
        }

        System.out.println(words);

    }
    @Test

    public static void test2() {
        List<String> words = new ArrayList<>(Arrays.asList("pen", "pencil",
                "sky", "blue", "sky", "dog"));
        words.removeIf(x -> "sky".equals(x));
        System.out.println(words);
    }
    @Test
    public void test3() {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> hashSet = new HashSet();
        list.stream().filter(n -> !hashSet.add(n)).forEach(System.out::println);
    }
    @Test
    public void test4() {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        list.stream().findFirst().ifPresent(System.out::println);
    }

    @Test
    public void test5() {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = list.stream().count();
        System.out.println(count);
    }

    @Test
    public void test6() {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer max = list.stream().max(Integer::compare).get();
        System.out.println(max);
    }
    @Test
    public void test7() {
        String input = "Java Hungry Blog Alive is Awesome";

        Stream<Character> characterStream = input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)));

        LinkedHashMap<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Set<Map.Entry<Character, Long>> entries = collect.entrySet();
        Stream<Map.Entry<Character, Long>> entryStream = entries.stream().filter(e -> e.getValue() == 1L);
        Long aLong = entryStream.map(e -> e.getValue()).findFirst().get();
        System.out.println(aLong);

        //   characterStream.collect(Collectors.groupingBy())


        /*Character result = input.chars() // Stream of String
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result);*/

    }
    @Test
    public void test8() {
        Function<Integer, Integer> identityFun = Function.identity();
        Function<Integer, Integer> intFunction = e -> e+10;
        System.out.println(identityFun.apply(10));
        System.out.println(intFunction.apply(10));
        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "John",
                "Vijay",
                "Arthur"
        );

        System.out.println("--------------function identity()--------------");
        names.stream().map(Function.identity()).forEach(System.out::println);
        System.out.println("--------------function identity() 111111111111111--------------");
        names.stream().map(e ->e).forEach(System.out::println);

        System.out.println("--------------function identity() sample 1 --------------");

        Function<Integer, Integer> identityFunction1 = Function.identity();
        Function<Integer, Integer> identityFunction2 = Function.identity();
        Function<Integer, Integer> identityFunction3 = Function.identity();

        Function<Integer, Integer> intFunction1 = e -> e;
        Function<Integer, Integer> intFunction2 = e -> e;
        Function<Integer, Integer> intFunction3 = e -> e;

        System.out.println(identityFunction1);
        System.out.println(identityFunction2);
        System.out.println(identityFunction3);

        System.out.println(intFunction1);
        System.out.println(intFunction2);
        System.out.println(intFunction3);

    }

    @Test
    public void test9() {

        List<String> names = Arrays.asList(
                "Peter",
                "Martin",
                "John",
                // "Peter",
                "Vijay",
                // "Martin",
                // "Peter",
                "Arthur"
        );

        Set<String> strings = new HashSet<>(names);
        //names.stream().map(getFunction())

    }

    static Function<String, String> getFunction(List<String> names, boolean hasDuplicates){
        // Collections.frequency(names, name) => to get duplicate count

        return hasDuplicates ?
                name -> name+" ("+Collections.frequency(names, name)+")"
                : Function.identity();
    }

}

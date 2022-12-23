package StreamAPISample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestTransaction {

    List<Transaction> transactions = null;
 @BeforeTest
    public void before() {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        transactions = Arrays.asList(
                new Transaction(brian, 2011,300),
                new Transaction(raoul, 2012,1000),
                new Transaction(raoul, 2011,400),
                new Transaction(mario, 2012,710),
                new Transaction(mario, 2012,700),
                new Transaction(alan, 2012,950)
        );
    }
    //find transaction of 2011 and sort by value
    @Test
    public void test1() {
        transactions.stream().filter(t -> t.getYear() == 2011).sorted((t1,t2) -> Integer.compare(t1.getValue(),t2.getValue()) ).forEach(System.out::println);

    }
    // search any transactions and list city
    @Test
    public void test2() {

     transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

    }

    //find any Cmbridge trader
    @Test
    public void test3() {
     transactions.stream().filter(t -> t.getTrader().getCity().equals("Cambridge"))
             .map(t -> t.getTrader()).sorted((t1,t2) -> t1.getName().compareTo(t2.getName()))
             .distinct().forEach(System.out::println);
    }

    @Test
    public void test4() {
     transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().forEach(System.out::println);

        System.out.println("_______________________________");
        String str = transactions.stream().map(t -> t.getTrader().getName())
                .distinct().sorted().reduce("", String::concat);
        System.out.println(str);
        System.out.println("_______________________________");

    }

    // is there any trader from Milan
    @Test
    public void test5() {
        boolean milan = transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        System.out.println(milan);
    }
    // get value of sum of Cambridge trader
    @Test
    public void test6() {
        Optional<Integer> cambridge = transactions.stream()
                .filter(t -> t.getTrader().getCity().equals("Cambridge"))
                .map(t -> t.getValue()).reduce(Integer::sum);

        System.out.println(cambridge.get());
    }
@Test
    public void test7() {
        Optional<Integer> max = transactions.stream().map(t -> t.getValue()).max(Integer::compare);
        System.out.println(max.get());
    }

    public void test8() {
        Optional<Transaction> min = transactions.stream().min((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()));

    }

}

package StreamAPISample;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionTest {


    List<Transaction> transactions = null;
    List<Employee> employees = EmployeeData.getEmployees();
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
   @Test
    public void collectTest(){


       HashSet<Employee> collect = employees.stream().collect(Collectors.toCollection(HashSet::new));
       collect.forEach(System.out::println);
       Double collect1 = employees.stream().collect(Collectors.summingDouble((Employee::getSalary)));
       System.out.println(collect1);
       Optional<Employee> collect2 = employees.stream().collect(Collectors.maxBy((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
       System.out.println(collect2.get());
       Optional<Double> collect3 = employees.stream().map(Employee::getSalary).collect(Collectors.minBy(Double::compare));
       System.out.println(collect3.get());
       Optional<Double> min = employees.stream().map(Employee::getSalary).min(Double::compare);
       System.out.println(min.get());
   }

   @Test
   public void reduceTest () {

        Optional<Double> reduce = employees.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce.get());

   }

   @Test
   //分组
   public void groupingByTest() {

       Map<Boolean, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(e -> e.getAge() > 40));
       System.out.println(collect);
       String collect1 = employees.stream().map(Employee::getName).collect(Collectors.joining(",","****","*****"));
       System.out.println(collect1);

   }
    @Test
   public void collectingAndThen() {

       String collect = transactions.stream().map(t -> t.getTrader().getName())
               .collect(Collectors.collectingAndThen(Collectors.joining(","), String::toUpperCase));
       System.out.println(collect);
        System.out.println("------------------------------");
       List<Person> pList = new ArrayList<>();
       pList.add(new Person(11,"Mike"));
       pList.add(new Person(22,"Lynn"));
       pList.add(new Person(33,"John"));
       pList.add(new Person(44,"Mickey"));
       pList.add(new Person(55,"Fiona"));

        String collect1 = pList.stream()
                .collect(Collectors.collectingAndThen
                        (Collectors.maxBy(Comparator.comparing(Person::getAge)),
                                (Optional<Person> p) -> {
                                    return p.isPresent() ? p.get().getName() : "none";
                                }));
        System.out.println(collect1);
        System.out.println("------------------------------");

        String collect2 = pList.stream().map(p -> p.getName()).collect(Collectors.joining(" ", " prefix  ", "  suffix "));
        System.out.println(collect2);



    }

}








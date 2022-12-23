package StreamAPISample;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();
        Stream<Employee> stream = employees.stream();
        Stream<Employee> parallelStream = employees.parallelStream();
    }

    public void test2() {
        int[] arr = {1,2,3,4,5,6};
        IntStream stream = Arrays.stream(arr);
        Employee e1 = new Employee(1001, "Tom", 25, 5300);
        Employee e2 = new Employee(1002, "Mary", 30, 5500);
        Employee[] arr1 = new Employee[]{e1,e1};
        Stream<Employee> stream1 = Arrays.stream(arr1);
    }
    public void test3() {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6);

    }
@Test
    public void test4() {
        Stream.iterate(0, t->t+2).limit(10).forEach(System.out::println);
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
@Test
    public void test5() {
        List<Employee> list = EmployeeData.getEmployees();
        Stream<Employee> stream = list.stream();
        System.out.println("start");
        stream.filter(e -> e.getSalary() > 8000).forEach(System.out::println);
        System.out.println();
        list.stream().limit(3).forEach(System.out::println);
        System.out.println();
        list.stream().skip(3).forEach(System.out::println);
        System.out.println();
        list.add(new Employee(1010,"May", 40, 8000));
        list.add(new Employee(1010,"May", 40, 8000));
        list.add(new Employee(1010,"May", 40, 8000));
        list.add(new Employee(1010,"May", 42, 8000));
        System.out.println();

        list.stream().distinct().forEach(System.out::println);

    }
    @Test

    public void test6() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().map(Employee::getName).filter(name->name.length()>4).forEach(System.out::println);

       /* Stream<Stream<Character>> streamStream = list.stream().map(StreamTest::fromStringToStream);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });*/
        list.stream().flatMap(StreamTest::fromStringToStream).forEach(System.out::println);

    }
@Test
    public void test7() {
        ArrayList list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
//     list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);

    }
    public static Stream<Character> fromStringToStream(String str){
        ArrayList<Character> list = new ArrayList<>();
        for(Character c: str.toCharArray())
            list.add(c);
        return list.stream();
    }
    @Test
    public void test8() {
        List<Integer> list = Arrays.asList(1, 24, 0, 23, 55, 100, 8);
        list.stream().sorted().forEach(System.out::println);

        //抛异常，因为EMPLOYEE类没实现comparable接口
        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((e1,e2) -> {
                    int ageValue = Integer.compare(e1.getAge(), e2.getAge());
                    if(ageValue!=0)
                        return ageValue;
                    else
                        return Double.compare(e1.getSalary(), e2.getSalary());
                })
                .forEach(System.out::println);



    }

    @Test
    public void test9() {
        List<Employee> employees = EmployeeData.getEmployees();
        boolean b = employees.stream().allMatch((e -> e.getAge() > 18));
        System.out.println(b);
        boolean b1 = employees.stream().anyMatch(e -> e.getSalary() > 60000);
        System.out.println(b1);

    }
   @Test
    public void test10() {

       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       Integer sum = list.stream().reduce(0, Integer::sum);
       System.out.println(sum);
       List<Employee> employees = EmployeeData.getEmployees();
       //Optional<Double> sumMondy = employees.stream().map(Employee::getSalary).reduce(Double::sum);
       Optional<Double> sumMondy = employees.stream().map(Employee::getSalary).reduce((d1,d2) -> d1+d2);
       System.out.println(sumMondy);
   }
   @Test
   public void test11() {

       List<Employee> employees = EmployeeData.getEmployees();
       List<Employee> collect = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
       collect.forEach(System.out::println);
       System.out.println();
       List<Employee> employees1 = EmployeeData.getEmployees();
       Set<Employee> collect1 = employees1.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toSet());
       collect1.forEach(System.out::println);

   }

   @Test
    public void test12() {

       IntStream.range(1, 10)
               .filter(i -> {
                   System.out.print("1");
                   return i % 2 == 0;
               }).filter(i -> {
                   System.out.print("0");
                   return i > 3;
               }).limit(1)
               .forEach(i -> {
                   System.out.print(i);
               });
   }
}

package StreamAPISample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question {

    List<Employee> employees = EmployeeData.getEmployees();
    @Test
    public void test1() {
        int[] list = {12,3,4,1,87,9,10};
        Arrays.stream(list).map(i -> i*i).forEach(System.out::println);
    }

    // count how many employees using map and reduce
    @Test
    public void test2() {
    Optional<Integer> reduce = employees.stream().map(e -> 1).reduce(Integer::sum);
    System.out.println(reduce.get());
    }


}

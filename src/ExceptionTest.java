import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExceptionTest {

    @Test
    public void test2() {
        List<Employee1> employees = new ArrayList<Employee1>();
        Employee1 employee1 = new  Employee1(25,4000.12);
        Employee1 employee2 = new  Employee1(35,6000.12);
        Employee1 employee3 = new  Employee1(40,12000.12);
        Employee1 employee4 = new  Employee1(20,3000.12);
        Employee1 employee5 = new  Employee1(60,20000.12);
        Employee1 employee6 = new  Employee1(45,120000.12);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        Stream<Employee1>  stream = employees.stream();

        stream.filter(employee-> employee.getAge()>30 && employee.getAge()<50 && employee.getSalary()>10000)
                .forEach( (i) -> {System.out.println(i);});




    }

}


class Employee1 {

    private int age;
    private double salary;

    public Employee1() {
    }

    public Employee1(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "age=" + age +
                ", salary=" + salary +
                '}';
    }
}
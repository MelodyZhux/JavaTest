public class Employee {
    int salary;
    int age;

    public Employee(int salary, int age) {
        this.salary = salary;
        this.age = age;
    }

    public Employee() {
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


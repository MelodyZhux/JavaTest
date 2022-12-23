package StreamAPISample;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1001,"Tom",25,5300));
        list.add(new Employee(1002,"Mary",30,5500));
        list.add(new Employee(1003,"Betty",40,15000));
        list.add(new Employee(1004,"May",23,5000));
        list.add(new Employee(1005,"Tommy",50,50000));
        list.add(new Employee(1006,"Daniel",25,51000));
        list.add(new Employee(1007,"Sam",47,35000));
        list.add(new Employee(1008,"Melody",47,25000));
        list.add(new Employee(1009,"Melody",30,25050));
        return list;
    }

    public static List<Employee> getEmployeesmore() {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(1001,"Tom",25,5300));
        list.add(new Employee(1002,"Mary",30,5500));
        list.add(new Employee(1003,"Betty",40,15000));
        list.add(new Employee(1004,"May",23,5000));
        list.add(new Employee(1005,"Tommy",50,50000));
        list.add(new Employee(1006,"Daniel",25,51000));
        list.add(new Employee(1007,"Sam",47,35000));
        list.add(new Employee(1008,"Melody",47,25000));
        list.add(new Employee(1009,"Melody",30,25050));
        return list;
    }


}

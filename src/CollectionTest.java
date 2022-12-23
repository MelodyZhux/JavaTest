import org.testng.annotations.Test;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class CollectionTest {
    @Test
    public void test1() {

        Collection coll = new ArrayList();
        coll.add("AAA");
        coll.add("BBB");
        coll.add(new String("mother"));
        coll.add(123);
        coll.add(new Persons("Mary",20));
        coll.add(null);
        coll.add(null);
        coll.add(null);
        System.out.println(coll.size());

        Stream stream = coll.stream();


        boolean contains = coll.contains(123);
        System.out.println(coll.contains(new Persons("Mary",20)));;
        Collection coll2 = Arrays.asList("AAA","BBB");
        System.out.println(coll.containsAll(coll2));
        List<String> ll = Arrays.asList(new String[] {"AA","BB","CC"});




    }

    @Test
    public void test2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 1);
        map.put("bbb", 1);
        map.put("aaa", 1);
        map.put("ccc", 2);
        System.out.println(map);
    }
    @Test
    public void test3() {
        Persons p1 = new Persons("Mary", 1);
        Persons p2 = new Persons("Mary", 1);

        Map<Persons, Integer> map = new HashMap<>();
        map.put(p1,1);
        map.put(p2,1);
        System.out.println(map);
    }

    @Test
    public void test4() {
        Persons p1 = new Persons("Mary", 1);
        Persons p2 = new Persons("Mary", 1);
        Map<Persons,Integer> iMap = new IdentityHashMap<>();
        iMap.put(p1,1);
        iMap.put(p2,1);
        System.out.println(iMap);
    }

    public void test5() {
        Queue<Integer> q = new PriorityQueue();

    }
}

class Persons {
    private String name;
    private int age;

    public Persons() {
    }

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals-----------");
        if (this == o) return true;
        if (!(o instanceof Persons)) return false;
        Persons persons = (Persons) o;
        return age == persons.age && name.equals(persons.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

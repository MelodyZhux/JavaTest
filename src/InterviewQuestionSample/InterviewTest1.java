package InterviewQuestionSample;


import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class InterviewTest1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        int total = 0;
        for(Integer x : numbers) {
            if(x%2 == 0)
                total +=x*x;
        }
        System.out.println(total);

        int total1 = numbers.stream().filter(x ->x%2 == 0).mapToInt(x -> x*x).sum();
        System.out.println(total1);
    }

    @Test
    public void test1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        int result = 0;


        for (Map.Entry<String, Integer> entry : map.entrySet()) {

        }
        System.out.println(result);


    }
    @Test
    public void test2() {

        List<String> dates = new ArrayList<>();
        dates.add("1975-12-04");
        System.out.println(dates);


    //    Function<String, String > replaceSlashes = date -> date.replace("-","/");
    //    Map(String,String) replacesSlashes = date.replace("-","/");
      //  Comsumer<Date> replacesSlashes =  date -> date.replace("-","/");

        UnaryOperator<String> replacesSlashes = date -> date.replace("-","/");
        dates.replaceAll(replacesSlashes);
        System.out.println(dates);




    }

}

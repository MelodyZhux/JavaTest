import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("JavaFX");
        list.add("Java");
        list.add("WebGL");
        list.add("OpenCV");
        list.add("Impala");
        System.out.println("Contents of the Array List: "+list);
                //Removing the sub list

        System.out.println("Contents of the ArrayList object after invoking the clear() method: "+list);
    }

}

 enum Direction {
    EAST("E"),
    WEST("W"),
    NORTH("N"),
    SOUTH("S");

    private  final String shortCode;

    Direction(String e) {
        shortCode = e;
    }


    public String getShortCode() {
        return shortCode;
    }
}

class Unicorn {
    void  Unicorn(){}
}
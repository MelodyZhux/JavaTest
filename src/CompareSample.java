import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;

public class CompareSample {

    @Test
    public void test1() {
        String[] str = {"AA","CC","BB","ZZ","GG"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

    }
    @Test
    public void test2() {
        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lianxiang Mouse", 34);
        arr[1] = new Goods("huawei Mouse", 40);
        arr[2] = new Goods("xiaomi Mouse", 12);
        arr[3] = new Goods("jingqing Mouse", 30);
        arr[4] = new Goods("microsoft Mouse", 40);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void comparatorTest() {
        /*String[] arr = new String[]{"CC","BB","AA","FF"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/
      //  System.out.println(Arrays.toString(arr));
        Goods[] arr = new Goods[6];
        arr[0] = new Goods("lianxiang Mouse", 34);
        arr[1] = new Goods("huawei Mouse", 40);
        arr[2] = new Goods("xiaomi Mouse", 12);
        arr[3] = new Goods("jingqing Mouse", 30);
        arr[4] = new Goods("microsoft Mouse", 40);
        arr[5] = new Goods("huawei Mouse", 120);
        Arrays.sort(arr, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName().equals(o2.getName())){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }else {
                return o1.getName().compareTo(o2.getName());
                }

            }
        });
        System.out.println(Arrays.toString(arr));


    }


}

class Goods implements Comparable {
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods) {
            Goods goods = (Goods) o;

            if(this.price > goods.price) {
                return 1;
            } else if(this.price < goods.price) {
                return -1;

            } else {
                return -this.name.compareTo(goods.name);

            }
        }
        throw new RuntimeException("input object type is not the same as the current object type");
// or return Double.compare(this.price, goods.price);

    }

}

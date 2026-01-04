package Java_8_feature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product{

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("E");
        list.add("D");

//        Collections.sort(list,(a,b)->b.compareTo(a));
//        System.out.println(list);
    }
}

package Java_8_feature;

import java.util.Map;
import java.util.TreeMap;

public class SortedTreeMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "A");
        map.put(3, "C");
        map.put(2, "B");
        map.put(5, "E");
        map.put(4, "D");
        System.out.println("Without lambda");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m);
        }
        System.out.println("-----------------------------------");
        System.out.println("With lambda");
        //with lambda
        Map<Integer, String> map1 = new TreeMap<>((a, b) -> b - a);
        map1.put(1, "A");
        map1.put(3, "C");
        map1.put(2, "B");
        map1.put(5, "E");
        map1.put(4, "D");

        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}

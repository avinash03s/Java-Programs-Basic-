package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class AddDemo {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();
        System.out.println("Map is Empty or Not? " + isEmpty);

        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Black");
        map.put(104, "Yellow");
        map.put(106, "Blue");
        map.put(105, "Pink");

        System.out.println("Entries in Map : " + map);
        System.out.println("Map Size : " + map.size());

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(110, "White");
        map1.put(111, "Greay");
        map1.put(115, "Sky Yellow");
        map1.put(116, "Light");

        map.putAll(map1);
        System.out.println("Updated List : " + map);
    }
}

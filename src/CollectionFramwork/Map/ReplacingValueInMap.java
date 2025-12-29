package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class ReplacingValueInMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Red");
        map.put(103, "Green");
        map.put(102, "Black");
        map.put(104, "Yellow");
        map.put(106, "Blue");
        map.put(105, "Pink");

//        System.out.println(map);
        System.out.println(map.get(105).hashCode());

//        //replacing value
//        map.replace(103,"Avinash");
//        System.out.println(map);
//
//        map.replace(101,"Red","Karan");
//        System.out.println(map);
    }
}

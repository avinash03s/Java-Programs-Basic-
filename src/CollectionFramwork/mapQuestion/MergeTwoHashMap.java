package CollectionFramwork.mapQuestion;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoHashMap {

    public static void main(String[] args) {
        Map<Integer,String > map = new HashMap<>();
        map.put(4, "x");
        map.put(1, "z");
        map.put(3, "y");
        map.put(2, "w");

        Map<Integer,String > map2 = new HashMap<>();
        map2.put(10,"a");
        map2.put(20,"b");
        map2.put(30,"c");
        map2.put(40,"d");

        Map<Integer,String > map3 = new HashMap<>(map);
        map2.forEach((a,b)-> map3.merge(a, b, (v1 ,v2)-> v1 + v2));
        System.out.println(map3);
    }
}

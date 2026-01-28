package CollectionFramwork.mapQuestion;

import java.util.*;

public class SortHashMapKey {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(4,"d");
        map.put(1,"a");
        map.put(3,"c");
        map.put(2,"b");

        Map<Integer,String> sortMap = new TreeMap<>((o1, o2) -> o2-o1);
        sortMap.putAll(map);
        System.out.println(sortMap);
    }
}

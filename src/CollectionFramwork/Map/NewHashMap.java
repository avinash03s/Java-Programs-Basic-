package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class NewHashMap {

    static public void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(null, 100);
        map.put(null, 200);
        map.put(4, 0);
        System.out.println(map.get(null));
    }
}

package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GettingKeysAndValues {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("B", "B");
        map.put("D", "H");
        map.put("A", "A");
        map.put("C", "R");
        map.put("E", "T");

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.values());

        System.out.println(map.get("D"));


    }
}

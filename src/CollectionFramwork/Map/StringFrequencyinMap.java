package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class StringFrequencyinMap {

    public static void main(String[] args) {
        String string = "avinash";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < string.length() - 1; i++) {
            char ch = string.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
//        System.out.println(map);

        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {
            if (map1.getValue() == 1) {   /// non-repeated character in a string(this condition)
                System.out.println(map1);
            }
        }
    }
}

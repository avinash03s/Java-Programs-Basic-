package CollectionFramwork.mapQuestion;

import java.util.HashMap;
import java.util.Map;

public class Basic {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}

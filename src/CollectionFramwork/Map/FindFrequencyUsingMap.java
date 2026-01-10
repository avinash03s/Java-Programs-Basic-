package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyUsingMap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4, 34, 3, 4, 3, 2, 4, 5, 6, 5, 68};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
//        System.out.println(map);

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}

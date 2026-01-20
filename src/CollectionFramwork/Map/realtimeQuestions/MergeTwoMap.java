package CollectionFramwork.Map.realtimeQuestions;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMap {

    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(11, "X");
        map2.put(22, "Y");
        map2.put(33, "Z");

        Map<Integer, String> map3 = new HashMap<>(map1);
        map3.putAll(map2);
        System.out.println(map3);
    }
}

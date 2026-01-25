package CollectionFramwork.mapQuestion;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {

    public static void main(String[] args) {
        int[] coin = {1, 1, 2, 2, 2, 5, 5, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : coin) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int money = 0;
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int key = m.getKey();
            int value = m.getValue();
            int total = key * value;
            money += total;
            System.out.println("coin : " + key + " total : " + total);
        }
        System.out.println("Total money : " + money);
    }
}

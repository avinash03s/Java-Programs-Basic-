package CollectionFramwork.mapQuestion;


import java.util.HashMap;
import java.util.Map;

//Find the character with the maximum frequency in a string.
public class MaxFrequency {

    public static void main(String[] args) {
        String s = "programingg";
        char[] ch = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int count = 1;
        int max1 = Integer.MIN_VALUE;

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], count);
            }
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > max1) {

            }
        }
    }
}

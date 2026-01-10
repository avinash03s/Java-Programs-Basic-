package CollectionFramwork.mapQuestion;

import java.util.HashMap;
import java.util.Map;

//2) Count the frequency of each word in a sentence.

public class WordFrequency {

    public static void main(String[] args) {
        String s = "hi i am java developer hi i am java hi am java";
        String[] word = s.split(" ");

        Map<String, Integer> map = new HashMap<>();
//        int count = 1;
//        for (int i = 0; i < word.length; i++) {
//            if (map.containsKey(word[i])) {
//                map.put(word[i], map.get(word[i])+1);
//            } else {
//                map.put(word[i], count);
//            }
//        }
        for (String s1 : word){
            map.put(s1, map.getOrDefault(s1,0)+1);
        }

        for (Map.Entry<String, Integer> m : map.entrySet()) {
            System.out.println(m);
        }
    }
}

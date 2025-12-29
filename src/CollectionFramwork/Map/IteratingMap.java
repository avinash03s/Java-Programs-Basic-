package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("V ", " Violet");
        map.put("I ", " Indigo");
        map.put("B ", " Blue");
        map.put("G ", " Green");
        map.put("Y ", " Yellow");
        map.put("O ", " Orange");
        map.put("R ", " Red");

        System.out.println("Iterate Both Keys and Values: ");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("Iterate only Keys: ");
        Iterator<String> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println("Iterate only Values: ");
        Iterator<String> iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}

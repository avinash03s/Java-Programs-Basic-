package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterateExample {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("V ", " Violet");
        map.put("I ", " Indigo");
        map.put("B ", " Blue");
        map.put("G ", " Green");
        map.put("Y ", " Yellow");
        map.put("O ", " Orange");
        map.put("R ", " Red");

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //remove last entrySet
        iterator.remove();
        System.out.println(map.entrySet());
    }
}

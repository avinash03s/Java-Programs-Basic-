package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(2, "Ram");
        m.put(1, "Karan");
        m.put(3, "Avinash");
        m.put(5, "Raju");
        m.put(4, "Abhishek");

        System.out.println(m.get(3));//Avinash;
        Iterator<Map.Entry<Integer, String>> iterator = m.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

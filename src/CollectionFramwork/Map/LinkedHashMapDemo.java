package CollectionFramwork.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lm = new LinkedHashMap<>();
        lm.put(101, "Avinash");
        lm.put(102, "Rahul");
        lm.put(103, "Ram");
        lm.put(104, "Avinash");

        Set s1 = lm.entrySet();
        Iterator iterator = s1.iterator();
        while (iterator.hasNext()) {
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey() + "=" + m1.getValue());
        }
    }

}

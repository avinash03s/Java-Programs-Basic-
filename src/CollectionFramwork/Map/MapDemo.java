package CollectionFramwork.Map;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> m = new HashMap();
        m.put(101, "Avinash");
        m.put(102, "Rahul");
        m.put(103, "Ram");
        m.put(104, "Avinash");

//        System.out.println(m);
////        System.out.println(m.put(105,"Raju"));
//        Set s = m.keySet();
//        System.out.println(s);
//
//        Collection c = m.values();
//        System.out.println(c);

        Set s1 = m.entrySet();
        Iterator iterator = s1.iterator();
        while (iterator.hasNext()) {
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey() + "=" + m1.getValue());
        }


    }
}

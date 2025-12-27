package CollectionFramwork.Map;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap <Integer,String> m = new TreeMap<>();
        m.put(104, "Avinash");
        m.put(101, "Rahul");
        m.put(103, "Ram");
        m.put(102, "Avinash");

        System.out.println(m);

    }
}

package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapExample3 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(101, " John");
        map.put(202, " Ricky");
        map.put(303, " Deep");
        map.put(404, " Mark");
        map.put(505, " Maya");

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("Roll No: " + iterator.next());
        }

        System.out.println();
        System.out.println("Using For Loop");
        for (Integer rollNo : map.keySet()) {
            System.out.println("Roll No: " + rollNo);
        }

        System.out.println();

        Iterator<String> iterator1 = map.values().iterator();
        while (iterator1.hasNext()) {
            System.out.println("Name: " + iterator1.next());
        }

        System.out.println();
        System.out.println("Using For loop");
        for (String name : map.values()) {
            System.out.println("Name: " + name);
        }

        System.out.println();
        Iterator<Map.Entry<Integer, String>> iterator2 = map.entrySet().iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        System.out.println("--------------------------------------");
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Roll No : "+entry.getKey()+", Name : "+entry.getValue());
        }



    }
}

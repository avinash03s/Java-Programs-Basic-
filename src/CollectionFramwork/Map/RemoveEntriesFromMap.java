package CollectionFramwork.Map;

import java.util.HashMap;
import java.util.Map;

public class RemoveEntriesFromMap {

    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();
        m.put(110,"Avinash");
        m.put(111,"Rahul");
        m.put(113,"Ram");
        m.put(112,"Raju");
        m.put(115,"Karan");

        System.out.println("Entries without remove: "+m);

       m.remove(113);

        System.out.println(m);

        m.remove(112,"Raju");
        System.out.println(m);
    }
}

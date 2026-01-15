package CollectionFramwork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Avinash", "Karan", "Rahul"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("Without modification: " + element);

            if ("Avinash".equals(element)) {
                list.add("Surwase");
            }
        }
        System.out.println(list);
    }
}

//CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentHashMap is best example of FailSafe;
//ArrayList, HashSet, HashMap are example of FailFast;

package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UseWhileLoop {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()) {
//            Integer i = iterator.next();
//            System.out.println(i);
//            // structural modification – triggers fail-fast behaviour
//            if (3 == i) {
//                list.add(45);
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 3) {
                list.add(45);
            }
            System.out.println(list);
        }
    }
}
//CopyOnWriteArrayList, CopyOnWriteArraySet, ConcurrentHashMap is best example of FailSafe;
//ArrayList, HashSet, HashMap are example of FailFast;

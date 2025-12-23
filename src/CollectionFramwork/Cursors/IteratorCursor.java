package CollectionFramwork.Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class IteratorCursor {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            Integer integer = (Integer) itr.next();
            if (integer % 2 == 0) {
                System.out.println(integer);
            } else {
                itr.remove();
            }
        }
        System.out.println(list);
    }
}

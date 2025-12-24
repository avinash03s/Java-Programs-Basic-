package CollectionFramwork.Cursors;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorCursor {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");

        System.out.println(list);

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String s = (String) listIterator.next();
            if (s.equals("10")) {
                listIterator.remove();
            } else if (s.equals("40")) {
                listIterator.add("45");
            } else if (s.equals("30")) {
                listIterator.set("35");
            }
        }
        System.out.println(list);
    }
}

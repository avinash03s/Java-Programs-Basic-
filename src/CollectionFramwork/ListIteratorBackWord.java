package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorBackWord {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Avi");
        list.add(10);
        list.add(20);
        list.add("Ramu");

        System.out.println("Forward Direction: ");
        ListIterator<Object> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int index = listIterator.nextIndex();
            System.out.println("Index no: " + index + " = " + listIterator.next());
        }
        listIterator.add("Rohit");
        listIterator.add(45);
        System.out.println(list);
        System.out.println();

        System.out.println("Backward Direction: ");
        while (listIterator.hasPrevious()) {
            int index1 = listIterator.previousIndex();
            System.out.println("Index no: " + index1 + " = " + listIterator.previous());
        }
        System.out.println(list);
    }
}

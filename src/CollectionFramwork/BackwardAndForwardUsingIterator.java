package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BackwardAndForwardUsingIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        ListIterator iterator = list.listIterator();
        System.out.println("Element Forward direction");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Elements in backward direction");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

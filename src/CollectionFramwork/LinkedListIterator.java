package CollectionFramwork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Avi");
        list.add("10");
        list.add("20");
        list.add("Ramu");

        System.out.println("Using ListIterator: ");
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("Using Iterator");
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Using For-each loop");
        for (String s : list){
            System.out.println(s);
        }
    }
}

package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        //Normal for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------------------");
        //using Iterator
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("-------------------------");
        //Using ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("-------------------------");
        //for-each Loop
        for (String s : list) {
            System.out.println(s);
        }
    }
}

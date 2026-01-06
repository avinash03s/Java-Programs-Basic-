package CollectionFramwork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Object> list = new LinkedList<>();
        list.add("Avinash");
        list.add(45);
        list.add(null);
        list.add("Java");//[Avinash,45,null,Java]
        list.set(0,"Developer");//[Developer,45,null,Java]
        list.add(0,"Python");
        System.out.println(list);
        System.out.println(list.get(4));
//        ((LinkedList<Object>) list).removeLast();
//        ((LinkedList<Object>) list).addFirst("ABC");
//        System.out.println(list);

    }
}

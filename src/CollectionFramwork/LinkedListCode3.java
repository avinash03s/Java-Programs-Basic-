package CollectionFramwork;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListCode3 {

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Java");
        list1.add("PHP");
        list1.add("C++");
        list1.add("C");
        System.out.println("Linked List: "+list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("JS");
        list2.add("HTML");
        list2.add("SQL");
        list2.add("Ruby");
        System.out.println("Array List: "+list2);

        list1.addAll(list2);
        System.out.println("Append List : "+list1);
    }
}

package CollectionFramwork;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//2) Write a Java program to traverse the elements of a LinkedList in reverse direction?
public class LinkedListCode2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("JavaScript");

        System.out.println(list);
        Iterator<String> iterator = list.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

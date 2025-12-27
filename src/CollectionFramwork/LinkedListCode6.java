package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode6 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Avinash");
        list.add("Arun");
        list.add("Ramesh");
        list.add("Rajesh");
        list.add("Raman");
        System.out.println(list);
        System.out.println("Original List size: "+list.size());

        list.removeFirst();
        System.out.println("After remove first element: "+list);
        System.out.println("After remove first element List size: "+list.size());

        list.removeLast();
        System.out.println("After remove last element: "+list);
        System.err.println("After remove last element List size: "+list.size());
    }
}

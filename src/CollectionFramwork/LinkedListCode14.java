package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode14 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2 = (LinkedList<Integer>) list1.clone();
        System.out.println(list2);
    }
}

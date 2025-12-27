package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode4 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(20);
        list.offer(30);
        list.offerLast(40);
        System.out.println(list);

        list.addFirst(2);
        list.offerFirst(1);

        System.out.println(list);
    }
}

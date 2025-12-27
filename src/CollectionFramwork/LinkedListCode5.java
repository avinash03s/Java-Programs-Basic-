package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode5 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);
        //adding element in specific position
        list.add(2,35);
        list.add(3,45);

        for (Integer i : list){
            System.out.println(i);
        }
    }
}

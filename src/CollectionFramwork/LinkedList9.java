package CollectionFramwork;

import java.util.LinkedList;

public class LinkedList9 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Avinash");
        list.add("Arun");
        list.add("Ramesh");
        list.add("Rajesh");
        list.add("Raman");

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        System.out.println(list.get(0));
    }
}

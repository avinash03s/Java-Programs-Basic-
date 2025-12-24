package CollectionFramwork;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        //default Natural Sorting order;
        TreeSet<Integer> list = new TreeSet<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        System.out.println(list);
    }
}

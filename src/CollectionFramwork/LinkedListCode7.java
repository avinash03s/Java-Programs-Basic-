package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode7 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Rohit");
        list.add("Virat");
        list.add("MS");
        list.add("Sachin");
        list.add("SKY");

        System.out.println(list);

        list.set(2, "KL Rahul");
        list.set(3, "Hardik");

//        for (String s : list) {
//            System.out.println(s);
//        }
        System.out.println(list);
    }
}

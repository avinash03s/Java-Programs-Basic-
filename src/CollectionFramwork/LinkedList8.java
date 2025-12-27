package CollectionFramwork;

import java.util.LinkedList;

public class LinkedList8 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Rohit");
        list.add("Virat");
        list.add("MS");
        list.add("Sachin");
        list.add("SKY");
        System.out.println(list);
        System.out.println(list.getFirst());//Rohit
        System.out.println(list.getLast());//SKY
        System.out.println(list.element());//Rohit

    }
}

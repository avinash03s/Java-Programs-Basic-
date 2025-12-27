package CollectionFramwork;
/*1) Given an element, how do you find out whether that element exist in a LinkedList or not.
If it exists retrieve the position of that element?*/

import java.util.LinkedList;

public class LinkedListCode1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("C#");

        System.out.println(list);

        String s = "JSP";
        boolean contains = list.contains(s);
        if (contains) {
            System.out.println(list.indexOf(s));
        }

        contains = list.contains("STRUTS");

        if (contains) {
            System.out.println(list.indexOf(s));
        }

    }

}

package CollectionFramwork;

import java.util.LinkedList;

public class LinkedList11 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("JAVA");
        list.add("J2EE");
        list.add("JSP");
        list.add("SERVLETS");
        list.add("JDBC");
        System.out.println(list);

        list.removeFirstOccurrence("J2EE");
        System.out.println(list);

        list.removeLastOccurrence("JSP");
        System.out.println(list);
    }
}

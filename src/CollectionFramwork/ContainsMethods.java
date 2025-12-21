package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ContainsMethods {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Hi");
        list.add("Hello");
        System.out.println(list.contains("Hi"));//check if object is present in list, if present return true or not;
        System.out.println(list.iterator());
    }
}

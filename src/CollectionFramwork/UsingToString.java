package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class UsingToString {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        System.out.println(list.toString());
    }
}

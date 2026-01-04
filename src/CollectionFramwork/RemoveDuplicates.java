package CollectionFramwork;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("Python");
        list.add("C++");
        list.add("C++");
        list.add("C#");

        Set<String> set = new LinkedHashSet<>(list);

        for (String s : set){
            System.out.println(s);
        }
    }
}

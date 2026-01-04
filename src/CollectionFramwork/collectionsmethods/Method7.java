package CollectionFramwork.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method7 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        List<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //checks whether two collections have no common elements.
        //true → no common elements
        //false → at least one element is common
        System.out.println(Collections.disjoint(list,list2));
    }
}

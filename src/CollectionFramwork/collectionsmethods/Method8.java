package CollectionFramwork.collectionsmethods;

import java.util.*;

public class Method8 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10,20,30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(0);
        list2.add(0);

        //Replaces elements of destination list with source list elements
        Collections.copy(list2,list1);
        System.out.println(list2);
    }
}

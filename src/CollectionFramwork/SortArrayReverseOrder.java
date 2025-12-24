package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayReverseOrder {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(40);
        System.out.println("Before Sorting: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("😎");
        System.out.println("After Sorting: " + list);
    }
}

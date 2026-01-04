package CollectionFramwork.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
//The list must be sorted before using this method.
        Collections.sort(list);
        System.out.println(list);
// Collections.binarySearch() is used to search an element in a sorted list using binary search.
        int index = Collections.binarySearch(list, 30);
        System.out.println(index);
    }
}

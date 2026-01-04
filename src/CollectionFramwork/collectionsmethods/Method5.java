package CollectionFramwork.collectionsmethods;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method5 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //This method randomly shuffles the elements in the specified collection.
        Collections.shuffle(list);
        for (Integer i : list){
            System.out.println(i);
        }

    }
}

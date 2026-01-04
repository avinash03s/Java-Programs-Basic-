package CollectionFramwork.collectionsmethods;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method6 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        //This method returns synchronized collection backed by the specified collection.
        System.out.println(Collections.synchronizedList(list));
        for (Integer i : list){
            System.out.println(i);
        }

    }
}

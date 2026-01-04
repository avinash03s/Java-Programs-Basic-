package CollectionFramwork.collectionsmethods;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method1 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Max Value From List: "+Collections.max(list));

        //methods reference(::)
        list.forEach(System.out::println);
    }
}

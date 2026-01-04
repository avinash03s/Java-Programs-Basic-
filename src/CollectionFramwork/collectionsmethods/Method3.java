package CollectionFramwork.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method3 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);

        Collections.sort(list);

//        list.forEach(System.out::println);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}

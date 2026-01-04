package CollectionFramwork.collectionsmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Method9 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //give list in reverse order
        Collections.reverse(list);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}

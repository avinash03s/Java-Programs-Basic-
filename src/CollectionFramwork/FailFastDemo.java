package CollectionFramwork;

import java.util.LinkedList;
import java.util.List;

public class FailFastDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer i : list){
            if (i == 2){
                list.remove(i);
            }
            System.out.println(i);
        }
    }
}

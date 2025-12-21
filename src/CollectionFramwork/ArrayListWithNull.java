package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithNull {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>(1000);
        list.add(null);
        list.add("Java");
        list.add("Hello");
        list.add("World");
        list.add("Avinash");
        list.add("Karan");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Object ob:list){
            System.out.println(ob);
        }
    }
}

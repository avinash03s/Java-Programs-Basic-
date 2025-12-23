package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethod {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

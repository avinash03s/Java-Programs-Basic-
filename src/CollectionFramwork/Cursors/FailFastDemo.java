package CollectionFramwork.Cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            list.remove(2);
        }
    }
}

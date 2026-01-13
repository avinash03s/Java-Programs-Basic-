package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveElementFromList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Avinash", "XYZ", "Surwase"));

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("XYZ")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}

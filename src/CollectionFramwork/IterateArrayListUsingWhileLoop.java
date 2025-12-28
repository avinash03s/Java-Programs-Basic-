package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class IterateArrayListUsingWhileLoop {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Avi");
        list.add("10");
        list.add("20");
        list.add("Ramu");
        int i = 0;

        while (list.size() > i) {
            System.out.println(list.get(i));
            i++;
        }
    }
}

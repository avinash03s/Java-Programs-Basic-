package CollectionFramwork;

import java.util.HashSet;
import java.util.Iterator;


public class SetIterate {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Avi");
        set.add("10");
        set.add("20");
        set.add("Ramu");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("using for-each loop");
        for (String s : set) {
            System.out.println(s);
        }
    }
}

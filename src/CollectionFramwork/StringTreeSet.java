package CollectionFramwork;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//write program to insert String obj into the TreeSet where all element should be inserted
//according to reverse of alphabetical order
public class StringTreeSet implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return -s1.compareTo(s2);
    }
}

class StringSet {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet(new StringTreeSet());
        set.add("B");
        set.add("A");
        set.add("E");
        set.add("D");
        set.add("C");

        System.out.println(set);

        //Iterator
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------------");
        //For-each
        for (String str : set) {
            System.out.println(str);
        }
    }
}

package CollectionFramwork;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//write program to insert StringBuffer obj into the TreeSet where all element should be inserted
//according to reverse of alphabetical order
public class StringBufferTreeSet implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}

class MainStringBuffer {

    public static void main(String[] args) {
        TreeSet<StringBuffer> set = new TreeSet<>(new StringBufferTreeSet());
        set.add(new StringBuffer("B"));
        set.add(new StringBuffer("A"));
        set.add(new StringBuffer("D"));
        set.add(new StringBuffer("C"));

        System.out.println(set);
        //Using Iterator;
        Iterator i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("__________");

        //using For-each loop
        for (StringBuffer sb : set) {
            System.out.println(sb);
        }
    }
}

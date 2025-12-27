package CollectionFramwork.Map;

import CollectionFramwork.StringTreeSet;

import java.util.Comparator;
import java.util.TreeMap;

class StringTreeMap implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
//        return s2.compareTo(s1); //reverse sorting order
        return -s2.compareTo(s1); //Ascending sorting order
    }
}
public class StringTreeMapSorting {

    public static void main(String[] args) {
        TreeMap<Integer,String> m = new TreeMap<>(new StringTreeMap());
        m.put(104, "Avinash");
        m.put(101, "Rahul");
        m.put(103, "Ram");
        m.put(102, "Avinash");

        System.out.println(m);
    }
}

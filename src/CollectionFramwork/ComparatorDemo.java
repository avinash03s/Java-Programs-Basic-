package CollectionFramwork;

import java.util.Comparator;
import java.util.TreeSet;

//write program to insert integer objet into the TreeSet where the sorting order is Descending order;
public class ComparatorDemo implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
//        if (i1 < i2) {
//            return +1;
//        } else if (i1 > i2) {
//            return -1;
//        } else {
//            return 0;
//        }
//        return i1.compareTo(i2); //[Ascending order]
        return -i1.compareTo(i2);  //[Descending order]
//        return i2.compareTo(i1);   //[Descending order]
//        return -i2.compareTo(i1);    //[Ascending order]
//        return +1;                   //[Insertion Order]
//        return -1;                 // [Reverse Insertion Order]
    }
}

class Main {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new ComparatorDemo());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}
//in TreeSet if we are passing the Comparator object then internally call compare();
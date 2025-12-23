package CollectionFramwork;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<Object> h = new LinkedHashSet<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add(45);
        System.out.println(h.add("A"));//duplicate not allow
        System.out.println(h);//insertion order are preserved

//        for (Object ob : h){
//            System.out.println(ob);
//        }
    }
}

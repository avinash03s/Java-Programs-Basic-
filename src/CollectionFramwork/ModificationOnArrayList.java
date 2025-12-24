package CollectionFramwork;

import java.util.ArrayList;

public class ModificationOnArrayList {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        System.out.println(list);
        list.add(3, 3);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.set(4, 5);
        System.out.println("After Modification : " + list);
    }
}

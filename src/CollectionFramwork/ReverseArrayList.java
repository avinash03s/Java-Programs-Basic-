package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before Reversing ArrayList: ");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("After Reversing ArrayList: ");
        System.out.println(list);
    }
}

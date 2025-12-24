package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Avinash");
        list.add("Karan");
        list.add("Ram");
        list.add("Avinash");
        list.add("Ram");

        //using HashSet

        HashSet<String> set = new HashSet<>(list);
        ArrayList<String> list1 = new ArrayList<>(set);
        System.out.println(list1);

        //using LinkedHashSet

//        LinkedHashSet<String> set1 = new LinkedHashSet<>();
//        ArrayList<String> list2 = new ArrayList<>(set1);
//        System.out.println(list2);
    }
}

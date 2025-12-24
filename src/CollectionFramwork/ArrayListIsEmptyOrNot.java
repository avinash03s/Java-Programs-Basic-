package CollectionFramwork;

import java.util.ArrayList;

public class ArrayListIsEmptyOrNot {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());

        list.add("Java");

        System.out.println(list.isEmpty());
    }
}

package CollectionFramwork;

import java.util.ArrayList;


public class ArrayListConstructor {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); //initial capacity - 10;

        ArrayList<String> list1 = new ArrayList<>(20);

        ArrayList<Integer> list2 = new ArrayList<>(list);

    }
}

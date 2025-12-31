package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Converting ArrayList to Array

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");

        String arr[] = new String[list.size()];
        list.toArray(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}

//Converting Array to ArrayList
//using Collection.addAll();
class ArrayToArrayList {

    public static void main(String[] args) {
        String arr[] = new String[]{"Avinash", "Rama", "Rahul"};

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, arr);

        for (String s : list) {
            System.out.println(s);
        }
    }
}

//Converting Array to ArrayList
//using Arrays.asList();
class ArrayToArrayList2 {

    public static void main(String[] args) {
        String[] arr = new String[]{"A", "B", "C", "D", "E"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        for (String s : list) {
            System.out.println(s);
        }
    }
}

//Converting Array to ArrayList
//using ArrayList.addAll();
class ArrayToArrayList3 {

    public static void main(String[] args) {
        String[] arr = new String[]{"Z", "Y", "X"};

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        for (String s : list) {
            System.out.println(s);
        }
    }
}

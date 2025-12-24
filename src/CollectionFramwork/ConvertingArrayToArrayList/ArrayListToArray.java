package CollectionFramwork.ConvertingArrayToArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("PhP");
        list.add("Html");

        String[] array = new String[list.size()];
        list.toArray(array);

        for (String s : array) {
            System.out.println(s);
        }
    }
}

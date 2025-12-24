package CollectionFramwork;

import java.util.ArrayList;

public class DecreaseCapacityManually {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //increase capacity manually
        list.ensureCapacity(12);

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        list.add("I");
        list.add("J");
        list.add("K");
        list.add("L");
        System.out.println(list);

        //decrease capacity manually
        list.trimToSize();
        System.out.println(list);
    }
}

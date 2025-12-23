package CollectionFramwork;

import java.util.ArrayList;

public class IncreaseCapacityManually {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.ensureCapacity(20);
    }
}
//ArrayList is automatically increased when we try to add more elements than the current capacity.
//To manually increase the current capacity, ensureCapacity() method is used.

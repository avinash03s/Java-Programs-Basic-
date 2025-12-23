package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] namesArray = new String[1000];
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < namesArray.length; i++) {
            namesArray[i] = "Name" + i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Array : " + (endTime - startTime) + "ms");

        List<String> list = new ArrayList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i <= 1000; i++) {
            list.add("Name" + i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList : " + (endTime - startTime) + "ms");
    }
}

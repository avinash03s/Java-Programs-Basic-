package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);

        for (Object obj : integerList){
            System.out.println(obj);
        }
        System.out.println("Getting Index No 3: "+integerList.get(3));
    }
}

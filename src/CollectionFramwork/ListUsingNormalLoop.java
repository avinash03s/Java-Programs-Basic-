package CollectionFramwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUsingNormalLoop {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
            for (Integer  i : list){
                System.out.println(i);
            }
    }
}

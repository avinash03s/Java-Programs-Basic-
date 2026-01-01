package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ConvertingHashMapToArrayList {

    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Java",1);
        m.put("Programing",2);

        Set<String> keySet = m.keySet();

        ArrayList<String> list = new ArrayList<>(keySet);
        for (String s : list){
            System.out.println(s);
        }

    }
}

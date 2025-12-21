package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Python");
        list.add("Php");

        for (Object obj:list){
            System.out.println(obj);
        }
    }
}

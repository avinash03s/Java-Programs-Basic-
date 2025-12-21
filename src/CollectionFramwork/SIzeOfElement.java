package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class SIzeOfElement {

    public static void main(String[] args) {
        List<Object> objectList = new ArrayList<>();
        objectList.add("Java");
        objectList.add("C++");
        objectList.add("PHP");

        System.out.println("Size of out List : "+objectList.size());

        for (Object obj : objectList){
            System.out.println(obj);
        }
    }
}

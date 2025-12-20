package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {

    public static void main(String[] args) {
        List<Object> anyType = new ArrayList<>();

        anyType.add("Avinash");
        anyType.add(45);
        anyType.add("Karan");
        anyType.add(18);
        anyType.add("AI");

        for ( Object ob : anyType){
            System.out.println(ob);
        }

        System.out.println("Removing Object: "+anyType.remove("AI"));
        System.out.println("After Removing: "+anyType);
    }
}

package CollectionFramwork.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsInJava {

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
//        list.add("Java");
//        list.add(100);

        List<String> stringList = new ArrayList<>(); //<> this is generics
        stringList.add("Avinash");
        stringList.add("Java");
        stringList.add("Services");
//        stringList.remove("Java");
//        stringList.clear();
        System.out.println(stringList.get(2));
        System.out.println(stringList.size());

        for (String s : stringList){
            System.out.println(s);
        }
    }
}

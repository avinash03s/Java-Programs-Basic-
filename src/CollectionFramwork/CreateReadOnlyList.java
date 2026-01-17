package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CreateReadOnlyList {

    public static void main(String[] args) {
        List<String> originallist = new ArrayList<>();
        originallist.add("Avinash");
        originallist.add("Rahul");
        originallist.add("Mahesh");

        originallist.remove("Mahesh");
        for (String s : originallist) {
            System.out.println(s);
        }

        System.out.println("----Make Read Only List---");
        List<String> unmodifiableList = Collections.unmodifiableList(originallist);
        try {
            unmodifiableList.add("Raju");
            unmodifiableList.remove("Mahesh");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(unmodifiableList);
    }
}

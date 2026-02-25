package java_10_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactoryMethod {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        list.add(45);
        System.out.println("Original List : " + list);

        List<Integer> copyExitingList = List.copyOf(list); /// copy and Make Immutable
        copyExitingList.add(18);///throw exception - UnsupportedOperationException
        System.out.println("Copy of Exiting List: " + copyExitingList);
    }
}

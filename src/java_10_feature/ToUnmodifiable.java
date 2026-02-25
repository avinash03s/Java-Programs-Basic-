package java_10_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiable {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        List<Integer> collect = list.stream().collect(Collectors.toUnmodifiableList());
        System.out.println(collect);

        //Collectors.toUnmodifiableList() is a collector that turns a stream into a List that cannot be modified.
        //Once created, the list is immutable: you cannot add, remove, or change elements.
        //It’s like combining collect(Collectors.toList()) + Collections.unmodifiableList(...) but shorter and safer.
        //Factory method vs collector: Similar to List.copyOf(), but used inside stream pipelines.
    }
}

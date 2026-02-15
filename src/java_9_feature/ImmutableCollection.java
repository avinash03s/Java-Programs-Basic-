package java_9_feature;

import java.util.List;
import java.util.Map;
import java.util.Set;

class ImmutableCollectionJava9 {

    static void listOf() {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        list.add(20);///throw exception - UnsupportedOperationException
        System.out.println(list);
    }

    static void setOf() {
        Set<Integer> set = Set.of(1, 2, 5, 6, 7, 8, 9, 3, 4);///duplicate not allowed ex- throw -IllegalArgumentException
//        set.add(99);/// we can not modify Immutable
        System.out.println(set);
    }

    static void mapOf(){
        Map map = Map.of("one",1,"two",2,"three",3);
        System.out.println(map);
    }

}

public class ImmutableCollection extends ImmutableCollectionJava9 {

    public static void main(String[] args) {
        listOf();
        setOf();
        mapOf();
    }
}

package CollectionFramwork.mapQuestion;

import java.util.*;

class SortHashMapInJava8 {

    static void sortKeyNaturalOrder() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "x");
        map.put(1, "z");
        map.put(3, "y");
        map.put(2, "w");

        System.out.println("Sort Normal Order by Keys");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    static void sortValuesNaturalOrder() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "w");
        map.put(1, "z");
        map.put(3, "x");
        map.put(2, "y");

        System.out.println();
        System.out.println("Sort Normal Order By Values");
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    static void sortKeyReverserOrder() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "d");
        map.put(1, "a");
        map.put(3, "c");
        map.put(2, "b");

        System.out.println();
        System.out.println("Sort by Key in reverse order");
        map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    static void sortValuesReverseOrder() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "a");
        map.put(1, "b");
        map.put(3, "c");
        map.put(2, "d");

        System.out.println();
        System.out.println("Sort by Value in reverse order");
        map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    static void customizeSort() {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "d");
        map.put(1, "a");
        map.put(3, "c");
        map.put(2, "b");

        System.out.println("Customize Sorting");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey((x, y) -> x - y))
                .forEach(System.out::println);
    }
}

public class SortKey {

    public static void main(String[] args) {
        SortHashMapInJava8.sortKeyNaturalOrder();
        SortHashMapInJava8.sortValuesNaturalOrder();
        SortHashMapInJava8.sortKeyReverserOrder();
        SortHashMapInJava8.sortValuesReverseOrder();
        SortHashMapInJava8.customizeSort();
    }

}

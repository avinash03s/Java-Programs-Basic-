package CollectionFramwork;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add(45);
        hashSet.add(null);
        System.out.println(hashSet.add("A")); // false (Duplicate are not allow)
        System.out.println(hashSet);//insertion order not preserved
    }
}

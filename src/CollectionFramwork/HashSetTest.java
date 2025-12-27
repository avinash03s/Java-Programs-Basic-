package CollectionFramwork;

import java.util.HashSet;

public class HashSetTest {
    private int id;

    HashSetTest(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        HashSetTest s = (HashSetTest) obj;
        return this.id == s.id;
    }
}

class MainHashSet {

    public static void main(String[] args) {
        HashSet<HashSetTest> set = new HashSet<>();
        set.add(new HashSetTest(1));
        set.add(new HashSetTest(1));
        System.out.println(set);
    }
}

package CollectionFramwork.Map;

import java.util.Hashtable;

class HashTableD {
    private int id;

    HashTableD(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return id+"";
    }
}

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String ,HashTableD> t = new Hashtable<>();
        t.put("Avinash",new HashTableD(101));
        t.put("Arun",new HashTableD(102));
        t.put("Ramu",new HashTableD(104));
        t.put("Raju",new HashTableD(103));
        System.out.println(t);
    }
}

package CollectionFramwork;

import java.util.TreeSet;

public class TreeSet2Demo {

    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("K");//root element
        t.add("Z");//=> "Z".compareTo("K"); =  +ve
        t.add("A");//=> "A".compareTo("K"); =  -ve
        t.add("A");//=> "A".compareTo("K"); =  -ve & "A".compareTo("A"); = 0
        System.out.println(t);//[A,K,Z]
    }
}
//we are Depending on Natural Sorting Order add object in TreeSet
//internally JVM call compareTo() methods;
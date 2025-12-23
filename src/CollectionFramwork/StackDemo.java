package CollectionFramwork;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack ob = new Stack();
        ob.push("A");
        ob.push("B");
        ob.push("C");

        System.out.println(ob);//[A,B,C]
        System.out.println(ob.search("A"));//3
        System.out.println(ob.search("Z"));//-1
    }
}

package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListCode12 {

    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        for (int i = 0; i <= stack.size(); i++){
            System.out.println(stack.pop());
        }
    }
}

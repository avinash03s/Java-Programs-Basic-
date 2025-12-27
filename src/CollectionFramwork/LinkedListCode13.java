package CollectionFramwork;
import java.util.LinkedList;

public class LinkedListCode13 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        list.clear();
        System.out.println(list);
    }
}

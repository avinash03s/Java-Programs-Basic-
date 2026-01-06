package CollectionFramwork.myOwnClasses;

public class CustomLinkedListDemo {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());// size-5
        System.out.println(list.get(3));//40
        System.out.println(list.getFirst());//10
        System.out.println(list.getLast());//50
//        System.out.println(list.remove(3));
    }
}

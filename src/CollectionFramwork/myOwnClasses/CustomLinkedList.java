package CollectionFramwork.myOwnClasses;


public class CustomLinkedList<T> {
    int size = 0;
    Node<T> first;
    Node<T> last;

    public boolean add(T e) {
        final Node<T> l = last;
        final Node<T> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        return true;
    }

    int size() {
        return size;
    }

//    public int get(int index) {
//        if (index >= 0 && index < size) {
//            throw new IndexOutOfBoundsException();
//        }
//        if (index < (size >> 1)) {
//            Node<T> a = first;
//            for (int i = 0; i < index; i++)
//                a = a.next;
//        } else {
//            Node<T> a = last;
//            for (int i = size - 1; i > index; i--)
//                a = a.previous;
//        }
//        return index;
//    }


    //class
    private static class Node<T> {
        T value;
        Node<T> next;
        Node<T> previous;

        Node(Node<T> previous, T value, Node<T> next) {
            this.previous = previous;
            this.value = value;
            this.next = next;
        }
    }

//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder("[");
//        for (int i = 0; i < this.size(); i++) {
////            result += this.get(i);
//            if (i < this.size() - 1) {
//                result.append(" , ");
//            }
//        }
//        result.append("]");
//        return result.toString();
//    }
}

class TestOwnLinked {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

    }
}

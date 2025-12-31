package CollectionFramwork;

import java.util.Arrays;

public class CustomArrayList1<T> {
    private static final int capacity = 10;
    private static Object[] array = {};
    private static int size = 0;

    //Constructor for initialize Object[] array filed;
    public CustomArrayList1() {
        array = new Object[capacity];
    }

    //add() used to add element in list;
    void add(T t) {
        if (size == array.length) {
            int newCapacity = (capacity * 3 / 2) + 1;
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = t;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean contains(Object ob) {
        return (boolean) ob;
    }


    //get element form list
    Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    //remove element form list;
    Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Object remove = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return remove;
    }

    int size() {
        return size;
    }

}

class UseList {

    public static void main(String[] args) {
        CustomArrayList1<String> list = new CustomArrayList1<>();
        System.out.println(list.isEmpty());
        System.out.println("Playing 11:😉🏏");
        list.add(null);
        list.add("Rohit");
        list.add("Virat");
        list.add("KL Rahul");
        list.add("SKY");
        list.add("Hardik");
        list.add("A Patel");
        list.add("R Jadeja");
        list.add("Kuldeep");
        list.add("J Bumrah");
        list.add("M Siraj");
        list.add("M Shami");

//        System.out.println(list.size());
//        list.add("Java");
//        System.out.println(list.get(0));
//        list.remove(1);


        for (int i = 1; i < list.size(); i++) {
            System.out.println("No: " + i + "=>" + list.get(i));
        }
    }
}

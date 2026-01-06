package CollectionFramwork.myOwnClasses;

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
            int newCapacity = capacity + (capacity / 2);
            array = Arrays.copyOf(array, newCapacity);
        }
        array[size++] = t;
    }

    void add(int index, T e) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index : " + index + " is out of Range" + "Size : " + size());
        }
        if (size >= array.length) {
            int newCapacity = (capacity * 3 / 2) + 1;
            array = Arrays.copyOf(array, newCapacity);
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = e;
        size++;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == null) {
                if (array[i] == null) {
                    return true;
                }
            } else {
                if (o.equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    //get element form list
    Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    //remove element form list Object Based;
    Object remove(Object o) {
        for (int index = 0; index < size; index++) {
            if (array[index].equals(o)) {
                Object removed = array[index];
                for (int i = index; i < size - 1; i++) {
                    array[i] = array[i + 1];
                }
                size--;
                return removed;
            }
        }
        return null; //  if object not found
    }

    //index based remove
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

    public int getIndexOf(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e))
                return i;
        }
        return -1;
    }

    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }


    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < this.size(); i++) {
            result += this.get(i);
            if (i < this.size() - 1) {
                result += " , ";
            }
        }
        result += "]";
        return result;
    }
}


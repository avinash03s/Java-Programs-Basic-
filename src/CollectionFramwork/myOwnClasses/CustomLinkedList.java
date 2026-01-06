package CollectionFramwork.myOwnClasses;


import ExceptionHandling.CustomException;

import javax.swing.*;
import java.util.LinkedList;

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

    T getFirst() {
        Node<T> f = first;
        if (f == null) {
            throw new CustomException("No element");
        }
        return f.value;
    }

    T getLast() {
        Node<T> l = last;
        if (l == null) {
            throw new CustomException("No element");
        }
        return l.value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }


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

//    Object remove(Object o) {
//        Node<T> a = null;
//
//        T value = a.value;
//        Node<T> next = a.next;
//        Node<T> previous = a.previous;
//
//
//        if (o == null) {
//            for (a = first; a != null; a = a.next) {
//
//                }
//            }
//        } else {
//            for (a = first; a != null; a = a.next) {
//                }
//            }
//        }
//        return false;
//    }

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

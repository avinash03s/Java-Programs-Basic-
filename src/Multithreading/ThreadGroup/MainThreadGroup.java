package Multithreading.ThreadGroup;

public class MainThreadGroup {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getThreadGroup()); // main group
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system
    }
}

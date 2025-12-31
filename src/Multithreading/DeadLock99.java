package Multithreading;

//DeadLock....!

public class DeadLock99 {

    static String s1 = "Hello";
    static String s2 = "Java";

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (s1) {
                    System.out.println("Thread One => Resources s1");
                    synchronized (s2) {
                        System.out.println("Thread One => Resource s2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (s2) {                                     //replace s1
                    System.out.println("Thread Two => Resource s1");
                    synchronized (s1) {                                  //replace s2
                        System.out.println("Thread Two => Resource s2");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}
//How to avoid DeadLock
//1)maintain resources order;
//2)if possible to avoid nested synchronized block;
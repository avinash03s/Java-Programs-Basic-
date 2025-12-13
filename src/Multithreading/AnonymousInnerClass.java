package Multithreading;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Thread obj1 = new Thread() {                   //anonymous inner class
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Thread1");
                }
            }
        };

        Thread obj2 = new Thread() {               //anonymous inner class
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.err.println("Thread 2");
                }
            }
        };
        obj1.start();
        obj2.start();
    }
}

class Example2 {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Second Way to create anonymous inner class in Thread");
                }
            }
        }.start();
    }
}

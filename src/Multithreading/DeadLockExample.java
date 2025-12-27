package Multithreading;

public class DeadLockExample {

    public static void main(String[] args) {

        DeadLockExample ob1 = new DeadLockExample();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (ob1) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 1");
                    }
                    try {
                        ob1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (ob1) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 2");
                    }
                    ob1.notify();
//                    try {
//                        ob1.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}

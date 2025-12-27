package Multithreading;

public class DeadLockUsingWaitMethod {

    static String name1 = "Java";
    static boolean name2 = false;


    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                synchronized (name1) {
                    if (!name2) {
                        try {
                            System.out.println("Thread-1 waiting");
                            name1.wait();
                        } catch (InterruptedException e) {
                        }
                    }
                    System.out.println("Thread-1 running");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                synchronized (name1) {
                    name2
                            = true;
                    name1.notify(); // happens before t1 waits
                    System.out.println("Thread-2 notified");
                }
            }
        });

        t2.start();
        t1.start();
    }
}


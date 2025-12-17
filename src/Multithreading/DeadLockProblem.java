package Multithreading;

class DeadLock {
    final String name="Aviansh";
    synchronized void method1(DeadLock ob) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is method1 executing");
        ob.method1(this);
    }

    synchronized void method2(DeadLock ob) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is method2 executing");
        ob.method2(this);
    }
}

public class DeadLockProblem {

    public static void main(String[] args) {
        final DeadLock ob = new DeadLock();

        final DeadLock ob1 = new DeadLock();

        Thread t1 = new Thread() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(6000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                ob.method2(ob1);
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                ob1.method1(ob);
            }
        };

        t1.start();
        t2.start();
    }
}

package Multithreading;

class Task11 {
    synchronized void task11(Task22 ob) {
        System.out.println("Thread 1 is calling task11()");
        ob.last();
    }

    synchronized void last() {
        System.out.println("Inside of last method of task 1");
    }
}

class Task22 {
    synchronized void task22(Task11 ob1) {
        System.out.println("Thread 2 is calling task22()");
        ob1.last();
    }

    synchronized void last() {
        System.out.println("Inside of last method of task 2");
    }
}

public class DeadLockTask extends Thread {
    Task11 t1 = new Task11();
    Task22 t2 = new Task22();

    void m1() {
        this.start();
        t1.task11(t2);
    }

    @Override
    public void run() {
        t2.task22(t1);
    }

    public static void main(String[] args) {
        DeadLockTask ob = new DeadLockTask();
        ob.m1();
    }
}

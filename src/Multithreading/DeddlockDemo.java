package Multithreading;

class Task1 {
    public synchronized void task1(Task2 t2) {
        System.out.println("Therad 1 is calling task1() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println("Thread 1 is try to call last() method of task2");
        t2.last();
    }

    public synchronized void last() {
        System.out.println("Inside of last method of task 1");
    }
}

class Task2 {
    public synchronized void task2(Task1 t1) {
        System.out.println("Thread 2 is calling task 2() method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        System.out.println("Thread2 is call to last() of task 1");
        t1.last();
    }

    public synchronized void last() {
        System.out.println("Inside of last() of task 2");
    }
}

public class DeddlockDemo extends Thread {
    Task1 t1 = new Task1();
    Task2 t2 = new Task2();

    public void m1() {
        this.start();
        t1.task1(t2);
    }

    @Override
    public void run() {
        t2.task2(t1);
    }

    public static void main(String[] args) {
        DeddlockDemo dld = new DeddlockDemo();
        dld.m1();
    }
}

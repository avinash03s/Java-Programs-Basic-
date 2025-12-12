package Multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 20000; i++) {
            System.out.println("Child Thread-1");
        }
    }
}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <= 20000; i++) {
            System.err.println("Child Thread-2");
        }
    }
}

public class FirstWayCreateTread {
    public static void main(String[] args) {
        MyThread ob = new MyThread();
        ob.start();
        MyThread1 ob1 = new MyThread1();
        ob1.start();
    }
}

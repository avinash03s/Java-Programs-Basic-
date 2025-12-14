package Multithreading;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("user Thread");
        }
    }
}

public class FirstWayCreateTread {
    public static void main(String[] args) {
        MyThread ob = new MyThread();
        ob.start();


        for (int i = 0; i < 10; i++) {
            System.err.println("Main Thread");
        }

    }
}

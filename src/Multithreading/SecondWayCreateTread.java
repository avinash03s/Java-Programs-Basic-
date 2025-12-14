package Multithreading;

public class SecondWayCreateTread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("User Define Thread");
        }
    }
}

class MainThread {
    public static void main(String[] args) {
        SecondWayCreateTread ob = new SecondWayCreateTread();

        Thread t = new Thread(ob);
        t.start();

        for (int i = 0; i < 4; i++) {
            System.err.println("Main Thread");
        }
    }
}

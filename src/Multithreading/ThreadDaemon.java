package Multithreading;

class Daemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello ");
        }
    }
}

public class ThreadDaemon {

    public static void main(String[] args) {
        Daemon obj1 = new Daemon();
        obj1.setDaemon(true);//obj1 is a daemon Thread (like GC ) now

        Daemon daemon = new Daemon();
        daemon.start();//user Thread;
        obj1.start();
        System.out.println("Main Thread");
    }
}

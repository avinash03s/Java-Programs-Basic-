package Multithreading;

class TotalEarning extends Thread {

    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notifyAll();
        }
    }
}

public class MovieBookApp {

    public static void main(String[] args) throws InterruptedException {
        TotalEarning ob = new TotalEarning();
        ob.start();


        synchronized (ob) {
            ob.wait();
            System.out.println("Total Earning : " + ob.total);
        }
    }
}

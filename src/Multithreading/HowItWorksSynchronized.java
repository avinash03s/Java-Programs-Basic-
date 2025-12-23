package Multithreading;

class SynchronizedWork extends Thread {
    int count = 0;

//    @Override
//    public void run() {
//        count++;
//        System.out.println(count);
//    }
}

public class HowItWorksSynchronized {

    public static void main(String[] args) {
        SynchronizedWork thread1 = new SynchronizedWork();
        thread1.start();

        SynchronizedWork thread2 = new SynchronizedWork();
        thread2.start();
    }
}

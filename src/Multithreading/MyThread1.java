package Multithreading;
class World extends Thread{

    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class MyThread1 {

    public static void main(String[] args) throws InterruptedException {
        World obj = new World();
        System.out.println(obj.getState());

        obj.start();
        System.out.println(obj.getState());

        Thread.sleep(200);
        System.out.println(obj.getState());

        obj.join();
        System.out.println(obj.getState());
    }
}

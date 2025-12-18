package Multithreading;

class Yield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+ " is running...");
            Thread.yield();
        }
    }
}
public class YieldMethodUse {

    public static void main(String[] args) {
        Yield obj1 = new Yield();
        Yield obj2 = new Yield();
        obj1.start();
        obj2.start();
    }
}

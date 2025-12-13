package Multithreading;

import java.util.concurrent.Executor;

public class ThreadYield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            Thread.yield();
            System.out.println("Child Thread");
        }
    }
}
class MainThreadYield{
    public static void main(String[] args) {
        ThreadYield ob= new ThreadYield();
        ob.start();
        System.out.println("Commiting code to github");
        for (int i = 0; i < 5;i++){
            System.err.println("Main Thread");
        }
    }
}

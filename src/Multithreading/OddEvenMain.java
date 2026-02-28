package Multithreading;

class Odd extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println("Even : " + i);
                Thread.yield();
            }else {
                System.out.println("Odd : " + i);
            }
        }
    }
}
class Even extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println("Even : " + i);
                Thread.yield();
            }else {
                System.out.println("Odd : " + i);
            }
        }
    }
}

public class OddEvenMain {
    public static void main(String[] args) {
        Odd ob = new Odd();
        ob.start();

        /// printing odd even number 1 to 20;
        Even ob1 = new Even();
        ob1.start();
    }
}

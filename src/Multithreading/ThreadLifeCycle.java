package Multithreading;

public class ThreadLifeCycle extends Thread {

    public static void main(String[] args) {
        ThreadLifeCycle ob = new ThreadLifeCycle();//New
        ob.start();//Runnable State

        ob.stop();//Dead State

    }

    @Override
    public void run() {
        //Running State
        for (int i = 0; i < 5; i++){
            System.out.println("Thread-1");
        }
    }
}

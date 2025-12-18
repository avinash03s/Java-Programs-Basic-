package Multithreading;

class DeadThread extends Thread {

    @Override
    public void run() {
        start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Dead Thread Calling..");
        }
    }
}

public class CallingDeadThread {

    public static void main(String[] args) throws InterruptedException {
        DeadThread ob = new DeadThread();

        ob.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread");
        }
    }

}
/*
* What happens on calling start() method on dead thread or calling that method twice?
• throw new IllegalThreadStateException()
• Internally Thread status will be maintained by 'threadStatus' variable.
• On calling start() and after creation of thread its value will changed to 5 or non-zero value.
• Now if we call start() on same Thread object and if threadStatus value is !=0 then
IllegalThreadStateException will be thrown. */

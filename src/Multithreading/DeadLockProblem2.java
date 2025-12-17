package Multithreading;

class Resource {
    String name;

    Resource(String name) {
        this.name = name;
    }
}

public class DeadLockProblem2 {

    public static void main(String[] args) {
        Resource obj1 = new Resource("Pen");
        Resource obj2 = new Resource("Paper");

        Thread t1 = new Thread(() -> {
            synchronized (obj1) {
                System.out.println("Thread-1 locked Pen");

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

                synchronized (obj2) {
                    System.out.println("Thread-2 locked paper");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (obj2) {
                System.out.println("Thread-2 locked Pen");
            }

            try {
                Thread.sleep(100);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            synchronized (obj1) {
                System.out.println("Thread-1 locked paper");
            }
        });

        t1.start();
        t2.start();
    }

}

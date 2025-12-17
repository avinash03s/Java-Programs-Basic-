package Multithreading;

class Shared {
    int i;

    void sharMethod() {
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }
}

public class ThreadInJava {

    public static void main(String[] args) {
        final Shared obj = new Shared();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                obj.sharMethod();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj.sharMethod();
            }
        };

        t1.start();
        t2.start();

    }
}

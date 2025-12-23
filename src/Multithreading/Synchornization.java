package Multithreading;

public class Synchornization implements Runnable{

    @Override
    public void run() {
        synchronized (this){
            try {
                for (int i = 0; i < 4; i++){
                    System.out.println("Index No: "+ i +" "+Thread.currentThread().getName());
                }
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Synchornization ob = new Synchornization();


        Thread t1 = new Thread(ob);
        t1.setName("Avinash");

        Thread t2 = new Thread(ob);
        t2.setName("Rama");

        Thread t3 = new Thread(ob);
        t3.setName("Hitman");

        t1.start();
        t2.start();
        t3.start();

//        Synchornization ob1 = new Synchornization();
//        Synchornization ob2 = new Synchornization();
//
//        Thread t1 = new Thread(ob);
//        t1.setName("Avinash");
//
//        Thread t2 = new Thread(ob1);
//        t2.setName("Rama");
//
//        Thread t3 = new Thread(ob2);
//        t3.setName("Hitman");
//
//        t1.start();
//        t2.start();
//        t3.start();


    }
}


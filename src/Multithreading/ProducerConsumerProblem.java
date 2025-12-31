package Multithreading;

import java.util.LinkedList;

public class ProducerConsumerProblem {

    public static void main(String[] args) throws InterruptedException {
        //same ob for Two Thread
        final ProducerConsumer ob = new ProducerConsumer();

        //producer
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob.producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //consumer
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    ob.consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        //Thread 1 run before Thread 2;
        t1.join();
        t2.join();
    }

    static class ProducerConsumer {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 5;

        void producer() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    if (list.size() == capacity) {
                        System.out.println("List is full ");
//                        notify();
                        wait();
                    }

                    list.add(value);
                    System.out.println("Producer Produce - " + value);
                    value++;

                    notify();

                    Thread.sleep(1000);
                }
            }
        }

        void consumer() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    if (list.size() == 0) {
                        System.out.println("List is Empty , Consumer is Waiting..");
//                        notify();
                        wait();
                    }

                    int val = list.removeFirst();
                    System.out.println("Consumer consumed-" + val);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }
    }
}

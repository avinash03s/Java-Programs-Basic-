package Multithreading;

public class AnonymousInnerClassRunnable {

    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("First Thread");
                }
            }
        };
        Runnable obj2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Second Thread");
                }
            }
        };

        Thread ob = new Thread(obj1);
        Thread ob1 = new Thread(obj2);
        ob.start();
        ob1.start();
    }
}
// using Runnable Interface to create "Anonymous Inner class" in Thread;
class SecondExample{

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 100;  i++){
                    System.err.println("using Runnable Interface to create \"Anonymous Inner class\" in Thread;");
                }
            }
        }).start();
    }
}